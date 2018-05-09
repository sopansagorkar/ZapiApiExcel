package com.cybage.zapi.client;

import java.util.Date;
import java.util.logging.Logger;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.cybage.zapi.config.PropertyReader;
import com.cybage.zapi.pojo.CyclePojo;
import com.cybage.zapi.pojo.TestCaseDataPojo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import java.text.SimpleDateFormat;
import javax.ws.rs.core.MediaType;
import net.sf.json.JSONSerializer;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MultivaluedHashMap;

/**
 * @author Sopan Sagorkar
 *
 */
public class ZapiRest {
	static int count = 0;
	static String respVersion;
	static String versionId;
	static String projectId;
	static String projectKey;
	static String cName;
	static ArrayList<String> executionIDList;
	static String executionId;
	static int listIndex = 0;
	static int flag;
	static String authBase;
	static Logger logger = Logger.getLogger(ZapiRest.class.getName());

	public static void updateTestCases(TestCaseDataPojo testCaseDataPojo) {
		PropertyReader.propReader();
		executionIDList = new ArrayList<String>();
		JSONObject jsonData = getVersionIdByName(testCaseDataPojo.getVersion(), testCaseDataPojo.getTestCaseID());
		CyclePojo cyclePojo = new CyclePojo();
		cyclePojo.setVersionID(jsonData.get("id").toString());
		cyclePojo.setProjectId(jsonData.get("projectId").toString());
		String cloneCycleID = getCycleDetails(cyclePojo, testCaseDataPojo);
		cyclePojo.setCloneCycleID(cloneCycleID);
		if (flag == 0) {
			cName = createCycle(cyclePojo, testCaseDataPojo);
		}
		executionId = getExecutionId(testCaseDataPojo.getTestCaseID(), cName);
		executeTest(testCaseDataPojo.getStatus(), executionId);
		flag++;
		if (flag == testCaseDataPojo.getTestCount())
			flag = 0;
	}

	@SuppressWarnings("deprecation")
	public static void deleteIssue() {
		String exeId = null;
		Client client = ClientBuilder.newClient();
		JSONObject jsonData = null;
		Response issueResponse = client
				.target(PropertyReader.url + "rest/zapi/latest/zql/executeSearch?zqlQuery=project="
						+ URLEncoder.encode(
								"'" + projectKey + "' AND cycleName='" + cName + "' AND executionStatus='UNEXECUTED'"))
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).get();
		String issueRes = issueResponse.readEntity(String.class);
		JSONObject issueJSONData = (JSONObject) JSONSerializer.toJSON(issueRes);
		JSONArray jsonArray = null;
		for (int i = issueJSONData.length() - 1; i >= 0; i--) {
			jsonArray = (JSONArray) JSONSerializer.toJSON(issueJSONData.getJSONArray("executions"));
			for (int i1 = jsonArray.length() - 1; i1 >= 0; i1--) {
				jsonData = jsonArray.getJSONObject(i1);
				exeId = jsonData.get("id").toString();

			}

		}
		Response deleteRes = client.target(PropertyReader.url + "rest/zapi/latest/execution/" + exeId)
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).delete();
		String delRes = deleteRes.readEntity(String.class);
		System.out.println(delRes);

	}

	private static void executeTest(String status, String executionId) {
		int statusId = 0;
		switch (status) {
		case "PASS":
			statusId = 1;
			break;
		case "FAIL":
			statusId = 2;
			break;
		case "WIP":
			statusId = 3;
			break;
		case "BLOCKED":
			statusId = 4;
			break;
		case "UNEXECUTED":
			statusId = -1;
			break;
		default:
			break;
		}

		Entity<String> payload = Entity.json("{  \"status\":\"" + statusId + "\"}");
		Client client = ClientBuilder.newClient();
		Response response = client.target(PropertyReader.url + "rest/zapi/latest/execution/" + executionId + "/execute")
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).put(payload);
		String res = response.readEntity(String.class);
		System.out.println(res);
	}

	public static MultivaluedMap<String, Object> authorization() {
		PropertyReader.propReader();
		String auth = PropertyReader.userName + ":" + PropertyReader.password;
		try {
			authBase = Base64.getEncoder().encodeToString((auth).getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MultivaluedMap<String, Object> map = new MultivaluedHashMap<String, Object>();
		map.add("Authorization", "Basic " + authBase);
		return map;
	}

	private static JSONObject getVersionIdByName(String version, String testCaseID) {

		String[] parts = testCaseID.split("-");
		projectKey = parts[0];
		Client client = ClientBuilder.newClient();
		Response response = client.target(PropertyReader.url + "rest/api/2/project/" + projectKey + "/versions")
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).get();
		String res = response.readEntity(String.class);
		JSONArray jsonArray = (JSONArray) JSONSerializer.toJSON(res);
		String versionName = null;
		JSONObject jsonData = null;
		for (int i = jsonArray.length() - 1; i >= count; i--) {
			jsonData = jsonArray.getJSONObject(i);
			versionName = jsonData.get("name").toString();
			if (versionName.equals(version)) {

				break;
			}
		}

		return jsonData;
	}

	private static String getCycleDetails(CyclePojo cyclePojo, TestCaseDataPojo testCaseDataPojo) {
		Client client = ClientBuilder.newClient();
		Response response = client
				.target(PropertyReader.url + "rest/zapi/latest/cycle?versionId=" + cyclePojo.getVersionID() + "")
				.request(MediaType.APPLICATION_JSON_TYPE).headers(authorization()).get();
		String res = response.readEntity(String.class);
		JSONObject newJSONObj = (JSONObject) JSONSerializer.toJSON(res);
		String cloneCycleId = null;
		String respName = null;
		ArrayList<String> cycleList = new ArrayList<String>();
		try {
			for (int i = 0; i < newJSONObj.length(); i++) {
				if (newJSONObj.keys().hasNext()) {
					cycleList.add(newJSONObj.names().get(i).toString());
				}
				if (newJSONObj.has(cycleList.get(i))) {
					if (cycleList.get(i).equals("recordsCount"))
						continue;
					JSONObject jsonObject = newJSONObj.getJSONObject(cycleList.get(i));
					respName = jsonObject.get("name").toString();
					if (respName.equals(testCaseDataPojo.getCycleName())) {
						cloneCycleId = cycleList.get(i);
						break;
					}
				}
			}
		} catch (Exception e) {
			logger.info("Cycle not found" + e.getMessage());
		}
		return cloneCycleId;

	}

	public static String createCycle(CyclePojo cyclePojo, TestCaseDataPojo testCaseDataPojo) {
		SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MMM/yy");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		cal.set(Calendar.MONTH, (cal.get(Calendar.MONTH) + 1));
		Date end = cal.getTime();
		String endDate = sdfDate.format(end);
		String cycleName = (testCaseDataPojo.getCycleName() + "_" + new Date()).replaceAll(" ", "_");
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
		System.out.println("Cycle " + testCaseDataPojo.getCycleName() + "_" + new Date() + " Created successfully");
		return cycleName;

	}

	private static String getExecutionId(String testCaseID, String cName) {
		String issueId = null;
		Client client = ClientBuilder.newClient();
		Response response = client.target(PropertyReader.url + "rest/api/2/issue/" + testCaseID)
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

	public static void logError() {
		// TODO Auto-generated method stub

	}

}
