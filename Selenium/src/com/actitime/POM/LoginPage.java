package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
@FindBy(id="username")
private WebElement untbx;

@FindBy(name="pwd")
private WebElement pwtbx;

@FindBy(id="loginButton")
	private WebElement lgnBtn;

@FindBy(xpath = "//span[text()='Username or Password is invalid. Please try again.']")
private WebElement errorMsg;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setLogin(String un,String pw) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgnBtn.click();
	
}




}
