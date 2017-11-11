package POM;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import POM.Runner;

public class Configuratin_setting 
{
	String htmlunit;
	String internetexplorer;
	String googlechrome;
	
	public static WebDriver getBrowser(String param) throws Exception 
	{
		WebDriver str = null;
		String str1; 
		try
		{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/Configuration.txt");
		p.load(fis);
		str1=p.getProperty(param);

		if ((str1.equals("htmlunit")))
			{
				str = new HtmlUnitDriver();
			}

			if (str1.equals("firefox")) 
			{
				str= new FirefoxDriver();
			}
			if (str1.equals("internetexplorer")) 
			{
				System.setProperty("webdriver.ie.driver","src/test/resources/IEDriverServer.exe");
				str= new InternetExplorerDriver();

			}
			if (str1.equals("internetexplorer")) 
			{
				System.setProperty("webdriver.ie.driver","src/test/resources/chromedriver.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
				
				str= new ChromeDriver(capabilities);
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		//System.out.println(str);
		return str;
	}

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

}
