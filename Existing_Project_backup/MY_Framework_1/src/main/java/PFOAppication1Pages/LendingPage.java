package PFOAppication1Pages;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PFO.Library.PFOLibrary;
import PFO.Library.PFOLibraryImpl;
import POM.RespositoryParser;
import POM.Runner;
import POM.RespositoryParser;
import POM.Runner;
import POM.TestDataC;

public class LendingPage extends PFOLibraryImpl
{
	private WebDriver driver;
	final static Logger logger = Logger.getLogger(LendingPage.class);
	
	WebElement bib01,searchbtn1,logout01,logoutyes01;
	String sheetName = "LoginPage";

	
	public Object SearchResultDisplay(String... link) throws Exception
	{
		
		try{
			bib01 = Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"bib1"));
			bib01.click();
			Thread.sleep(2000);
			System.out.println("SearchResultDisplay-Test Case is Passed");
			logger.info("SearchResultDisplay is passed");
		}
		
		catch(Exception ee)
		{
			System.out.println("SearchResultDisplay - Test Case is Failed");
			ee.printStackTrace();
			logger.error("SearchResultDisplay is failed");
			throw ee;
		}
		
		return PageFactory.initElements(driver,HomePage.class);
	}
	public Object logout(String... link) throws Exception
	{
		
		try{
			logout01 = Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"logout"));
			logout01.click();
			
			logoutyes01 = Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"logoutyes"));
			logoutyes01.click();
			
			Thread.sleep(2000);
			System.out.println("logout-Test Case is Passed");
			logger.info("logout is passed");
		}
		
		catch(Exception ee)
		{
			System.out.println("logout - Test Case is Failed");
			ee.printStackTrace();
			logger.error("logout is failed");
			throw ee;
		}
		
		return PageFactory.initElements(driver,HomePage.class);
	}
	
	
}
