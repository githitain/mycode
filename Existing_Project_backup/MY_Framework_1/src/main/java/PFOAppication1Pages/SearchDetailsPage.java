package PFOAppication1Pages;
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

public class SearchDetailsPage {
	
	private WebDriver driver;
	WebElement logout01,logoutyes01;

	String sheetName = "LoginPage";
	
	public Object logout(String... link) throws Exception
	{
		
		try{
			logout01 = Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"logout"));
			logout01.click();
			
			logoutyes01 = Runner.driver.findElement(RespositoryParser.getbjectLocator(sheetName,"logoutyes"));
			logoutyes01.click();
			
			Thread.sleep(2000);
			System.out.println("logout-Test Case is Passed");
		}
		
		catch(Exception ee)
		{
			System.out.println("logout - Test Case is Failed");
			ee.printStackTrace();
			throw ee;
		}
		
		return PageFactory.initElements(driver,HomePage.class);
	}

}
