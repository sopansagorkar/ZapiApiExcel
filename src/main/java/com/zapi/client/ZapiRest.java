package com.zapi.client;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import com.zapi.config.PropertyReader;
import com.zapi.excel.ReadExcel;
import com.zapi.pojo.CyclePojo;
import com.zapi.pojo.ExcelPojo;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class ZapiRest {
	static int count = 0;
	static String respVersion;
	static String versionId;
	static String projectId;
	static ArrayList<ArrayList<ExcelPojo>> allSheetList;

	public static void main(String[] args) {
		PropertyReader.propReader();
		allSheetList = ReadExcel.getExcelPojo(PropertyReader.excelPath);
		for (int i = 0; i < allSheetList.size(); i++) {
			JSONObject jsonData = getVersionIdByName(allSheetList.get(i).get(1));
			CyclePojo cyclePojo = new CyclePojo();
			cyclePojo.setVersionID(jsonData.get("id").toString());
			cyclePojo.setProjectId(jsonData.get("projectId").toString());
			String cloneCycleID = getCycleDetails(cyclePojo, allSheetList.get(i).get(i));
			cyclePojo.setCloneCycleID(cloneCycleID);
			String cName = createCycle(cyclePojo, allSheetList.get(i).get(i));

			for (int j = 0; j < allSheetList.get(i).get(i).getRowCount(); j++) {
				String executionId = getExecutionId(allSheetList.get(i).get(j), cName);
				executeTest(allSheetList.get(i).get(j), executionId);

			}
		}

	}

	private static void executeTest(ExcelPojo excelPojo, String executionId) {
		String status = excelPojo.getResult();
		int statusId = 0;
		switch (status) {
		case "Pass":
			statusId = 1;
			break;
		case "Fail":
			statusId = 2;
			break;
		case "WIP":
			statusId = 3;
			break;
		case "BLOCKED":
			statusId = 4;
			break;
		case "UNEXECUTED":
			statusId = 5;
			break;
		default:
			break;
		}
		Entity payload = Entity.json("{  \"status\":\"" + statusId + "\"}");
		Client client = ClientBuilder.newClient();
		Response response = client.target(PropertyReader.url + "rest/zapi/latest/execution/" + executionId + "/execute")
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).put(payload);
		String res = response.readEntity(String.class);
		System.out.println(res);
	}

	public static MultivaluedMap<String, Object> authorization() {
		PropertyReader.propReader();
		String auth=PropertyReader.userName+":"+PropertyReader.password;
		MultivaluedMap<String, Object> map = new MultivaluedHashMap<String, Object>();
		map.add("Authorization", auth);
		return map;
	}

	private static JSONObject getVersionIdByName(ExcelPojo excelPojo) {

		String[] parts = excelPojo.getIssueKey().split("-");
		String projectKey = parts[0];
		Client client = ClientBuilder.newClient();
		Response response = client.target(PropertyReader.url + "rest/api/2/project/" + projectKey + "/versions")
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).get();
		String res = response.readEntity(String.class);
		JSONArray jsonArray = (JSONArray) JSONSerializer.toJSON(res);
		String versioName = null;
		JSONObject jsonData = null;
		for (int i = jsonArray.length() - 1; i >= count; i--) {
			jsonData = jsonArray.getJSONObject(i);
			versioName = jsonData.get("name").toString();
			if (versioName.equals(excelPojo.getVersion())) {

				break;
			}

		}
		return jsonData;
	}

	private static String getCycleDetails(CyclePojo cyclePojo, ExcelPojo excelPojo) {
		Client client = ClientBuilder.newClient();
		Response response = client
				.target(PropertyReader.url + "rest/zapi/latest/cycle?versionId=" + cyclePojo.getVersionID() + "")
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).get();
		String res = response.readEntity(String.class);
		JSONObject newJSONObj = (JSONObject) JSONSerializer.toJSON(res);
		String cloneCycleId = null;
		String respName = null;
		ArrayList<String> cycleList = new ArrayList<String>();
		for (int i = 0; i < newJSONObj.length(); i++) {
			if (newJSONObj.keys().hasNext()) {
				cycleList.add(newJSONObj.names().get(i).toString());
			}
			if (newJSONObj.has(cycleList.get(i))) {
				if (cycleList.get(i).equals("recordsCount"))
					continue;
				JSONObject jsonObject = newJSONObj.getJSONObject(cycleList.get(i));
				respName = jsonObject.get("name").toString();
				if (respName.equals(excelPojo.getCycleName())) {
					cloneCycleId = cycleList.get(i);
					break;
				}
			}
		}
		return cloneCycleId;

	}

	public static String createCycle(CyclePojo cyclePojo, ExcelPojo excelPojo) {
		SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MMM/yy");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		cal.set(Calendar.MONTH, (cal.get(Calendar.MONTH) + 1));
		Date end = cal.getTime();
		String endDate = sdfDate.format(end);
		String cycleName = excelPojo.getCycleName() + "_" + new Date();
		Client client = ClientBuilder.newClient();
		String jsonstr = "{  \"clonedCycleId\":\"" + cyclePojo.getCloneCycleID() + "\" ,  \"name\": \"" + cycleName
				+ "\",  \"build\": \"\",  \"environment\": \"\",  \"description\": \"Cycle created by Rest\",  \"startDate\": \""
				+ strDate + "\",  \"endDate\": \"" + endDate + "\",  \"projectId\": \"" + cyclePojo.getProjectId()
				+ "\",  \"versionId\": \"" + cyclePojo.getVersionID() + "\" }";
		System.out.println("json str  " + jsonstr);
		Entity<String> payload = Entity.json(jsonstr);
		Response response = client.target(PropertyReader.url + "rest/zapi/latest/cycle")
				.request(MediaType.APPLICATION_JSON).headers(authorization()).post(payload);
		System.out.println(response);
		System.out.println("Cycle " + excelPojo.getCycleName() + "_" + new Date() + " Created successfully");
		return cycleName;

	}

	private static String getExecutionId(ExcelPojo excelPojo, String cName) {
		// http://jira-agile.cybage.com/rest/zapi/latest/execution?cycleId=5
		String issueId = null;
		Client client = ClientBuilder.newClient();
		Response response = client.target(PropertyReader.url + "rest/api/2/issue/" + excelPojo.getIssueKey())
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).get();
		String res = response.readEntity(String.class);
		JSONObject newJSONObj = (JSONObject) JSONSerializer.toJSON(res);
		issueId = newJSONObj.get("id").toString();
		Response response2 = client.target(PropertyReader.url + "rest/zapi/latest/execution?issueId=" + issueId)
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).get();
		String res2 = response2.readEntity(String.class);
		JSONObject newJSONObj1 = (JSONObject) JSONSerializer.toJSON(res2);
		String executionId = null;
		String cycleName = null;
		JSONArray jsonArray = null;
		JSONObject jsonData = null;
		for (int i = newJSONObj1.length() - 1; i >= count; i--) {
			jsonArray = (JSONArray) JSONSerializer.toJSON(newJSONObj1.getJSONArray("executions"));
			for (int i1 = jsonArray.length() - 1; i1 >= count; i1--) {
				jsonData = jsonArray.getJSONObject(i1);
				cycleName = jsonData.get("cycleName").toString();
				if (cycleName.equals(cName)) {
					executionId = jsonData.get("id").toString();
					break;
				}

			}

		}

		return executionId;

	}

}
