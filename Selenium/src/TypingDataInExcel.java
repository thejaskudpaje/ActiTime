import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TypingDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\Desktop\\Selenium\\trial.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("sheet1").getRow(2).getCell(4).setCellValue("pass");
FileOutputStream fos=new FileOutputStream("C:\\Users\\Hp\\Desktop\\Selenium\\trial.xlsx");
wb.write(fos);
wb.close();
	}

}
