package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ActiTimeLoginLogout extends BaseClass{
	
	@Test(groups="smokeTest")
	public void loginLogout() {
		Reporter.log("Excecuting Test Case",true);
		
	}

}
