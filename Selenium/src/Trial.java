import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
Thread.sleep(3000);
driver.get("https://www.youtube.com/");
	}

}
