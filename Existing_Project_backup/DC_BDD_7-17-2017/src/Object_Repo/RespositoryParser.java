package Object_Repo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import Parametation_Propetiese_File.Properties_File_reading;
 
public class RespositoryParser {
 
	private FileInputStream stream;
	private String RepositoryFile;
	static String  sheetName = "element";
	private static Properties propertyFile = new Properties();
	static Map<String,Map> mastersheet = new HashMap<>();
	static String key, locator, locatorvalue;

	public static void main (String args[])
	{
		System.out.println(getbjectLocator("DC","username")); 
		//System.out.println(getbjectLocator("SBI","Cop_log_select"));
	}

	
	public static  By getbjectLocator(String Sheetname, String Key)
	{

		try{
		File myFile = new File(Properties_File_reading.getOR("OR"));
		FileInputStream fis = new FileInputStream(myFile);
		
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
		int numberOfSheets = myWorkBook.getNumberOfSheets();
		for (int i = 0; i < numberOfSheets; i++) 
		{

			Map<String,ObjectRepMap> map = new HashMap<>();
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
		fis.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	//	System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+ Sheetname+":::::::::::::::::::::::::::::::::::"+Key );
		String stepType;
		String stepValue;
		
		Map<String,ObjectRepMap> m=mastersheet.get(Sheetname);
		//System.out.println("Size :"+m.values());
		//System.out.println("Size :"+m.size());
		ObjectRepMap o= m.get(Key);
		stepType=o.getLocator();
		//System.out.println("stepType::::::::::::::::::::::::::"+stepType);
		
		stepValue=o.getLocatorvalue();
		//System.out.println("stepValue::::::::::::::::::::::::::"+stepValue);
		//String locatorProperty = propertyFile.getProperty(locatorName);
			//		System.out.println(locatorProperty.toString());
	//	String locatorType = locatorProperty.split(":")[0];
		//String locatorValue = locatorProperty.split(":")[1];
 
		By locator = null;
		switch(stepType)
		{
		case "id":
			locator = By.id(stepValue);
			break;
		case "name":
			locator = By.name(stepValue);
			break;
		case "cssSelector":
			locator = By.cssSelector(stepValue);
			break;
		case "linkText":
			locator = By.linkText(stepValue);
			break;
		case "partialLinkText":
			locator = By.partialLinkText(stepValue);
			break;
		case "tagName":
			locator = By.tagName(stepValue);
			break;
		case "xpath":
			locator = By.xpath(stepValue);
			break;
		}
		//System.out.println(locator);
		return locator;
		
	}
}
	