package com.zapi.client;

import java.io.File;
import java.util.Map;
import java.util.List;
import java.util.Locale;
import java.io.IOException;
import java.util.ArrayList;
import com.zapi.vo.StatusVO;
import java.util.Properties;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.json.JSONException;
import java.io.FileInputStream;
import net.sf.json.JSONSerializer;
import com.zapi.rest.ZapiRestHelper;
import com.zapi.config.Configuration;
import java.io.FileNotFoundException;
import com.sun.jersey.core.util.Base64;
import com.sun.jersey.api.client.Client;
import javax.naming.AuthenticationException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.ClientResponse;
import org.apache.maven.reporting.MavenReportException;
import com.sun.jersey.api.client.ClientHandlerException;
import org.apache.maven.plugins.surefire.report.ReportTestCase;
import org.apache.maven.plugins.surefire.report.ReportTestSuite;
import org.apache.maven.plugins.surefire.report.SurefireReportParser;
import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.StringUtils;


public class MyClient
{
	static String auth;
	static int count=0;
	static Integer cycleIdInt;            
	static String status;
	static String upStatus;
	static String projectId;	
	static String url;
	static String revUrl ;
	static String username;
	static String password;
	static String versionId;
	static String filePath;
	static File objFile;
	static String mainCycleId;
	static Locale locale = Locale.ENGLISH;
	String[] fileNames;
	
	public static void main (String args[]) throws FileNotFoundException, IOException, MavenReportException, JSONException, AuthenticationException, ClientHandlerException 
	{	
		MyClient objClient=new MyClient();
		objClient.setMessage();	
		objClient.findOrAddTestcase();
		objClient.executeReport(locale);
	}
	public String mapToString(Map<String, Object> failures)
	{
		 StringBuilder  failureString = new StringBuilder ();
	        for(Map.Entry<String, Object> failure : failures.entrySet())
	        {
	            failureString.append(failure.getKey()).append(":").append(failure.getValue()).append("\n");
	        }
	        return failureString.toString();
	}
	public void setMessage() throws FileNotFoundException, IOException 
	{
		Properties objProperties =new Properties();
		objProperties.load(new FileInputStream("user.properties"));
		url=objProperties.getProperty("url");
		username=objProperties.getProperty("username");
		password=objProperties.getProperty("password");
		versionId=objProperties.getProperty("versionId");
		filePath=objProperties.getProperty("filePath");
		String idPassword=username+":"+password;
		auth=new String(Base64.encode(idPassword));
		revUrl=url+"rest/zapi/latest/cycle?versionId="+versionId;
		objFile=new File(filePath);
		fileNames= objFile.list();
	}
	public void executeReport(Locale locale) throws MavenReportException, JSONException, IOException, AuthenticationException, ClientHandlerException 
	{
			Configuration objConfig=new Configuration(url,username,password,1,projectId,versionId);
			ZapiRestHelper zapiHelper=new ZapiRestHelper(objConfig);
			List<File> objReport=getReportsDirectories();
	//
			
			SurefireReportParser report=new SurefireReportParser(objReport, locale);
			List<ReportTestSuite> objSuites=report.parseXMLReportFiles();
			List<StatusVO> objStatus=zapiHelper.getExecutionStatuses(); 
			
			StatusVO passStatus = null,failStatus=null;
			
			for(StatusVO statuses:objStatus)
			{
				if(StringUtils.contains(statuses.name, "FAIL"))
					failStatus=statuses;
				if(StringUtils.contains(statuses.name, "PASS"))
					passStatus=statuses;
			}
			
			for(ReportTestSuite suite:objSuites)
			{
				for(ReportTestCase objTest: suite.getTestCases())
				{
					Integer testCaseId=findOrAddTestcase();
					String statusId=(objTest.getFailure()!=null && objTest.getFailure().size()>0)? failStatus.id :passStatus.id;
					String comments=(objTest.getFailure()!=null && objTest.getFailure().size()>0 )? mapToString(objTest.getFailure()):"Successfully executed in"+objTest.getTime()+"sec";
					//above code can be replaced by reading excel
					
					zapiHelper.executeTest(cycleIdInt, testCaseId, statusId, comments);
					System.out.println("final testcaseid = "+testCaseId);
					
				}
			}
				 if (objReport == null) 
				 {
			            return;
			     }
				 
	}
	public Integer findOrAddTestcase() throws AuthenticationException, ClientHandlerException, FileNotFoundException, IOException 
	{
		String objResponse=invokeGetMethod(auth, revUrl);
		
 		
 		Properties objProperties=new Properties();
 		objProperties.load(new FileInputStream("user.properties"));
 		mainCycleId=objProperties.getProperty("cycleID");
		int cycleId=Integer.parseInt(mainCycleId);
		Integer testIdid = null;
		status=String.valueOf(cycleId);
		upStatus="executions";
		JSONObject objJSON=(JSONObject) JSONSerializer.toJSON(objResponse);
		if(objJSON.has(status))
			cycleIdInt=Integer.parseInt(status);
		
		JSONObject sum=objJSON.getJSONObject(status);
		int upProjectId=(Integer)sum.get("projectId");
		projectId=Integer.toString(upProjectId);
		String updatedUrl=url+"rest/zapi/latest/execution?cycleId="+cycleIdInt+"&projectId="+projectId+"&versionId="+versionId;
		
		String newResponse=invokeGetMethod(auth, updatedUrl);
		JSONObject newJSONObj=(JSONObject) JSONSerializer.toJSON(newResponse);
		if(newJSONObj.has(upStatus))
		{
			JSONArray objJSONArray=newJSONObj.getJSONArray(upStatus);
			System.out.println("objJSONArray.size() = "+objJSONArray.length()+" obj = "+objJSONArray);
			for (int i = objJSONArray.length()-1; i >=count ; i--) 
			{
				JSONObject jsonData=objJSONArray.getJSONObject(i);
				jsonData.get("issueId");
				//if issue_key=issue_id       
				testIdid=(Integer) jsonData.get("issueId");
				//mapping of issue key with issue id
				System.out.println(testIdid);
			}
		}
		count=count+1;
		return testIdid;
		
	}
	public  List<File> getReportsDirectories() 
	{ 
		  List<File> reportsDirectoryList = new ArrayList<File>();
	        if (objFile != null)
	        {
	            reportsDirectoryList.add(objFile);
	        }
	        
	        
	   return reportsDirectoryList;
	}
	public  String invokeGetMethod(String auth, String url) throws AuthenticationException, ClientHandlerException 
	{
	      Client client = Client.create();
	      WebResource webResource = client.resource(url);
	      ClientResponse response = webResource.header("Authorization", "Basic " + auth).type("application/json").accept("application/json").get(ClientResponse.class);
	      int statusCode = response.getStatus();
	      if (statusCode == 401) {
	          throw new AuthenticationException("Invalid Username or Password");
	      }
	     
	      return response.getEntity(String.class);
	  }

}
