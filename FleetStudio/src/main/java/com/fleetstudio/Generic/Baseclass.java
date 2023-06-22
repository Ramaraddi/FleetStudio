package com.fleetstudio.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentReports;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{

	public ExtentReports reports;
	public static WebDriver driver;
	@BeforeClass
	public void OpenApp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
	}
	@AfterClass
	public void closeApp()
	{
		driver.quit();
	}
}
