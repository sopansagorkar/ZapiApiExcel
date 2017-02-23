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

	static {
		allSheetList = ReadExcel.getExcelPojo("src/main/resources/inputData.xlsx");
	}

	public static void main(String[] args) {

		for (int i = 0; i < allSheetList.size(); i++) {
			JSONObject jsonData = getVersionIdByName(allSheetList.get(i).get(i));
			CyclePojo cyclePojo = new CyclePojo();
			cyclePojo.setVersionID(jsonData.get("id").toString());
			cyclePojo.setProjectId(jsonData.get("projectId").toString());
			String cloneCycleID = getCycleDetails(cyclePojo, allSheetList.get(i).get(i));
			cyclePojo.setCloneCycleID(cloneCycleID);
			String cName = createCycle(cyclePojo, allSheetList.get(i).get(i));
			for (int j = 0; j < allSheetList.get(i).size(); j++) {

				getExecutionId(allSheetList.get(i).get(j), cName, cyclePojo);
			}
		}

	}

	public static MultivaluedMap<String, Object> authorization() {
		MultivaluedMap<String, Object> map = new MultivaluedHashMap<String, Object>();
		map.add("Authorization", "Basic c29wYW5zYTpEQmtvb3BlckAwMDc=");
		return map;
	}

	private static JSONObject getVersionIdByName(ExcelPojo excelPojo) {

		String[] parts = excelPojo.getIssueKey().split("-");
		String projectKey = parts[0];
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://jira-agile.cybage.com/rest/api/2/project/" + projectKey + "/versions")
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
		Response response = client.target(
				"http://jira-agile.cybage.com/rest/zapi/latest/cycle?versionId=" + cyclePojo.getVersionID() + "")
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
		cal.set(Calendar.MONTH, (cal.get(Calendar.MONTH) + 6));
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
		Response response = client.target("http://jira-agile.cybage.com/rest/zapi/latest/cycle")
				.request(MediaType.APPLICATION_JSON).headers(authorization()).post(payload);
		System.out.println(response);
		System.out.println("Cycle " + excelPojo.getCycleName() + "_" + new Date() + " Created successfully");
		return cycleName;

	}

	private static String getExecutionId(ExcelPojo excelPojo, String cName, CyclePojo cyclePojo) {
		String key = excelPojo.getIssueKey();
		// http://jira-agile.cybage.com/rest/zapi/latest/execution?cycleId=5
		String respName = null;
		Client client = ClientBuilder.newClient();
		Response response = client.target(
				"http://jira-agile.cybage.com/rest/zapi/latest/cycle?versionId=" + cyclePojo.getVersionID() + "")
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).get();
		String res = response.readEntity(String.class);
		JSONObject newJSONObj = (JSONObject) JSONSerializer.toJSON(res);
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
				if (respName.equals(cName)) {
					break;
				}
			}
		}
		return respName;

	}
	public static void executeTest() {

	}

}
