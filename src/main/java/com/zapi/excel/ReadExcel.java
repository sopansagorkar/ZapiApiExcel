package com.zapi.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.zapi.pojo.ExcelPojo;

public class ReadExcel {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static int sheetCount;

	public static ArrayList<ArrayList<ExcelPojo>> getExcelPojo(String path) {

		ArrayList<ArrayList<ExcelPojo>> allSheetLists = new ArrayList<ArrayList<ExcelPojo>>();

		File file = new File(path);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
		}
		sheetCount = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetCount; i++) {
			sheet = workbook.getSheetAt(i);
			Iterator<Row> rowIterator = sheet.iterator();
			ArrayList<ExcelPojo> singleSheetList = new ArrayList<ExcelPojo>();
			while (rowIterator.hasNext()) {
				Row row = (Row) rowIterator.next();
				if (row.getRowNum() == 0)
					continue;
				singleSheetList.add(ExcelPojo.buildExcelPojo(row));

			}
			allSheetLists.add(singleSheetList);
		}
		return allSheetLists;

	}

}
