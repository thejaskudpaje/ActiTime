package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TaskList;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;

@Listeners(com.actitime.generic.ListnerImplementation.class)
public class ATCustomerModule extends BaseClass {
	  HomePage hp=new HomePage(driver);
	  TaskList tl=new TaskList(driver);

@Test
public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("AT create customer",true);
	HomePage hp=new HomePage(driver);
	  TaskList tl=new TaskList(driver);
		hp.setTaskButton();
		tl.getAddNwBtn().click();
		tl.getNwCustomer().click();
		FileLib flb=new FileLib();
		String custName = flb.readExcelFile("Create Customer", 1, 4);
		tl.getCustName().sendKeys(custName);
		tl.getCreateCustomrDD().click();
		tl.getSelctCustmTxtBx().sendKeys("Our");
		tl.getExistngCustomer().click();    
        tl.getCreateCustBtn().click();
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div[1]")), custName));
        String createdCustNme = tl.getCreatedCustName().getText();  
       Assert.assertEquals(createdCustNme, custName);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
    	 // Thread.sleep(5000);
      
}
}
