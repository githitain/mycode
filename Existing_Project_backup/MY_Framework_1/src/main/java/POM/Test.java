package POM;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	private FileInputStream stream;
	private String RepositoryFile;
	static String  sheetName;
	private static Properties propertyFile = new Properties();
	static Map mastersheet = new HashMap();
	static String key, locator, locatorvalue;

public static void main(String[] args) {
	try{
	File myFile = new File("D://Workspace_2//MY_Framework_1//src//test//resources//txt.xlsx");
	FileInputStream fis = new FileInputStream(myFile);
	
	XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
	int numberOfSheets = myWorkBook.getNumberOfSheets();
	for (int i = 0; i < numberOfSheets; i++) {

		Map map = new HashMap();
		Sheet sheet = myWorkBook.getSheetAt(i);
		sheetName = myWorkBook.getSheetName(i);
		Iterator<Row> rowIterator = sheet.iterator();

		while (rowIterator.hasNext()) {

			 key = "";
        	 locator = "";
        	 locatorvalue="";

			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					if (key.equalsIgnoreCase("")) {
						key = cell.getStringCellValue().trim();
					}
					else if (locator.equalsIgnoreCase("")) {
						locator = cell.getStringCellValue().trim();
					}
					else if(locatorvalue.equalsIgnoreCase("")){
						locatorvalue = cell.getStringCellValue().trim();
						
						}
					else{
						System.out.println(cell.getStringCellValue());
					}
					break;
					case Cell.CELL_TYPE_NUMERIC:
						String nvalue=String.valueOf(cell.getNumericCellValue());
						locatorvalue=nvalue.replaceAll("(?<=^\\d+)\\.0*$", "");
						map.put(key,new ObjectRepMap(locator, locatorvalue));
							}
					} 
			map.put(key,new ObjectRepMap(locator, locatorvalue));
					
					}
		mastersheet.put(sheetName, map);
		}
	}catch(Exception e){
		e.printStackTrace();
	}

}
}
