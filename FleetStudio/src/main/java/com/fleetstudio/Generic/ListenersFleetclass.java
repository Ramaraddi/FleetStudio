package com.fleetstudio.Generic;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersFleetclass extends Baseclass implements ITestListener
{
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is pass");
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Test case is fail :"+result.getName());
		
		SceenshotFleet.Getphoto(this.driver,result);
	}
}
