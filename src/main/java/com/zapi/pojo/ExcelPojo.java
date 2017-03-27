package com.zapi.pojo;

import org.apache.poi.ss.usermodel.Row;

public class ExcelPojo {

	public String issueKey;
	public String cycleName;
	public String version;
	public String result;
	public int rowCount;
	public int getRowCount() {
		return rowCount;
	}

	private void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public String getResult() {
		return result;
	}

	private void setResult(String result) {
		this.result = result;
	}

	public String getIssueKey() {
		return issueKey;
	}

	private void setIssueKey(String issueKey) {
		this.issueKey = issueKey;
	}

	public String getCycleName() {
		return cycleName;
	}

	private void setCycleName(String cycleName) {
		this.cycleName = cycleName;
	}

	public String getVersion() {
		return version;
	}

	private void setVersion(String version) {
		this.version = version;
	}

	public static ExcelPojo buildExcelPojo(Row row, int rowCount) {
		ExcelPojo ep = new ExcelPojo();
		ep.setIssueKey(row.getCell(0).getStringCellValue().toString().trim());
		ep.setCycleName(row.getCell(1).getStringCellValue().toString().trim());
		ep.setVersion(row.getCell(2).getStringCellValue().toString().trim());
		ep.setResult(row.getCell(3).getStringCellValue().toString().trim());
		ep.setRowCount(rowCount);
		return ep;
	}

}
