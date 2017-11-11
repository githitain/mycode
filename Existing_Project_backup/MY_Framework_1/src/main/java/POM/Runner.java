package POM;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
import PFOAppication1Pages.GoToPage;
import PFOAppication1Pages.HomePage;
import PFOAppication1Pages.LendingPage;
import PFOAppication1Pages.LoginPage;
import PFOAppication1Pages.SearchDetailsPage;
import POM.Configuratin_setting;
import POM.Configuratin_setting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Runner

{
	public static WebDriver driver;
	
	//public HomePage ObjHomePage, ObjHomePage1;
	public LoginPage ObjLoginPage;
	public LendingPage ObjeLendPage;
	public TestDataC ObjTestDatac;
	//ObjectRepository ObjObjectRepository;
	public RespositoryParser parser;
	public SearchDetailsPage ObjSearchDetailsPage;
	public GoToPage objGoToPage;

	@BeforeMethod
	public void setUp() throws Exception

	{
//		WebDriverWait wait = new WebDriverWait(driver, 15);
		try {

			driver = Configuratin_setting.getBrowser("browser");
			driver.manage().timeouts().implicitlyWait(Configuratin_setting.getTime("time"),TimeUnit.SECONDS);
			driver.get(Configuratin_setting.getBrowserUrl("environment"));
			parser = new RespositoryParser();
			//ObjHomePage=PageFactory.initElements(driver, HomePage.class);
			ObjLoginPage = PageFactory.initElements(driver, LoginPage.class);
			ObjeLendPage = PageFactory.initElements(driver, LendingPage.class);
			ObjSearchDetailsPage = PageFactory.initElements(driver, SearchDetailsPage.class);
			objGoToPage=PageFactory.initElements(driver, GoToPage.class);
			//wait.until(isTrue).ignore(null).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[style='color: white;']")));
			
			
			
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private void white(String string) {
		// TODO Auto-generated method stub
		
	}

	/*@Test
	public void TS1_Login() throws Exception {
		
		/*try{
		ObjHomePage.clickSigninAction();
		ObjLoginPage.loginAction();
		ObjHomePage.searchbtn();
		ObjeLendPage.logout();
		System.out.println("TC1_Login-Passed");
		}
		catch(Exception ee)
		{
			System.out.println("TC1_Login-Failed");
			ee.printStackTrace();
		}
		
		
	}*/
	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}
}
