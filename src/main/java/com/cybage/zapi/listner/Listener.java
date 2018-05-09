package com.cybage.zapi.listner;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.cybage.zapi.client.*;
import com.cybage.zapi.config.TestID;
import com.cybage.zapi.pojo.TestCaseDataPojo;

/**
 * @author Sopan Sagorkar
 *
 */
public class Listener implements ITestListener, ISuiteListener {

	static int testCount = 0;
	static int i = 0;
	TestCaseDataPojo caseDataPojo = new TestCaseDataPojo();

	public void onFinish(ISuite arg0) {

	}

	public void onStart(ISuite arg0) {

	}

	public void onFinish(ITestContext arg0) {
		// ZapiRest.deleteIssue();
	}

	public void onStart(ITestContext arg0) {
		testCount = arg0.getAllTestMethods().length;

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	public void onTestFailure(ITestResult arg0) {

		caseDataPojo.setTestCaseID(
				arg0.getMethod().getConstructorOrMethod().getMethod().getAnnotation(TestID.class).testID());
		caseDataPojo.setCycleName(arg0.getTestContext().getCurrentXmlTest().getParameter("Cycle"));
		caseDataPojo.setVersion(arg0.getTestContext().getCurrentXmlTest().getParameter("Version"));
		caseDataPojo.setStatus("FAIL");
		caseDataPojo.setTestCount(testCount);
	}

	public void onTestSkipped(ITestResult arg0) {
		caseDataPojo.setTestCaseID(
				arg0.getMethod().getConstructorOrMethod().getMethod().getAnnotation(TestID.class).testID());
		caseDataPojo.setCycleName(arg0.getTestContext().getCurrentXmlTest().getParameter("Cycle"));
		caseDataPojo.setVersion(arg0.getTestContext().getCurrentXmlTest().getParameter("Version"));
		caseDataPojo.setStatus("UNEXECUTED");
		caseDataPojo.setTestCount(testCount);
		System.out.println("old listener");
		ZapiRest.updateTestCases(caseDataPojo);

	}

	public void onTestStart(ITestResult arg0) {

	}

	public void onTestSuccess(ITestResult arg0) {
		caseDataPojo.setTestCaseID(
				arg0.getMethod().getConstructorOrMethod().getMethod().getAnnotation(TestID.class).testID());
		caseDataPojo.setCycleName(arg0.getTestContext().getCurrentXmlTest().getParameter("Cycle"));
		caseDataPojo.setVersion(arg0.getTestContext().getCurrentXmlTest().getParameter("Version"));
		caseDataPojo.setStatus("PASS");
		caseDataPojo.setTestCount(testCount);
		System.out.println("old listener");
		ZapiRest.updateTestCases(caseDataPojo);

	}

}
