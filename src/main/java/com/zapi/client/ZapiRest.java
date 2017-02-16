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
import com.zapi.pojo.ExcelPojo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class ZapiRest {
	static int count = 0;
	static String respName;
	static String respVersion;
	static String projectKey;
	static String versionId;
	static String projectId;
	static String cloneCycleId;
	static ArrayList<String> cycleList = new ArrayList<String>();

	public static void main(String[] args) {
		ArrayList<ArrayList<ExcelPojo>> allSheetList = ReadExcel.getExcelPojo("src/main/resources/inputData.xlsx");
		// System.out.println("Number of sheets are --> " +
		// allSheetList.size());
		for (int i = 0; i < allSheetList.size(); i++) {
			// System.out.println("Sheet Number " + (i + 1) + "has " +
			// allSheetList.get(i).size() + " records");

		}
		getVersionIdByName((allSheetList.get(0).get(0).getVersion().toString()), allSheetList.get(0).get(0).getIssueKey().toString());

	}

	public static MultivaluedMap<String, Object> authorization() {
		MultivaluedMap<String, Object> map = new MultivaluedHashMap<String, Object>();
		map.add("Authorization", "Basic c29wYW5zYTpnb2xkYmVyZ0AwMDc=");
		return map;
	}

	private static void getVersionIdByName(String version, String issueKey) {
		String[] parts = issueKey.split("-");
		projectKey = parts[0];
		Client client = ClientBuilder.newClient();
		Response response = client.target("http://jira-agile.cybage.com/rest/api/2/project/" + projectKey + "/versions")
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).get();
		String res = response.readEntity(String.class);
		JSONArray jsonArray = (JSONArray) JSONSerializer.toJSON(res);
		for (int i = jsonArray.length() - 1; i >= count; i--) {
			JSONObject jsonData = jsonArray.getJSONObject(i);
			String name = jsonData.get("name").toString();
			if (version.equals(name.toString().trim())) {
				versionId = jsonData.get("id").toString();
				System.out.println(versionId);
			}

		}
	}

	private static void getDetails(String cycle, String version) {
		Client client = ClientBuilder.newClient();
		Response response = client
				.target("http://jira-agile.cybage.com/rest/zapi/latest/cycle?versionId=" + versionId + "")
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).get();
		String res = response.readEntity(String.class);
		JSONObject newJSONObj = (JSONObject) JSONSerializer.toJSON(res);
		for (int i = 0; i < newJSONObj.length(); i++) {
			if (newJSONObj.keys().hasNext()) {
				cycleList.add(newJSONObj.names().get(i).toString());
			}
			if (newJSONObj.has(cycleList.get(i))) {
				if (cycleList.get(i).equals("recordsCount"))
					continue;
				JSONObject jsonObject = newJSONObj.getJSONObject(cycleList.get(i));
				respName = jsonObject.get("name").toString();
			}
		}

	}

	public static void createCycle(String cyclePrefix) {
		Client client = ClientBuilder.newClient();
		String jsonstr = "{  \"clonedCycleId\":\"" + cloneCycleId + "\" ,  \"name\": \"" + cyclePrefix + "" + "_"
				+ new Date()
				+ "\",  \"build\": \"\",  \"environment\": \"\",  \"description\": \"Cycle created by Rest\",  \"startDate\": \"4/Feb/17\",  \"endDate\": \"28/Feb/17\",  \"projectId\": \""
				+ projectId + "\",  \"versionId\": \"" + versionId + "\" }";
		System.out.println("json str  " + jsonstr);
		Entity<String> payload = Entity.json(jsonstr);
		Response request = client.target("http://jira-agile.cybage.com/rest/zapi/latest/cycle")
				.request(MediaType.APPLICATION_JSON).headers(authorization()).post(payload);
		System.out.println(request.getStatus());
		System.out.println(request.readEntity(String.class));

	}

	public static void executeTest() {

	}

}
