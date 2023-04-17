import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllLinks {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
System.out.println(allLinks.size());
//for(WebElement i:allLinks) {
//	System.out.println(i.getText());
//}

Iterator<WebElement> i=allLinks.iterator();
while(i.hasNext()) {
	System.out.println(i.next().getText());
}

	}

}
