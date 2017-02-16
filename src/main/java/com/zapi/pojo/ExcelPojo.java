package com.zapi.pojo;

import org.apache.poi.ss.usermodel.Row;

public class ExcelPojo {

	String issueKey;
	String testCaseName;
	String cycleName;
	String version;
	String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getIssueKey() {
		return issueKey;
	}

	public void setIssueKey(String issueKey) {
		this.issueKey = issueKey;
	}

	public String getTestCaseName() {
		return testCaseName;
	}

	public void setTestCaseName(String testCaseName) {
		this.testCaseName = testCaseName;
	}

	public String getCycleName() {
		return cycleName;
	}

	public void setCycleName(String cycleName) {
		this.cycleName = cycleName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public static ExcelPojo buildExcelPojo(Row row) {
		ExcelPojo ep = new ExcelPojo();
		ep.setIssueKey(row.getCell(0).toString().trim());
		ep.setCycleName(row.getCell(1).toString().trim());
		ep.setVersion(row.getCell(2).toString().trim());
		ep.setResult(row.getCell(3).toString().trim());
		return ep;
	}
	
	

}
