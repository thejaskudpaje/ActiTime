import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.actitime.generic.FileLib;

public class LoginToActTimeGenericLibrary 
{
	
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");               
}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		FileLib fl=new FileLib();

		String url = fl.readPropertyFile("url");
		String username = fl.readPropertyFile("un");
		String password = fl.readPropertyFile("pw");
		
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		//double clicking using mouse action
		Actions a=new Actions(driver);
		a.doubleClick(driver.findElement(By.id("logoutLink"))).perform();

	}
}
