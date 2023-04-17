package com.actitime.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.HomePage;
import com.actitime.POM.TaskList;
import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListnerImplementation.class)
public class ATProjectModule extends BaseClass {

	@Test
	public void testCreateProject() {
		HomePage hp=new HomePage(driver);
		  TaskList tl=new TaskList(driver);
			hp.setTaskButton();
			tl.getAddNwBtn().click();
			tl.getNwProject().click();
			tl.getProjectName().sendKeys("QSP2");
			tl.getCustomerDD().click();
			tl.getCustomerName().click();
			tl.getProjectDescription().sendKeys("Education");
			tl.getTaskNameTF().sendKeys("Insta post");
			tl.getDeadLineHD().click();
			tl.getYearOption().click();
			tl.getMonth().click();
			tl.getYear().click();
			tl.getYearMonthOKBtn().click();
			tl.getDate().click();
			tl.getDateOK().click();
			tl.getCreatePrjctBtn().click();
			
			WebDriverWait w=new WebDriverWait(driver, 10);
			w.until(ExpectedConditions.textToBePresentInElement(tl.getCreatedTaskName(),"QSP2"));
			System.out.println(tl.getCreatedTaskName().getText());
			boolean b=tl.getCreatedTaskName().isDisplayed();
			if(b)
			System.out.println("Name is displaying");
			else
				System.out.println("Name not displaying");
	}
}
