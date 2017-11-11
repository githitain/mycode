package TestSuites;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import PFO.Library.PFOLibrary;
import PFO.Library.PFOLibraryImpl;
import PFOAppication1Pages.HomePage;
import PFOAppication1Pages.LendingPage;
import PFOAppication1Pages.LoginPage;
import PFOAppication1Pages.SearchDetailsPage;
import POM.Configuratin_setting;
import POM.Configuratin_setting;
import POM.MainPage;
import POM.TestDataC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class TestSuite_2  extends POM.Runner
{	final static Logger logger = Logger.getLogger(TestSuite_2.class);
	HomePage ObjHomePage=PageFactory.initElements(driver, HomePage.class);
	
	//TC_1----------------------------------------------
	@Test
	public void TC2_Login() throws Exception 
	{
		
		try{
		logger.info("TC2_Login -----------------");
		ObjHomePage.clickSigninAction();
		ObjLoginPage.loginAction(TestDataC.getValue("name"),TestDataC.getValue("pin"),TestDataC.getValue("code"),TestDataC.getValue("username"));
		ObjHomePage.logout();
		System.out.println("TC2_Login-Passed");
		logger.info("TC2_Login passed");
		
		}
		catch(Exception ee)
		{
			System.out.println("TC2_Login-Failed");
			ee.printStackTrace();
			logger.error("TC2_Login failed");
			//logger.info("\total fail count: "+);
		}
	}
	
	//TC_2----------------------------------------------
	@Test
	public void TC2_SearchTerm() throws Exception 
	{
		
		try
		{
		logger.info("TC2_SearchTerm -----------------");
		ObjHomePage.searchbtn(TestDataC.getValue("Searchterm"));
		ObjeLendPage.SearchResultDisplay();
		System.out.println("TC2_SearchTerm-Passed");
		logger.info("TC2_SearchTerm Passed");
		}
		catch(Exception ee)
		{
			System.out.println("TC2_SearchTerm-Failed");
			ee.printStackTrace();
			logger.error("TC2_SearchTerm Passed");
		}
	}
	
	//TC_3----------------------------------------------
	@Test
	public void TS2_Result() throws Exception 
	{
		logger.info("Total Number of Test cases count ="+ MainPage.TCcount);
		logger.info("Total Passed count ="+ MainPage.passcount);
		logger.info("Total Failed count ="+ MainPage.failcount);
	}
}
