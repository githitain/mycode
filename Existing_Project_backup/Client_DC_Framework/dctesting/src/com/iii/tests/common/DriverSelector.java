package com.iii.tests.common;
/**

 * @version $Id: DriverSelector.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

public class DriverSelector {
	
	@SuppressWarnings("deprecation")
	public static WebDriver selectWebDriver(String targetBrowser) {
		WebDriver driver = null;
		
		if (targetBrowser.contains("firefox")) {
			driver = new FirefoxDriver();
			System.out.println("\tBrowser: firefox");
			// Reporter.log("<h2>Test conducted on <font color='red'>Firefox</font> browser.</h2>");
		} else if (targetBrowser.contains("iexplore")) {
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(ieCapabilities);
			Reporter.log("<h2>Test conducted on <font color='red'>IE</font> browser.</h2>");
		} else if (targetBrowser.contains("googlechrome")) {
			DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
			//chromeCapabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized  --enable-webgl")); 
			chromeCapabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized")); 
			String chromeBinary = System.getProperty(" ");
			if (chromeBinary == null || chromeBinary.equals("")) {
			    String os = System.getProperty("os.name").toLowerCase().substring(0, 3);
			    chromeBinary = "lib/chromedriver.exe";
			    //Note: was not able to bring up Chrome driver on Mac, despite it was correctly installed in the default location (?) 
			    // and it was starting find with --enable-webgl switch from command line
			    System.setProperty("webdriver.chrome.driver", chromeBinary);
			}
			driver = new ChromeDriver(chromeCapabilities);
		    Reporter.log("<h2>Test conducted on <font color='red'>Chrome</font> browser.</h2>");
		} else if (targetBrowser.contains("htmlunit")) {
			DesiredCapabilities huCapabilities = DesiredCapabilities.htmlUnit();
			huCapabilities.setJavascriptEnabled(true);
			driver = new HtmlUnitDriver(huCapabilities);			
			Reporter.log("<h2>Test conducted on <font color='red'>Htmlunit </font> driver.</h2>");
		} else {
			System.out.println("Unknown browser = " + targetBrowser
					+ "! unable to determine the driver - exit");
			System.exit(1);
		}		
	
		
		return driver;
	}

	/* every time an element is located, if the element is not present,
	 *  the location is retried until either it is present, or until 30 seconds have passed
	 */
	public static void setWaitTimeout(WebDriver driver, int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS); 		
	}
	public static void windowMaximize(WebDriver driver) {
			((JavascriptExecutor) driver).executeScript("if (window.screen){window.moveTo(0, 0);window.resizeTo(window.screen.availWidth, window.screen.availHeight);};");
	}

}
