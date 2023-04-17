package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.LoginPage;
import com.actitime.POM.TaskList;

public class BaseClass {
public static WebDriver driver;
public FileLib fl=new FileLib();


static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@BeforeTest
public void openBrowser() throws EncryptedDocumentException, IOException {
	Reporter.log("AT Opening the browser",true);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

@BeforeMethod
public void login() throws EncryptedDocumentException, IOException {
	Reporter.log("AT Login",true);
	String url=fl.readPropertyFile("url");
	String un=fl.readPropertyFile("un");
	String pw=fl.readPropertyFile("pw");
	
    driver.get(url);    
    LoginPage lp=new LoginPage(driver);
lp.setLogin(un, pw);
 
    
}

//@AfterMethod
//public void logout() {
//	Reporter.log("AT logout",true);
//	HomePage hp=new HomePage(driver);
//	hp.setLogout();
//}
//
//@AfterTest
//public void closeBrowser() {
//	Reporter.log("AT closing broser",true);
//	driver.close();
//}

}
