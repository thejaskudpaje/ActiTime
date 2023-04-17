package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	//Reading data from Property file file
public String readPropertyFile(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/actitime.property");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
	
}

//reading data from excel file
public String readExcelFile(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\Hp\\Desktop\\TestCase.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
}
