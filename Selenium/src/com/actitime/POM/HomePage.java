package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
@FindBy(id="container_tasks")
private WebElement tskBtn;

@FindBy(id="logoutLink")
private WebElement lgOutBtn;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void setTaskButton() {
	tskBtn.click();
}

public void setLogout() {
	lgOutBtn.click();
}
}
