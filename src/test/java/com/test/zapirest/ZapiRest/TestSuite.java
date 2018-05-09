package com.test.zapirest.ZapiRest;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.cybage.zapi.config.TestID;

public class TestSuite {

	static Logger logger = Logger.getLogger(TestSuite.class.getName());
	public WebDriver driver;


	@TestID(testID = "ALMMT-11")
	@Test
	public void firstTest() {
		logger.log(Level.INFO, "First test executed");
	}

	@TestID(testID = "ALMMT-12")
	@Test
	public void secondTest() {
		logger.log(Level.INFO, "Second test executed");
	}

}