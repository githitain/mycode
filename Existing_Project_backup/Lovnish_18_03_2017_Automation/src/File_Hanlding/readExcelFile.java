package File_Hanlding;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelFile 

{
	public static void main (String args []) throws Exception
	{
		String exfile = "d:\\OR1.xlsx";
		FileInputStream inputStream = new FileInputStream(new File(exfile));
		
		Workbook workbook = new XSSFWorkbook (inputStream);
		Sheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator =firstSheet.iterator();
		while(iterator.hasNext())
		{
			Row nextRow = iterator.next();
			Iterator<Cell> celliterator =nextRow.cellIterator();
			while(celliterator.hasNext())
			{
				Cell cell =celliterator.next();
				switch(cell.getCellType())
				{
					case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());
					break;
					case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
						break;
				}	
					
			}
		}
		inputStream.close();
	}
}
