package com.zapi.rest;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import com.zapi.vo.StatusVO;
import com.zapi.vo.ExecutionVO;
import com.zapi.config.Configuration;
import com.zapi.vo.ExecutionResponseVO;
import com.sun.jersey.api.client.Client;
import com.zapi.rest.client.ZapiRestClient;
import org.codehaus.jackson.map.ObjectMapper;
import com.sun.jersey.api.client.GenericType;
import com.google.common.collect.ImmutableMap;
import com.sun.jersey.api.client.ClientRequest;
import com.zapi.rest.client.ZapiRestClient.Util;
import com.sun.jersey.api.client.ClientResponse;
import static com.zapi.rest.client.ZapiRestClient.*;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.api.client.config.ClientConfig;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.StringUtils;



public class ZapiRestHelper {
	private final Configuration objConfig;
	private final Client client;
	String zapiInfo;
	String updateResponse;
	
	public ZapiRestHelper(Configuration objConfig){
		
		this.objConfig=objConfig;
		ClientConfig objClient=new DefaultClientConfig();
		objClient.getClasses().add(JacksonJsonProvider.class);
		client=Client.create(objClient);
		final HTTPBasicAuthFilter authFilter=new HTTPBasicAuthFilter(objConfig.getUserName(), objConfig.getPassword());
		client.addFilter(authFilter);
		client.addFilter(new ClientFilter() {
			
			private ArrayList<Object> objCookie;
			@Override
			public ClientResponse handle(ClientRequest request)throws ClientHandlerException{
				if(objCookie!=null)
					request.getHeaders().put("Cookie", objCookie);
				
				ClientResponse response=getNext().handle(request);
				if(response.getCookies()!=null)
					if(objCookie==null)
						objCookie=new ArrayList<Object>();
				
				objCookie.addAll(response.getCookies());
				return response;
			}
		});
		zapiInfo=ZapiRestClient.systemInfo(client, objConfig.getZapiUrl()).getAsJson(String.class);
		client.removeFilter(authFilter);
	}
	
	public void executeTest(Integer cycleId,Integer testCaseId,String result,String stachTrace) throws JsonGenerationException, JsonMappingException, IOException{
		Execution executionService=execution(client,objConfig.getZapiUrl());
		ExecutionResponseVO executionRespone=executionService.getAsJson(testCaseId,null,null,cycleId,0,null,null,ExecutionResponseVO.class);
		
        ExecutionVO executionObj;
        if(executionRespone!=null && executionRespone.recordsCount>0){
        	executionObj=executionRespone.executions.get(0);
        }
        else{
        	executionObj=new ExecutionVO(result, cycleId, objConfig.getProjectId(), objConfig.getVersionId(), testCaseId.toString(), stachTrace);
        	Map<String, ExecutionVO> executionVoMap=executionService.postJson(executionObj, new GenericType<Map<String,ExecutionVO>>(){
        		
        	});
        	executionObj=executionVoMap.entrySet().iterator().next().getValue();
        }
        executionObj.executionStatus=result;
        stachTrace=StringUtils.substring(stachTrace, 0,750);
        Map<String, String> updateValues=ImmutableMap.<String, String>of("status", result, "comment", stachTrace);
        updateResponse=executionService.idExecute(executionObj.id).putJson(new ObjectMapper().writeValueAsString(updateValues), String.class);
        
        
        	
	}
	public List<StatusVO> getExecutionStatuses(){
        Util.TestExecutionStatus statusUtil = util(client, objConfig.getZapiUrl()).testExecutionStatus();
        List<StatusVO> value = statusUtil.getAsJson(new GenericType<List<StatusVO>>() {
        });
        
        return value;
    }
	public List<StatusVO> getStepStatuses(){
        Util.TeststepExecutionStatus statusUtil = util(client, objConfig.getZapiUrl()).teststepExecutionStatus();
        List<StatusVO> value = statusUtil.getAsJson(new GenericType<List<StatusVO>>() {        	
        });
        return value;
    }

}

