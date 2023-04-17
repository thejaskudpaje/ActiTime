import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMessageVarification {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		//Thread.sleep(4000);
		boolean b = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).isDisplayed();
		if(b) {
			System.out.println("Error message is displaying");
		}
		else
			System.out.println("Login successfull");
driver.close();
	}

}
