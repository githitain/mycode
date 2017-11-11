/**
 * 
 */
/**
 * @author hitendra.pawar
 *
 */
package Other_testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Excel_Parametraztion.RespositoryParser;
import ExecutionDriver.Runner;
import Global_Common_Function.Comman_Function;
import Parametation_Propetiese_File.Properties_File_reading;
import Parametration_XML.XML_file_Reading;

public class TC_SBI_Homepage
{
	public static void sirra_login() throws Exception
	{
		
		Runner.driver.findElement(By.name("j_username")).clear();
		Runner.driver.findElement(By.name("j_username")).sendKeys("iiii");
		Runner.driver.findElement(By.name("j_username")).clear();
		Runner.driver.findElement(By.name("j_username")).sendKeys("iii");
		Runner.driver.findElement(By.name("j_password")).clear();
		Runner.driver.findElement(By.name("j_password")).sendKeys("30848noi");
		Runner.driver.findElement(By.cssSelector("input.button")).click();
		Runner.driver.findElement(By.id("DirectLink_3_0")).click();
		
		
	}
	public static void sirra_search() throws Exception
	{
		
		String Uname= "epop";
		for (int i=0; i<1; i++)
		{
		
			StringBuffer e1= new StringBuffer(Uname).append(i);  
		
		
		Runner.driver.findElement(By.id("createUserLink")).click();
		Runner.driver.findElement(By.id("userNameInput")).clear();
		Runner.driver.findElement(By.id("userNameInput")).sendKeys(e1);
		Runner.driver.findElement(By.id("fullNameField")).clear();
		Runner.driver.findElement(By.id("fullNameField")).sendKeys(e1);
		Runner.driver.findElement(By.id("passwordInput")).clear();
		Runner.driver.findElement(By.id("passwordInput")).sendKeys(e1);
		Runner.driver.findElement(By.id("confirmPasswordInput")).clear();
		Runner.driver.findElement(By.id("confirmPasswordInput")).sendKeys(e1);
	    new Select(Runner.driver.findElement(By.id("languageChooser"))).selectByVisibleText("English");
	    Runner.driver.findElement(By.id("Submit_1")).click();
	    Runner.driver.findElement(By.id("link_edituser_tabEDIT_TAB_APPLICATIONS")).click();
	    Runner.driver.findElement(By.cssSelector("span.addAll")).click();
	    Runner.driver.findElement(By.xpath("//button[@type='button']")).click();
	    Runner.driver.findElement(By.id("Submit_1")).click();
	    Runner.driver.findElement(By.id("link_edituser_tabEDIT_TAB_PERMISSIONS")).click();
	    Runner.driver.findElement(By.cssSelector("span.addAll")).click();
	    Runner.driver.findElement(By.id("Submit_1")).click();
	    Runner.driver.findElement(By.id("link_edituser_tabEDIT_TAB_WORKFLOWS")).click();
	    Runner.driver.findElement(By.id("Submit_1")).click();
	    Runner.driver.findElement(By.id("linkUsers")).click();
	    
	    System.out.println("user has been created" + e1);
	    
	}
		
	}
	
	public static void Cap_Login() throws Exception
	{
		Comman_Function.AddpopWindowHanlded(Runner.driver);
		
		WebElement element=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "Cop_log_select"));
		Select se=new Select(element);
		se.selectByVisibleText(XML_file_Reading.getXMLTagValue("X_SBI", "selectLogin"));

		WebElement el_login=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "cop_login"));
		el_login.click();
		WebElement el_continue=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "Continue_link"));
		el_continue.click();
		
		WebElement username=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "cop_username"));
		username.sendKeys(XML_file_Reading.getXMLTagValue("X_SBI", "Cop_user"));
		
		WebElement password=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "cop_password"));
		password.sendKeys(XML_file_Reading.getXMLTagValue("X_SBI", "Cop_pass"));
		
		WebElement el_cop_submit=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "cop_submit"));
		el_cop_submit.click();
		
		Comman_Function.verifyText(XML_file_Reading.getXMLTagValue("X_SBI", "VTxt1"),Runner.driver);
		
		WebElement el_cop_reset=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "cop_reset"));
		el_cop_reset.click();
		
		//Comman_Function.verifyText("");
	  	}
	
	public static void Personal_Login(String Username, String Password) throws Exception
	{
		Comman_Function.AddpopWindowHanlded(Runner.driver);
		
		WebElement Pelement=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "personal_login"));
		Pelement.click();

		WebElement el_continue=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "Continue_link"));
		el_continue.click();
		
		WebElement username=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "cop_username"));
		username.sendKeys(Username);
		
		WebElement password=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "cop_password"));
		password.sendKeys(Password);
		
		WebElement el_cop_submit=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "cop_submit"));
		el_cop_submit.click();
		
		Comman_Function.verifyText(XML_file_Reading.getXMLTagValue("X_SBI", "VTxt1"),Runner.driver);
		
		WebElement el_cop_reset=Runner.driver.findElement(RespositoryParser.getbjectLocator("SBI", "cop_reset"));
		el_cop_reset.click();
		
		//Comman_Function.verifyText("");
	  	}
	
	public static void GoTOHomePage() throws Exception
	{
		Comman_Function.LandingPage(Properties_File_reading.getBrowserUrl("local"), Runner.driver);
	}
}



