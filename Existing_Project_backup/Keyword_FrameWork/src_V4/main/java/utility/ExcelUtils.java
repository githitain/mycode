package utility;

import java.io.FileInputStream;

//import org.apache.poi.openxml4j.opc.Package;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelUtils 
{
	 private static XSSFSheet ExcelWSheet;
     private static XSSFWorkbook ExcelWBook;
     private static XSSFCell Cell;


	 public static void setExcelFile(String Path,String SheetName) throws Exception 
	 {
	         FileInputStream ExcelFile = new FileInputStream(Path);
	         ExcelWBook = new XSSFWorkbook(ExcelFile);
	         ExcelWSheet = ExcelWBook.getSheet(SheetName);
	         System.out.println(SheetName);
	 }

	 public static String getCellData(int RowNum, int ColNum) throws Exception
	 {
	 	  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	      String CellData = Cell.getStringCellValue();
	      System.out.println(CellData);
	      
	      return CellData;
	 }
}
 
