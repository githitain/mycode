package executionEngine;
 
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import config.ActionKeywords;
import utility.ExcelUtils;
import config.Constants;
 
public class DriverScript 
{
	public static Properties OR;
	public static ActionKeywords actionKeywords;
	public static String sActionKeyword;
	public static String sPageObject;
	public static Method method[];
 
	public DriverScript() throws NoSuchMethodException, SecurityException
	{
		actionKeywords = new ActionKeywords();
		method = actionKeywords.getClass().getMethods();
	}
 
    public static void main(String[] args) throws Exception 
    {
 
    	DriverScript b1 = new DriverScript(); 
    	String sPath = Constants.Path_TestData; 
    	ExcelUtils.setExcelFile(sPath, Constants.Sheet_TestSteps);
    	System.out.println();
    	
    	String Path_OR=Constants.Path_OR;
    	FileInputStream fs = new FileInputStream(Path_OR);
    	OR=new Properties(System.getProperties());
    	OR.load(fs);

    	for (int iRow = 1;iRow <= 5;iRow++)
    	{
		 
    		sActionKeyword = ExcelUtils.getCellData(iRow, Constants.Col_ActionKeyword);
    		sPageObject = ExcelUtils.getCellData(iRow, Constants.Col_PageObject);
    		execute_Actions();
    	}
     }
	
	private static void execute_Actions() throws Exception 
    {
		/*for(int i = 0;i <method.length;i++)
		{
			System.out.println(method[i]);
		}*/
		for(int i = 0;i <method.length;i++)
		{
			System.out.println(method.length);
			System.out.println(method[i]);
			
			if(method[i].getName().equals(sActionKeyword))
			{
				System.out.println(sActionKeyword);
				System.out.println(sPageObject);
				method[i].invoke(actionKeywords,sPageObject);
				break;
			}
		}
	}
 }