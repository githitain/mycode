package Excel_Parametraztion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class object_repository_using_excel 
{
	private FileInputStream stream;
	private String RepositoryFile;
	static String  sheetName="element";
	//private static Properties propertyFile = new Properties();
	//Map<String,ObjectRepMap> m=mastersheet.get(sheetName);
	static Map <String,Map>mastersheet = new HashMap();
	static String key, locator, locatorvalue;

	public static void main(String arg[]) throws IOException
	{
		try
		{
			File myFile = new File("D://Practice_excel//testData.xlsx");
			FileInputStream fis = new FileInputStream(myFile);
			XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
			int numberOfSheets = myWorkBook.getNumberOfSheets();
			for (int i = 0; i < numberOfSheets; i++) 
			{
				Map<String,ObjectRepMap> map = new HashMap();
				Sheet sheet = myWorkBook.getSheetAt(1);
				sheetName = myWorkBook.getSheetName(i);
				Iterator<Row> rowIterator = sheet.iterator();
				while (rowIterator.hasNext()) 
				{
					key = "";
	            	locator = "";
	            	locatorvalue="";

					Row row = rowIterator.next();
					Iterator<Cell> cellIterator = row.cellIterator();
					while (cellIterator.hasNext())
					{
						Cell cell = cellIterator.next();
						switch (cell.getCellType())
						{
							case Cell.CELL_TYPE_STRING:
							if (key.equalsIgnoreCase("")) 
							{
								key = cell.getStringCellValue().trim();
							}
							else if (locator.equalsIgnoreCase("")) 
							{
								locator = cell.getStringCellValue().trim();
							}
							else if(locatorvalue.equalsIgnoreCase(""))
							{
								locatorvalue = cell.getStringCellValue().trim();
							}
	    					else
							{
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
				//System.out.println(map);
				mastersheet.put(sheetName, map);
				getbjectLocator("element");
				getbjectLocator("element","a1");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	public static  By getbjectLocator(String Sheetname)
	{
		String LocatorType;
		String LocatorValue;
			
		Map<String,ObjectRepMap> m=mastersheet.get(sheetName);
		ObjectRepMap o= m.get(key);
		LocatorType=o.getLocator();
		LocatorValue=o.getLocatorvalue();
		System.out.println("Function -1 -print the map using set="+m);
		Set set = m.entrySet();
		Iterator i = set.iterator();
		By locator = null;
		while(i.hasNext())
		{
		
			Map.Entry<String,ObjectRepMap> a=(Map.Entry)i.next();
			System.out.println("Function -1 -key="+a.getKey());
			System.out.println("Function -1 -LocatorType="+ a.getValue().getLocator());
			System.out.println("Function -1 -LocatorValue="+ a.getValue().getLocatorvalue());
		
		//By locator = null;
			switch(a.getValue().getLocator())
			{
				case "id":
					locator = By.id(a.getValue().getLocatorvalue());
					break;
				case "name":
					locator = By.name(a.getValue().getLocatorvalue());
					break;
				case "cssSelector":
					locator = By.cssSelector(a.getValue().getLocatorvalue());
					break;
				case "linkText":
					locator = By.linkText(a.getValue().getLocatorvalue());
					break;
				case "partialLinkText":
					locator = By.partialLinkText(a.getValue().getLocatorvalue());
					break;
				case "tagName":
					locator = By.tagName(a.getValue().getLocatorvalue());
					break;
				case "xpath":
					locator = By.xpath(a.getValue().getLocatorvalue());
					break;
			}
			System.out.println("Function -1 -the locatoer value="+ locator);
			//return locator;
		}
		return locator;
	}
	
	public static  By getbjectLocator(String Sheetname, String key)
	{
		String LocatorType;
		String LocatorValue;
			
		Map<String,ObjectRepMap> m=mastersheet.get(sheetName);
		ObjectRepMap o= m.get(key);
		LocatorType=o.getLocator();
		LocatorValue=o.getLocatorvalue();
		//System.out.println("print the map using set="+m);
		//Set set = m.entrySet();
		//Iterator i = set.iterator();
		By locator = null;
		
		
			switch(LocatorType)
			{
				case "id":
					locator = By.id(LocatorValue);
					break;
				case "name":
					locator = By.name(LocatorValue);
					break;
				case "cssSelector":
					locator = By.cssSelector(LocatorValue);
					break;
				case "linkText":
					locator = By.linkText(LocatorValue);
					break;
				case "partialLinkText":
					locator = By.partialLinkText(LocatorValue);
					break;
				case "tagName":
					locator = By.tagName(LocatorValue);
					break;
				case "xpath":
					locator = By.xpath(LocatorValue);
					break;
			}
			System.out.println("Function -2 -the locatoer value="+ locator);
			//return locator;
			return locator;
		}
		
	
	
	
}
	
