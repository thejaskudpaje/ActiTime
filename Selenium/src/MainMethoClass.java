/*login to actitime using encapsulation concept
 * 
 * exm 
 * driver.findElement(By.id("username")).sendKeys(un);
 *       (or)
 *WebElement textField= driver.findElement(By.id("username"));
 *textField.sendKeys("admin");
 *        (or)
 *WebElement textField;----------------------------->declaration
 *textField= driver.findElement(By.id("username"));-->initialization
 *textField.sendKeys("admin");-------------------->utilization
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainMethoClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
LoginPage l=new LoginPage(driver);
l.setUN("admin1","manager1");
//Thread.sleep(4000);
//l.setUN("admin","manager");
	}

}
