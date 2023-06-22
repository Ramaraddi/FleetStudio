package com.fleetstudio.pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fleetstudio.Generic.Baseclass;

public class pomclassFleet extends Baseclass
{
	//Declaration
	
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(name = "email")
	private WebElement email;
	
	@FindBy(name = "telephone")
	private WebElement mobilenumber;
	
	@FindBy(name = "password")
	private WebElement passwordtxt;
	
	@FindBy(name = "confirm")
	private WebElement confirmpass;
	
	@FindBy(name = "newsletter")
	private WebElement subradio;
	
	@FindBy(xpath ="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continuebtn;
	
	
	
	//Initialisation
	
	public pomclassFleet(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilisation
	
	public WebElement FirstName()
	{
		return firstname;
	}
	
	public WebElement LastName()
	{
		return lastname;
	}
	
	public WebElement Email()
	{
		return email;
	}
	public WebElement MobileNumber()
	{
		return mobilenumber;
	}
	public WebElement passWord()
	{
		return passwordtxt;
	}
	public WebElement confirmPass()
	{
		return confirmpass;
	}
	public WebElement subcribeRadio()
	{
		return subradio;
	}
	public WebElement checkBox()
	{
		return checkbox;
	}
	public WebElement ContinueBtn()
	{
		return continuebtn;
	}
}
