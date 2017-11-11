package RD_Flag;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import POM.ObjectRepMap;

public class Falgs 
{
	private FileInputStream stream;
	private String RepositoryFile;
	static String  sheetName = "Flagvalue";
	private static Properties propertyFile = new Properties();
	static Map mastersheet = new HashMap();
	static String key,value;
	
	
	int revsersnumber(int number)
	{
		//number = 78954; 0
		int reverse =0;
		System.out.println("Input your number and press enter: "+number);
		while(number!=0)
		{
			 reverse = reverse * 10;
			 reverse = reverse + number%10;
			 number = number/10;
			 
		}
		System.out.println("Reverse of input number is: "+reverse);

		return reverse;
	}
	
	
	int palindromeNumber(int number)
	{
		//number = 78954;
		int reverse =0;
		int temp=number;
		System.out.println("Input your number and press enter: "+number);
		while(number!=0)
		{
			 reverse = reverse * 10;
			 reverse = reverse + number%10;
			 number = number/10;
			 
		}
		System.out.println("Reverse of input number is: "+reverse);

		if (reverse==temp)
			System.out.println("Number is palindrome "+reverse);
		else 
			System.out.println("Number is not palindrome "+temp);
		
		return reverse;
	}
	
	
	String revsersString (String s1)
	{
		String reverse =" ";
		int len=s1.length();
		System.out.println("Original string is: "+s1);
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		
		System.out.println("Reverse of entered string is: "+reverse);
		return reverse;
		
	}
	
	
	String palindromeString (String s1)
	{
		String reverse =" ";
		int len=s1.length();
		
		System.out.println("Original string is: "+s1);
		
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		
		System.out.println("Reverse of entered string is: "+reverse);
		
		if (reverse==s1)
			
			System.out.println("String is palindrome "+reverse);
		else 
			System.out.println("String is not palindrome "+s1);
		
		return reverse;
		
	}
	
	
	int FibonacciExample1(int n)
	{
		int n1=0,n2=1,n3 = 0;
		
		for(int i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		return n3;
		
	}
	
	Boolean factorial(int n)
	{
		boolean flag=false;
		
		int n1=1;
		for(int i=1;i<n;i++)
		{
		n1=n1*i;
		}
		System.out.println("The factorial of n is " + n1);
		
		if(n1>1)
		{
			flag=true;
			
		}
			
		return flag;
		
		
		
	}
	
	void SwapElementsWithoutThirdVariableExample(int n1, int n2)
	{
		
		System.out.println("number 1 before swapping:"+n1 );
		System.out.println("number 2 before swapping:"+n2 );
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("number 1 After swapping:"+n1 );
		System.out.println("number 2 After swapping:"+n2 );
		
	}
	
	
	public static void main(String args[])
	{
		
		
		Falgs obj=new Falgs();
		
		try{
		File myFile = new File("D://Workspace_2//MY_Framework_1//src//test//resources//execution.xlsx");
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
            	 value="";

				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						if (key.equalsIgnoreCase("")) {
							key = cell.getStringCellValue().trim();
						}
						else if(value.equalsIgnoreCase("")){
							value = cell.getStringCellValue().trim();
							
							}
    					else{
    						System.out.println(cell.getStringCellValue());
    					}
    					break;
    					case Cell.CELL_TYPE_NUMERIC:
    						String nvalue=String.valueOf(cell.getNumericCellValue());
    						value=nvalue.replaceAll("(?<=^\\d+)\\.0*$", "");
    						map.put(key,new FlagMap(value));
    							}
    					} 
				map.put(key,new FlagMap(value));
						
						}
			mastersheet.put(sheetName, map);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		String stepkey;
		String stepValue;
		
		Map m=(Map) mastersheet.get(sheetName);
		System.out.println("Size :"+m.values());
		System.out.println("Size :"+m.size());
		Iterator iterator=m.entrySet().iterator();
		while(iterator.hasNext())
		{
			Entry entry=(Entry)iterator.next();
			System.out.println("Map value -->"+ entry.getKey()+":"+entry.getValue());
		}
		
		if(m.get("factorial").equals("Yes"))
		{
			obj.factorial(6);
		}
		
/*		FlagMap o=(FlagMap) m.get(key);
		stepkey=key;
		stepValue=o.getvalue();
		System.out.println("stepkey::::::::::::::::::::::::::"+stepkey);
		System.out.println("stepValue::::::::::::::::::::::::::"+stepValue);
*/		
		/*obj.revsersnumber(789954);
		obj.revsersString("Testing");
		obj.palindromeNumber(8888);
		obj.palindromeString("MAN");
		obj.FibonacciExample1(10);
		obj.factorial(6);
		obj.SwapElementsWithoutThirdVariableExample(45, 89);*/
		
	}
}