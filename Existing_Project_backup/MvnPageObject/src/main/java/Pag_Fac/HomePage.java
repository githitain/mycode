package Pag_Fac;
import org.testng.annotations.*;
import junit.framework.*;
import com.thoughtworks.selenium.*;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.junit.*;
import java.io.*;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.text.SimpleDateFormat;
import java.lang.String;
import static org.junit.Assert.*;
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
import com.thoughtworks.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;

import java.io.*;
import java.util.Calendar;
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

public class HomePage 
{
	String s4,s5;
	final WebDriver driver;
	
	/*@FindBy(linkText= "Inbox")
	private WebElement InboxLink;*/
	
	@FindBy(linkText= "Sent Mail")
	private WebElement Sent;
	
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		
	}
	
/*	public void Inboxv() 
	{
		/*if(InboxLink.isDisplayed())
		{
			s4 ="TC-4 Passed - Element is Present";
		}
		else
		{
			s4 ="TC-4 Failed - Element is not Present";
		}
		InboxLink.click();
	}*/
	
	public void SentButton() 
	{
		if(Sent.isDisplayed())
		{
			s5 ="TC-5 Passed - Element is Present";
		}
		else
		{
			s5 ="TC-5 Failed - Element is not Present";
		}
		Sent.click();
	}
	
	public LoginPage logout() throws Exception 
	{
		Thread.sleep(5000);
		SentButton();
		Thread.sleep(2000);
				
		File file = new File("src/test/resources/Test_Result.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = sdf.format(cal.getTime());
		
		bw.write(s + "-" +s5);
        bw.newLine();
        bw.flush();
        bw.close();
			
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
}
