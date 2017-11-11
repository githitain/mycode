package TestSuites;

import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
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

import POM.*;


public class TestSuite_1 extends POM.Runner
{
	HomePage ObjHomePage=PageFactory.initElements(driver, HomePage.class);
	final static Logger logger = Logger.getLogger(TestSuite_1.class);
	
	//TC_1----------------------------------------------
	@Test
	public boolean TC1_Login() throws Exception 
	{
		boolean flag=false;
		MainPage.TCcount++;
		try
		{
			
		logger.info("TC1_Login Started-----------------");

		ObjHomePage.clickSigninAction();
		ObjLoginPage.loginAction(TestDataC.getValue("name"),TestDataC.getValue("pin"),TestDataC.getValue("code"),TestDataC.getValue("username"));
		ObjHomePage.searchbtn(TestDataC.getValue("Searchterm"));
		ObjeLendPage.logout();
		System.out.println("TC1_Login-Passed");
		logger.info("TC1_Login passed");
		
		MainPage.passcount++;
		
		flag=true;
		}
		catch(Exception ee)
		{
			System.out.println("TC1_Login-Failed");
			ee.printStackTrace();
			logger.error("TC1_Login failed");
			MainPage.failcount++;
			flag=false;
			throw ee;
			
		}
		return flag;
	}
	
	//TC_2----------------------------------------
	@Test
	public void TC1_SearchTerm() throws Exception 
	{
		MainPage.TCcount++;
		try
		{
		logger.info("TC1_SearchTerm Started -------------------------");
		ObjHomePage.searchbtn(TestDataC.getValue("Searchterm"));
		ObjeLendPage.SearchResultDisplay();
		
		System.out.println("TC1_SearchTerm-Passed");
		logger.info("TC1_SearchTerm passed");
		MainPage.passcount++;
		
		}
		catch(Exception ee)
		{
			System.out.println("TC1_SearchTerm-Failed");
			ee.printStackTrace();
			logger.error("TC1_SearchTerm failed");
			MainPage.failcount++;
			throw ee;
		}
	}
	
	//TC_3---------------------------------
	@Test
	public void TS2_Result() throws Exception 
	{
		logger.info("Total Number of Test cases count ="+ MainPage.TCcount);
		logger.info("Total Passed count ="+ MainPage.passcount);
		logger.info("Total Failed count ="+ MainPage.failcount);
		
	}
}
