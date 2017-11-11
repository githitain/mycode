
package PFOAppication1Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PFO.Library.PFOLibrary;
import PFO.Library.PFOLibraryImpl;
import POM.RespositoryParser;
import POM.Runner;
import POM.TestDataC;

import org.apache.log4j.Logger;

public class HomePage extends PFOLibraryImpl 
{
	
	final static Logger logger = Logger.getLogger(HomePage.class);
	private WebDriver driver;
	
	WebElement Loginlink, searchbox1,searchbtn1,logout01,logoutyes01;
	String sheetName = "LoginPage";
	
	public Object clickSigninAction(String... link)
	{
		try{
			JavascriptExecutor jse = (JavascriptExecutor) Runner.driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			
			Loginlink =Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"login"));
			//Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"login"));

			Loginlink.click();
			System.out.println("clickSigninAction-Test Case is Passwed");
			logger.info("clickSigninAction is passed");
		}
		catch(Exception ee)
		{
			System.out.println("clickSigninAction-Test Case is Failed");
			ee.printStackTrace();
			logger.error("clickSigninAction is failed");
			throw ee;
		}
		return PageFactory.initElements(driver,LoginPage.class);	
	}
	
		
	public Object searchbtn(String... link) throws Exception
	{
		try{
			
			searchbox1 =Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"searchbox"));
			searchbox1.sendKeys(link[0]);
			searchbtn1=Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"searchbtn"));
			searchbtn1.click();
			System.out.println("searchbtn-Test Case is Passwed");
			logger.info("searchbtn is passed");
		}
		catch(Exception ee)
		{
			System.out.println("searchbtn-Test Case is Failed");
			ee.printStackTrace();
			logger.error("searchbtn is failed");
			throw ee;
		}
		return PageFactory.initElements(driver,LendingPage.class);	
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

