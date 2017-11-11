//package POM;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//
//public class ObjectRepository {
//	public static String s,s1;
//	Map mastersheet = new HashMap();
//
//	public ObjectRepository() {
//		try {
//			ObjectExcelReader();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void ObjectExcelReader() throws IOException {
//		File myFile = new File("D://txt.xlsx");
//		FileInputStream fis = new FileInputStream(myFile);
//		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
//		int numberOfSheets = myWorkBook.getNumberOfSheets();
//		for (int i = 0; i < numberOfSheets; i++) {
//
//			Map map = new HashMap();
//			Sheet sheet = myWorkBook.getSheetAt(i);
//			String sheetName = myWorkBook.getSheetName(i);
//			Iterator<Row> rowIterator = sheet.iterator();
//
//			while (rowIterator.hasNext()) {
//
//				String key = "";
//            	String locator = "";
//            //	String locatorvalue="";
//
//				Row row = rowIterator.next();
//				Iterator<Cell> cellIterator = row.cellIterator();
//				while (cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
//					switch (cell.getCellType()) {
//					case Cell.CELL_TYPE_STRING:
//						if (key.equalsIgnoreCase("")) {
//							key = cell.getStringCellValue().trim();
//						}
//						else if (locator.equalsIgnoreCase("")) {
//							locator = cell.getStringCellValue().trim();
//						}
//						/*else if (locatorvalue.equalsIgnoreCase("")) {
//							locatorvalue = cell.getStringCellValue().trim();
//						}*/
//						map.put(key,locator);
//					}
//				}
//
//			}
//			mastersheet.put(sheetName, map);
//		}
//	}
//	
//	
//	public void TestValue() throws IOException
//	{
//		Map m=(Map) mastersheet.get("LoginPage");
//		s=(String) m.get("emailtxtbox");
//		s1=(String) m.get("nextbtn");
//	}
//
//	public static By s(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//
//}
