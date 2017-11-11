package Pag_Fac;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;

import java.io.*;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import junit.framework.TestCase;

import org.junit.Test;


public class LoginLogoutTest extends TestCase 
{
	WebDriver driver;
	@BeforeMethod
	public void setUp() throws Exception 
	{
	try
	{
		//driver = new FirefoxDriver();
	
		if (Runner.getBrowserUrl("browser").equals("*htmlunit"))
		{
			driver = new HtmlUnitDriver();
		}
		
		if (Runner.getBrowserUrl("browser").equals("*firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		if (Runner.getBrowserUrl("browser").equals("*internetexplorer"))
		{
			System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		if (Runner.getBrowserUrl("browser").equals("*googlechrome"))
		{
			System.setProperty("webdriver.ie.driver", "src/test/resources/chromedriver.exe"); 
	         DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	         capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));
	         driver = new ChromeDriver(capabilities);
	        
		}
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Runner.getTime("time"), TimeUnit.SECONDS);
	
	}
	catch (Exception e)
	{
	System.out.println(e.getMessage());
	}
		
	}
		
		
			
	@org.testng.annotations.Test
	public void testLoginLogout() throws Exception 
	{
		driver.get(Runner.getBrowserUrl("local"));
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
				
		BufferedReader init = new BufferedReader(new FileReader("src/test/resources/testdata.txt"));
		String strn;
		String[] at = new String[2];
		while ((strn = init.readLine()) != null) 
			{
				if(strn == null || strn.isEmpty())
				break;
				at = strn.split(",");
			}
		HomePage homePage = loginPage.login(at[0], at[1]);
		LoginPage loginPageAfterLogout = homePage.logout();
	}
	
	@AfterMethod 
	public void tearDown() throws Exception 
	{
		driver.quit();
	}
}