package com.actitime.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PilotModule {

	
@Test
public void addPilot() {
	Reporter.log("addPilot",true);
}

@Test
public void editPilot() {
	Reporter.log("editPilot",true);
}

@Test
public void deletePilot() {
	Reporter.log("deletePilot",true);
	Assert.fail();
}
}
