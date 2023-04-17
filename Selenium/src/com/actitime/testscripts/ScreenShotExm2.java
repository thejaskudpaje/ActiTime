package com.actitime.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.ListnerImplementation;
@Listeners(com.actitime.generic.ListnerImplementation.class)
public class ScreenShotExm2 extends BaseClass {
@Test
public void trial() {
	Reporter.log("Fail test case",true);
	Assert.fail();
}
}
