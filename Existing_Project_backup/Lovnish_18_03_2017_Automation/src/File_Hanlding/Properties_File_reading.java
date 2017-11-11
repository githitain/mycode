package File_Hanlding;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Properties_File_reading 
{
	public static String fileLocation = "src//resources//Configuration.txt"; 
	public static void main (String args []) throws Exception
	{
		//getBrowser("browser");
		getBrowserUrl("local");
		getTime("time");
		/*getTD("TD");
		getOR("OR");*/
	}
	
	public static WebDriver getBrowser(String param) throws Exception  // param=firefixe
	{
		WebDriver str = null;
		String str1; 
		try
		{
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream(fileLocation);
			//D:/Workspace_2/JAVA_Parametration_Excel_XML_Propertise_File\Configuration.txt
			p.load(fis);
				
			str1=p.getProperty(param);
				//str1=firefixe
			if ((str1.equals("htmlunit")))
				{
					str = new HtmlUnitDriver();
				}
				
			if (str1.equals("firefox")) 
				{
				
				/*ProfilesIni profile = new ProfilesIni();
				FirefoxProfile myprofile = profile.getProfile("SSL_disabled");
				str = new FirefoxDriver(myprofile);*/
				  //System.setProperty("webdriver.firefox.marionette","D:\\Selenium jar\\Selenium-3.4.0\\geckodriver.exe");  
				  System.setProperty("webdriver.firefox.marionette","src/resources/geckodriver.exe");
					str= new FirefoxDriver();
					
					
				}
			
			if (str1.equals("internetexplorer")) 
				{
					System.setProperty("webdriver.ie.driver","src/resources/IEDriverServer.exe");
					str= new InternetExplorerDriver();
				}
				
			if (str1.equals("chrome")) 
				{
				System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
					//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
					str= new ChromeDriver();
				}
			fis.close();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(str);
		return str;
	}
	
	public static String getBrowserUrl(String param) throws Exception 
	{
		String str = null;
		try
		{
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream(fileLocation);
			p.load(fis);
			str=p.getProperty(param);
			fis.close();
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(str);
		return str;
	}
	
	public static long getTime(String param) throws Exception 
	{
		String str = null;
		try
		{
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream(fileLocation);
			p.load(fis);
			str=p.getProperty(param);
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(str);
		return Long.parseLong(str);
	}
	public static String getOR(String param) throws Exception 
	{
		String str = null;
		try
		{
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream(fileLocation);
			p.load(fis);
			str=p.getProperty(param);
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(str);
		return str;
	}
	public static String getTD(String param) throws Exception 
	{
		String str = null;
		try
		{
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream(fileLocation);
			p.load(fis);
			str=p.getProperty(param);
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(str);
		return str;
	}
	public static String getOther(String param) throws Exception 
	{
		String str = null;
		try
		{
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream(fileLocation);
			p.load(fis);
			str=p.getProperty(param);
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(str);
		return str;
	}
}
