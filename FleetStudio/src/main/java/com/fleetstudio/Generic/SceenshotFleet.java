package com.fleetstudio.Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class SceenshotFleet extends Baseclass
{
	public static void Getphoto(WebDriver driver,ITestResult result)
	{
		Date d=new Date();
		String date = d.toString().replace(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshots/pic3.jpeg"+date);
		try 
		{
			FileHandler.copy(src, dest);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
