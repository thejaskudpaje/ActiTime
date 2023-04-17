package com.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
@Test
public void demoAssertion() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/webhp");
	String eTitle="Soogle";
	 String aTitle = driver.getTitle();
	 SoftAssert s=new SoftAssert();
	 
	s.assertEquals(aTitle, eTitle);
//	s.assertAll();
	 driver.close();
 //s.assertAll();
	 
}
}
