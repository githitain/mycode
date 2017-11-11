package Java_18_12_2016;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InputOut_excel 
{
	public static void main (String args[]) throws IOException
	{
		// writing an excel file
		XSSFWorkbook wr= new XSSFWorkbook();
		XSSFSheet sh = wr.createSheet("SeleniumCodre");
		
//		Object[][] data =
//			{ {"ide","basic",1},
//			  {"avg","rc",2},
//			  {"advanced","webdriver",3},
//			  {"master","grid",4}
//			};
//		Object[][] data2 =
//			{ {"Kanna"}
//			};
//		
		String txt="Kanna";
		Row row = sh.createRow(1);
		Cell cell = row.createCell(1);
		cell.setCellValue(txt);
		FileOutputStream out = new FileOutputStream("C:/Ashu Folder/Sel.xlsx");
		wr.write(out);
		System.out.println("File has writing");
		
		//int rc=0;
		
		// Reading an excel file

}
}
