import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class XpathAxes {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Robot r=new Robot();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("myntra");
		List<WebElement> allsug = driver.findElements(By.xpath("//div/span[contains(text(),'Myntra')]"));
		allsug.get(0).click();
				
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb N8QANc MUxGbd v0nnCb']/span"))).perform();
		a.contextClick().perform();
		r.keyPress(KeyEvent.VK_W);
		
		Set<String> w = driver.getWindowHandles();
		for(String i:w) {
			driver.switchTo().window(i);
		}
		a.moveToElement(driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[@data-index='0' and @data-group='men']"))).perform();
		int x = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[@data-index='0' and @data-group='men']")).getRect().getX();
		int y = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[@data-index='0' and @data-group='men']")).getRect().getY();
		a.moveByOffset(x, y).perform();
		a.doubleClick().perform();
		String price = driver.findElement(By.xpath("(//h3[text()='Roadster'])[1]/parent::div/descendant::span[@class='product-discountedPrice']")).getText();
		System.out.println(price);
		
		
	}
	

}
