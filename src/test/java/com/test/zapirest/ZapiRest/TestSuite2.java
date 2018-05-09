package com.test.zapirest.ZapiRest;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.cybage.zapi.config.TestID;


@Listeners(com.cybage.zapi.listner.Listener.class)
public class TestSuite2 {
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
	/*	DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
				"src/main/resources/phantomjs.exe");
		driver = new PhantomJSDriver(capabilities);
		driver.get("http://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Gogle");*/
	}

	@TestID(testID = "ALMMT-13")
	@Test
	public void thirdTest() {
		logger.log(Level.INFO, "Third test executed");
	}
}
