package Util;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import TestBase.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;


public class Utility  extends Base{

	
	public void switchToFrame(){
		driver.switchTo().frame("mainpanel");
	}
	
	
	public static String sheetpath = "C:\\Users\\Lenovo\\eclipse-workspace\\CRMTestApplicationSuite\\src\\main\\java\\TestData\\Book1.xlsx";
	
	
	public static Workbook book;
	public static Sheet sheet;
	public static FileInputStream file;
	
	public static Object[][] getTestData(String sheetName) {
		
		
		try {	
			file = new FileInputStream(sheetpath);
		} catch (FileNotFoundException e) {
			System.out.println("Not Able to Locate File Path");
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			System.out.println("Not able to read file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		
		
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		
		System.out.println(sheet.getLastRowNum());
		
		System.out.println(sheet.getRow(1).getLastCellNum());
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(1).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	

	
	
}

