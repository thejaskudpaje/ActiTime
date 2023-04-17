/*login to actitime.com
 * compare the title
 * make the result as fail 
 * take the screenshot
 */
package com.actitime.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListnerImplementation.class)
public class ScreenShotExm1 extends BaseClass {
	
@Test
public void homePage() throws InterruptedException {
	Reporter.log("Comparing title",true);
	
    Thread.sleep(5000);
	String eTitle="ActiTime";
	String aTitle=driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(aTitle, eTitle);
	s.assertAll();
	
}
}
