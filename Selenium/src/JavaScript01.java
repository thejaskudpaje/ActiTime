import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript01 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
//scrolling to bottom	
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000); 
		
		
//scrolling to top	
		j.executeScript("window.scrollTo(0,0)");
		
		
//scrolling to particular element	
//	 int y = driver.findElement(By.xpath("//h2[text()='Mumbai Weather']")).getRect().getY();
//	 System.out.println(y);
//	 j.executeScript("window.scrollBy(0,"+y+")");
		
//scrolling to particular distance
		//j.executeScript("window.scrollBy(0,5000)");
		
	 
	}

}
