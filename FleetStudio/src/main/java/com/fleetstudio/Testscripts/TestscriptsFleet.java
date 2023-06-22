package com.fleetstudio.Testscripts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fleetstudio.Generic.Baseclass;
import com.fleetstudio.pomscripts.pomclassFleet;

@Listeners(com.fleetstudio.Generic.ListenersFleetclass.class)
public class TestscriptsFleet extends Baseclass
{
	@Test
	public static void TestscriptFleet() throws InterruptedException
	{
      pomclassFleet pom = new pomclassFleet(driver);
      Thread.sleep(2000);
      pom.FirstName().sendKeys("ramaraddi");
      Thread.sleep(2000);
      pom.LastName().sendKeys("bg");
      Thread.sleep(2000);
      pom.Email().sendKeys("ramaraddi61@gmail.com");
      Thread.sleep(2000);
      pom.MobileNumber().sendKeys("9632092368");
      Thread.sleep(2000);
      pom.passWord().sendKeys("ramaraddi66");
      Thread.sleep(2000);
      pom.confirmPass().sendKeys("ramaraddi66");
      Thread.sleep(2000);
      pom.subcribeRadio().click();
      Thread.sleep(1500);
      Assert.fail();
      pom.checkBox().click();
      Thread.sleep(1500);
      pom.ContinueBtn().click();
	}
}
