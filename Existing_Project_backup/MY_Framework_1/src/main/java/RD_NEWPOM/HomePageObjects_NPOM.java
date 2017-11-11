package RD_NEWPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePageObjects_NPOM extends BaseClass_NPOM{
	private static WebElement element;
//	public static String sProductName;
//	public static String sProductPrice;
	
	public static String sUsername;
	public static String sPassword;
	public static String sSubmit;
	
	
 public HomePageObjects_NPOM(WebDriver driver){
	super(driver);
	}
 
 public static WebElement f_username(){
	 element = null;
   	try{
   		element= driver.findElement(By.xpath(".//*[@id='h_username']"));
   		Log_NPOM.info("Product Price for purchased product is found on the Check Out Page");
   	}catch (Exception e){
   		Log_NPOM.error("Price for purchased product on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement f_Password(){
	 element = null;
   	try{
   		element= driver.findElement(By.xpath(".//*[@id='h_password']"));
   		Log_NPOM.info("Product Name for purchased product is found on the Check Out Page");
   	}catch (Exception e){
   		Log_NPOM.error("Price for purchased product on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }
 
 public static WebElement f_Submit(){
	 element = null;
   	try{
   		element= driver.findElement(By.xpath(".//*[@id='patronAccount']/div[2]/form/ul/li[5]/input[2]"));
   		Log_NPOM.info("Continue button is found on the Check Out Page");
   	}catch (Exception e){
   		Log_NPOM.error("Continue button on Check Out page is not found");
   		throw(e);
   		}
   	return element;
    }
}
