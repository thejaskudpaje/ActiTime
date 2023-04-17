package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	
@FindBy(xpath = "//div[text()='Add New']")
private WebElement addNwBtn;

@FindBy(xpath = "//div[text()='+ New Customer']")
private WebElement nwCustomer;

@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
private WebElement custName;

@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement custDespt;

@FindBy(className = "dropdownButton")
private WebElement slctCustmr;

@FindBy(xpath = "//div[@class='emptySelection']")
private WebElement createCustomrDD;

@FindBy(xpath = "//div[@class='customerImportDiv withCustomerSelector']//input[@type='text']")
private WebElement selctCustmTxtBx;

@FindBy(xpath="//div[@class='itemRow cpItemRow ']/span[contains(text(),'Our')]")
private WebElement existngCustomer;

@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createCustBtn;

@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[1]")
private WebElement createdCustName;

@FindBy(xpath = "//div[@class='item createNewProject']")
private WebElement nwProject;

@FindBy(xpath = "//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
private WebElement projectName;

@FindBy(xpath = "//div[@class='emptySelection']")
private WebElement customerDD;

@FindBy(xpath = "//div[@class='itemRow cpItemRow 'and text()='Our company']")
private WebElement customerName;

@FindBy(xpath = "//textarea[@class='textarea' and @placeholder='Add Project Description']")
private WebElement projectDescription;

@FindBy(xpath = "(//input[@placeholder='Enter task name' ])[1]")
private WebElement taskNameTF;

@FindBy(id="ext-gen45")
private WebElement deadLineHD;

@FindBy(id="ext-gen102")
private WebElement yearOption;

@FindBy(linkText = "Oct" )
private WebElement month;

@FindBy(linkText = "2023" )
private WebElement year;

@FindBy(xpath = "//button[@class='x-date-mp-ok']")
private WebElement YearMonthOKBtn;

@FindBy(xpath = "//span[text()='14']")
private WebElement date;

@FindBy(id = "ext-gen123")
private WebElement dateOK;

@FindBy(xpath = "//div[@class='basicLightboxFooter']/descendant::div[@class='components_button_label']")
private WebElement CreatePrjctBtn;

@FindBy(xpath= "//div[@class='topContainer']/descendant::div[@class='title']")
private WebElement createdTaskName;

public TaskList(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddNwBtn() {
	return addNwBtn;
}

public WebElement getNwCustomer() {
	return nwCustomer;
}

public WebElement getCustName() {
	return custName;
}

public WebElement getCustDespt() {
	return custDespt;
}

public WebElement getSlctCustmr() {
	return slctCustmr;
}

public WebElement getCreateCustomrDD() {
	return createCustomrDD;
}

public WebElement getExistngCustomer() {
	return existngCustomer;
}

public WebElement getCreateCustBtn() {
	return createCustBtn;
}

public WebElement getCreatedCustName() {
	return createdCustName;
}

public WebElement getSelctCustmTxtBx() {
	return selctCustmTxtBx;
}

public WebElement getNwProject() {
	return nwProject;
}

public WebElement getProjectName() {
	return projectName;
}

public WebElement getCustomerDD() {
	return customerDD;
}

public WebElement getCustomerName() {
	return customerName;
}

public WebElement getProjectDescription() {
	return projectDescription;
}

public WebElement getTaskNameTF() {
	return taskNameTF;
}

public WebElement getDeadLineHD() {
	return deadLineHD;
}

public WebElement getYearOption() {
	return yearOption;
}

public WebElement getMonth() {
	return month;
}

public WebElement getYear() {
	return year;
}

public WebElement getYearMonthOKBtn() {
	return YearMonthOKBtn;
}

public WebElement getDate() {
	return date;
}

public WebElement getDateOK() {
	return dateOK;
}

public WebElement getCreatePrjctBtn() {
	return CreatePrjctBtn;
}

public WebElement getCreatedTaskName() {
	return createdTaskName;
}

//public void getaddNewBtn() {
//	addNwBtn.click();
//}
//
//public void newCustomer() {
//	nwCustomer.click();
//}
}
