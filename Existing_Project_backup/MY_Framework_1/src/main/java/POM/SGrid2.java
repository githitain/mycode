//package POM;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//public class SGrid2 {
//	  private WebDriver driver;
//	   private String baseUrl;
//	 
//	   @BeforeMethod
//	   public void setUp() throws MalformedURLException {
//	      URL hubUrl = new URL("http://localhost:4444/wd/hub");
//	      DesiredCapabilities capabilities = new DesiredCapabilities();
//	      capabilities.setBrowserName("iexplore");
//	      capabilities.setPlatform(Platform.WINDOWS);
//	 
//	      driver = new RemoteWebDriver(hubUrl, capabilities);
//	      baseUrl = "http://www.google.com/";
//	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	   }
//	 
//	   @Test
//	   public void IE() {
//	      driver.get(baseUrl);
//	      driver.findElement(By.id("gbqfq")).clear();
//	      driver.findElement(By.id("gbqfq")).sendKeys("selenium");
//	      driver.findElement(By.id("gbqfb")).click();
//	      driver.findElement(By.linkText("Downloads")).click();
//	   }
//	 
//	   @AfterMethod
//	   public void tearDown() {
//	      driver.quit();
//	   }
//	
//
//}
