package ExecutionDriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Other_testcases.TC_Naukari_Homepage;
import Parametation_Propetiese_File.Properties_File_reading;

public class Runner 
{ 

	//public TC_Homepage HP;
	
	public static WebDriver driver;
	@BeforeMethod
	public void setUp() throws Exception
	{
		driver=Properties_File_reading.getBrowser("browser");
		driver.get(Properties_File_reading.getBrowserUrl("local"));
		driver.manage().timeouts().implicitlyWait(Properties_File_reading.getTime("time"),TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}	