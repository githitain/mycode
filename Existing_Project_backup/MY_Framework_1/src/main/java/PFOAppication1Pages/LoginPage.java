package PFOAppication1Pages;
import java.io.File;
import java.io.FileInputStream;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import PFO.Library.PFOLibrary;
import PFO.Library.PFOLibraryImpl;
import POM.TestDataC;
import POM.Runner;
import POM.RespositoryParser;


public class LoginPage extends PFOLibraryImpl 
{
	final static Logger logger = Logger.getLogger(LoginPage.class);
	private WebDriver driver;
	
	WebElement name01,code01,user_name01,pin01,submit1;
	String sheetName= "LoginPage";
	
	public Object loginAction(String... link) throws Exception
	{		try
		{
			name01 = Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"name"));
			name01.sendKeys(link[0]);
			
			code01 = Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"code"));
			code01.sendKeys(link[1]);
			
			user_name01 = Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"username"));
			user_name01.sendKeys(link[2]);
			
			pin01 = Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"pin"));
			pin01.sendKeys(link[3]);
			
			submit1= Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"submit"));
			submit1.click();
			
			logger.info("loginAction is passed");
			System.out.println("loginAction-Test Case is Passed");
			
		}
		catch(Exception ee)
		{
			System.out.println("loginAction-Test Case is Failed");
			ee.printStackTrace();
			logger.error("loginAction is failed");
			throw ee;
		}
		return PageFactory.initElements(driver,HomePage.class);
	}
	
}
