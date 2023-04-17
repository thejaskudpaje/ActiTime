package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.actitime.generic.ListnerImplementation.class)
public class TestMethodClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

@Test
public void loginPagePOM() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	LoginPage l=new LoginPage(driver);
	l.setLogin("admin", "manager");
	

}
}
