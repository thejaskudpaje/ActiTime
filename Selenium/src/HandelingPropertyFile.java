import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingPropertyFile {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
FileInputStream f=new FileInputStream("C:\\Users\\Hp\\Desktop\\Selenium\\notepad\\common_data.property");
Properties p=new Properties();
p.load(f);

//String link=p.getProperty("url");
//String un=p.getProperty("username");
//String pw=p.getProperty("password");

driver.get(p.getProperty("url"));
driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys(p.getProperty("password"));
driver.findElement(By.id("loginButton")).click();
	}

}
