import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
WebElement untbx;
WebElement pwtbx;
WebElement logbtn;

public LoginPage(WebDriver driver) {
	untbx= driver.findElement(By.id("username"));
	pwtbx=driver.findElement(By.name("pwd"));
	logbtn=driver.findElement(By.id("loginButton"));
}

public void setUN(String i,String j) {
	untbx.sendKeys(i);
	pwtbx.sendKeys(j);
	logbtn.click();
}
}
