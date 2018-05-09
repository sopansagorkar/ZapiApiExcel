package com.cybage.zapi.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * @author Sopan Sagorkar
 *
 */
public class PropertyReader {
	static Properties properties = new Properties();
	public static String userName;
	public static String password;
	public static String url;
	public static String excelPath;

	public static void propReader() {
		try {
			properties.load(new FileInputStream("config.properties"));
			excelPath=properties.getProperty("excelPath");
			userName=properties.getProperty("userName");
			password=properties.getProperty("password");
			url=properties.getProperty("url");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
