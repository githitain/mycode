package RD_Reusable_Components;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import POM.Runner;
import com.google.common.base.Function;

public class Componetns 

{

	/////Flaunt Wait Example
	 
	private WebElement fluentWait(final WebElement s1) {
    Wait<WebDriver> wait = new FluentWait<WebDriver>(Runner.driver) //
            .withTimeout(5, TimeUnit.SECONDS) //
            .pollingEvery(100, TimeUnit.MILLISECONDS) //
            .ignoring(NoSuchElementException.class);

    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

        public WebElement apply(WebDriver driver) {
            //return driver.findElement(By.xpath(".//*[@id='wrapper']/div[6]/div[2]/div/div[2]/div[1]/span[1]/a"));
            return s1;
        }
    });

    foo.click();
    return foo;
	}
    
 /////Flaunt Wait Example  

}
