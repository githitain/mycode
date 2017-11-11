package Pag_Fac;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class Runner 
{
	public static String getBrowserUrl(String param) throws Exception 
	{
		String str = null;
		try
		{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/Configuration.txt");
		p.load(fis);
		str=p.getProperty(param);
		return str;
		}
		
		catch (Exception e)
		{
		System.out.println(e.getMessage());
		return str;
		}
	}
	
	public static long getTime(String param) throws Exception 
	{
		String str =null;
		try
		{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/Configuration.txt");
		p.load(fis);
		str=p.getProperty((param));
		return Long.parseLong(str);
		}
		
		catch (Exception e)
		{
		System.out.println(e.getMessage());
		return Long.parseLong(str);
		}
	}

	/*public static String getTestData() throws Exception 
	{
	/*BufferedReader init = new BufferedReader(new FileReader("D:/Selenium Global Logic/eclipes_indio_project/PageObject/testdata.txt"));
	String strn;
	String[] at = new String[2];
	while ((strn = init.readLine()) != null) 
	{
		if(strn == null || strn.isEmpty())
		break;
		at = strn.split(",");
	}
	return strn;
	}
	*/
}

