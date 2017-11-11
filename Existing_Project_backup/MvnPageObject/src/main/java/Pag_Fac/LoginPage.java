package Pag_Fac;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.Assert;
import org.testng.annotations.*;
import com.thoughtworks.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import java.io.*;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.text.SimpleDateFormat;
import java.lang.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;
import java.util.*;
//import org.openqa.selenium.WebDriverBackedSelenium.*;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.server.SeleniumServer;
import org.openqa.selenium.server.RemoteControlConfiguration;
@SuppressWarnings("unused")

public class LoginPage 
{
	
	private WebDriver driver;
	String s1,s2,s3,s4,s5,s6,s7;
	String pagsource;
	boolean found;
	
	@FindBy(id="Email")
	private WebElement loginEdit;

	@FindBy(id="Passwd")
	private WebElement passwordEdit;
		
	@FindBy(id="signIn")
	private WebElement loginButton;
	
	       
	public LoginPage(WebDriver driver) throws Exception 
	{
		this.driver = driver;
	}
	
	public void enterLogin(String login)
	{ 
		try
		{		
			loginEdit.isDisplayed(); 
			s1 ="TC-1 Passed - Element1 is Present";
			System.out.println("Element1 is Present");
			loginEdit.clear();
			loginEdit.sendKeys(login);
		}
		catch(Exception e)
		{
			s1 ="TC-1 Failed- Element1 is not Present";
			System.out.println("Element1 is not Present");
		}
	}
	
	public void enterPassword(String password) 
	{
		try
		{
			passwordEdit.isDisplayed();
			s2 ="TC-2 Passed - Element2 is Present";
			System.out.println("Element2 is Present");
			passwordEdit.clear();
			passwordEdit.sendKeys(password);
		}
		catch(Exception e)
		{
			s2 ="TC-2 Failed-Element is not Present";
			System.out.println("Element2 is not Present");
		}
	}
	
	public void clickLoginButton()
	{
		try
		{
			
			loginButton.isDisplayed();
			s3 ="TC-3 Passed - Element3 is Present";
			System.out.println("Element3 is Present");
			found = true;
			
		}
		catch(Exception e)
		{
			s3 ="TC-3 Failed-Element is not Present";
			System.out.println("Element3 is not Present");
			found = false;
		}
		
		if (found==true)
		{ 
			loginButton.click();
			pagsource= driver.getPageSource();
			if(pagsource.contains("Enter your email address"))
			{	
					s4= "TC-4 Failed-email address is blank";
					
			}
			else if (pagsource.contains("Enter your password."))
			{
					s4= "TC-4 Failed-Password address is blank";
					
			}
			else if (pagsource.contains("The email or password you entered is incorrect."))
			{
					s4= "TC-4 Failed-Email or Password address is incorrect";
					
			}
			else
			{
					s4="TC-4 Passed-Login Done successfuly";
			}
		}
		else
		{
			s4="TC-4 Failed-Login was not done successfuly";
			
		}
			
	}
		
	public HomePage login(String login, String password) throws Exception 
	{
		enterLogin(login);
		enterPassword(password);
		clickLoginButton();
        Thread.sleep(2000);
        
		File file = new File("src/test/resources/Test_Result.txt");
	    FileWriter fileWriter = new FileWriter(file);
	    BufferedWriter bw = new BufferedWriter(fileWriter);
	    Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = sdf.format(cal.getTime());
		
        bw.write(s + "-" +s1);
        bw.newLine();
        bw.write(s + "-" +s2);
        bw.newLine();
        bw.write(s + "-" +s3);
        bw.newLine();
        bw.write(s + "-" +s4);
        bw.newLine();
        bw.flush();
        bw.close();
        
        return PageFactory.initElements(driver, HomePage.class);
	}
	
}
