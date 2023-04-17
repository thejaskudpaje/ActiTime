import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\Desktop\\Selenium\\trial2.xlsx");
Workbook wb = WorkbookFactory.create(fis);

int rowCount = wb.getSheet("invalidData").getLastRowNum();
System.out.println(rowCount);

int cellCount=wb.getSheet("invalidData").getRow(0).getLastCellNum();
System.out.println(cellCount);

//printing all datas
for(int i=1;i<cellCount;i++) {
	for(int j=1;j<=rowCount;j++) {
		String un=wb.getSheet("invaliddata").getRow(j).getCell(i).getStringCellValue();
		System.out.println(un);
	}
}
	}

}
