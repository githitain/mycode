
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Explain_WebDriver_Syntex 
{
	public static void main(String[] args) 
	{
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		//  Wait For Page To Load
		// Put a Implicit wait, this means that any search for elements on the page
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//could take the time the implicit wait is set for before throwing exception 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Navigate to URL
		driver.get("https://mail.google.com/");
		// Maximize the window.
		driver.manage().window().maximize();
		// Enter UserName
		driver.findElement(By.id("Email")).sendKeys("webtraining019");
		// Enter Password
		driver.findElement(By.xpath(".//*[@id='next']")).click();
		// Wait For Page To Load
		// Click on 'Sign In' button
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("12466");
		
		//Click on Compose Mail.
		driver.findElement(By.id("signIn")).click();
		// Click on the image icon present in the top right navigational Bar
		driver.findElement(By.linkText("Forgot password?")).click();
		//Click on 'Logout' Button
		//driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		//Close the browser.
		driver.close();
		}
	}
