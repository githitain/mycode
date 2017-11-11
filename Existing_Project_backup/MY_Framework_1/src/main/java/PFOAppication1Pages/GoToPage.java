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
import POM.TestDataC;

public class GoToPage {

	private WebDriver driver;

	public Object GoToHomePage(String... link) 
	{
		try 
		{
			Runner.driver.navigate().refresh();
			Runner.driver.wait(2000);
			System.out.println("GoToHomePage- Test case is Passed");
		} 
		catch (Exception ee) 
		{
			System.out.println("GoToHomePage-Test Case is Failed");
			ee.printStackTrace();
		}
		return PageFactory.initElements(driver, HomePage.class);
	}
	public Object GoToLoginPage(String... link) 
	{
		try 
		{
			Runner.driver.navigate().refresh();
			Runner.driver.wait(2000);
			
			System.out.println("GoToHomePage- Test case is Passed");
		} 
		catch (Exception ee) 
		{
			System.out.println("GoToHomePage-Test Case is Failed");
			ee.printStackTrace();
		}
		return PageFactory.initElements(driver, LoginPage.class);
	}
	public Object GoToLendingPage(String... link) 
	{
		try 
		{
			Runner.driver.wait(2000);
			
			System.out.println("GoToHomePage- Test case is Passed");
		} 
		catch (Exception ee) 
		{
			System.out.println("GoToHomePage-Test Case is Failed");
			ee.printStackTrace();
		}
		return PageFactory.initElements(driver, LendingPage.class);
	}
	public Object GoToSearchDetailsPage(String... link) 
	{
		try 
		{
			Runner.driver.navigate().refresh();
			Runner.driver.wait(2000);
			
			System.out.println("GoToHomePage- Test case is Passed");
		} 
		catch (Exception ee) 
		{
			System.out.println("GoToHomePage-Test Case is Failed");
			ee.printStackTrace();
		}
		return PageFactory.initElements(driver, SearchDetailsPage.class);
	}

}