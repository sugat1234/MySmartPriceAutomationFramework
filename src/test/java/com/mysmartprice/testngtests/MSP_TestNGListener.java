package com.mysmartprice.testngtests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MSP_TestNGListener implements ITestListener
{

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("[START]: Starting test suite execution");
	}
	
	@Override
	public void onTestStart(ITestResult result) 
	{

		System.out.println("[INFO]: Test Started "+	result.getMethod());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("[PASS]: Test Successful");	
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("[FAIL]: Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("[SKIPPED]: Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("[TIMEOUT]: Test Failed with Timeout");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("[FINISH]: Test suite execution finished");
	}

	

}
