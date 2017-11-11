package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataC {
	
	private static Properties prop;
	
	static {
		File file = new File("src/test/resources/TestData.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();

		// load properties file
		try 
		{
			prop.load(fileInput);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	/*public TestDataC() { 
		try { TestDataReader(); } catch (IOException e)
	  { e.printStackTrace(); } }
	  
	/*
	 * public static String s,s1; Map mastersheet = new HashMap();
	 * 
	 * public TestDataC() { try { TestDataExcelreader(); } catch (IOException e)
	 * { e.printStackTrace(); } }
	 * 
	 * public void TestDataExcelreader() throws IOException { File myFile = new
	 * File("D://txt.xlsx"); FileInputStream fis = new FileInputStream(myFile);
	 * XSSFWorkbook myWorkBook = new XSSFWorkbook(fis); int numberOfSheets =
	 * myWorkBook.getNumberOfSheets(); for (int i = 0; i < numberOfSheets; i++)
	 * {
	 * 
	 * Map map = new HashMap(); Sheet sheet = myWorkBook.getSheetAt(i); String
	 * sheetName = myWorkBook.getSheetName(i); Iterator<Row> rowIterator =
	 * sheet.iterator();
	 * 
	 * while (rowIterator.hasNext()) {
	 * 
	 * String key = ""; String value = "";
	 * 
	 * Row row = rowIterator.next(); Iterator<Cell> cellIterator =
	 * row.cellIterator(); while (cellIterator.hasNext()) { Cell cell =
	 * cellIterator.next(); switch (cell.getCellType()) { case
	 * Cell.CELL_TYPE_STRING: if (key.equalsIgnoreCase("")) { key =
	 * cell.getStringCellValue().trim(); } else if (value.equalsIgnoreCase(""))
	 * { value = cell.getStringCellValue().trim(); } map.put(key, value); } }
	 * 
	 * } mastersheet.put(sheetName, map); } }
	 * 
	 * public void TestValue() throws IOException {
		Map m = (Map) mastersheet.get("TestData");
		s = (String) m.get("Username");
		s1 = (String) m.get("Password");
	}
	 
	public static void TestDataReader() throws IOException {

		File file = new File("src/test/resources/TestData.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();

		// load properties file
		try 
		{
			prop.load(fileInput);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
*/
	
	public static String getValue(String s) throws IOException
	{
		return prop.getProperty(s);
		
	}

}
