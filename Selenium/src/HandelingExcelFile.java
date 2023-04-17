import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class HandelingExcelFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
FileInputStream f=new FileInputStream("./data/trial.xlsx");
Workbook wb = WorkbookFactory.create(f);

String url = wb.getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();
String un = wb.getSheet("sheet1").getRow(2).getCell(2).getStringCellValue();
String pw = wb.getSheet("sheet1").getRow(2).getCell(3).getStringCellValue();

System.out.println(url);
driver.get(url);
driver.findElement(By.id("username")).sendKeys(un);
driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys(pw);
driver.findElement(By.id("loginButton")).click();


	}

}