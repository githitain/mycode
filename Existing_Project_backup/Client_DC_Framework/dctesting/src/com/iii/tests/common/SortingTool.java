package com.iii.tests.common;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import junit.framework.Assert;



public class SortingTool {
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String baseUrl ="http://dc-suth.iii.com/";
		driver.get(baseUrl);
		driver.findElement(By.id("username")).sendKeys("dcadmin");
		driver.findElement(By.id("password")).sendKeys("suthadmin");
		driver.findElement(By.id("submit")).click();
	    driver.findElement(By.xpath(".//*[@id='development']/img")).click();
		driver.findElement(By.linkText("Supply and Demand Buying")).click();
		driver.findElement(By.id("submit")).click();  
		
		try {			

			WebElement html = driver.findElement(By.xpath("//input[@id='fileExportOpenButton']"));
			for(int i =0 ; i< 3;i++){
			html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
			}
			
			 List<WebElement> divList =  driver.findElements(By.cssSelector("div.upperImage"));

			for(int i = 0; i < divList.size(); ++i) {

				int newNumI = i + 1;
				
				Thread.sleep(4000);
				WebElement w = driver.findElement(By.xpath("(//div[@class='upperImage'])["+newNumI+"]"));
				if(w!=null){
					driver.findElement(By.xpath("(//div[@class='upperImage'])["+newNumI+"]")).click();

					
					Thread.sleep(4000);
					
					Assert.assertFalse("Element present", driver.getPageSource().contains("Error 500"));
					driver.findElement(By.xpath("(//div[@class='lowerImage'])["+newNumI+"]")).click();
					Thread.sleep(4000);
					Assert.assertFalse("Element present", driver.getPageSource().contains("Error 500"));
			
					
					System.out.println("\nPass verification of sorting: "+newNumI+"\n");
				}
				
				
				}
				
			/*   //WebElement element = driver.findElement(By.xpath("//th[@class='Projected_Hold_Wait_Time']//div[@title='Descending [Z-A, 9-0]']"));
			   WebElement element = driver.findElement(By.xpath("//th[@class='Projected_Hold_Wait_Time']//div[@title='Ascending [A-Z, 0-9]']"));
		    	//WebElement element = driver.findElement(By.xpath("//th[@class='Extended_Amount']//div[@title='Descending [Z-A, 9-0]']"));
			  //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			
		    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);*/
		    	
					
				Thread.sleep(500); 
				
				for(int i1 =0 ; i1<3;i1++){
					html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
	
			}
			} catch (Exception e) {
				System.out.println("\tunable to sort columns");
				e.printStackTrace();
			}
		
		/*driver.findElement(By.xpath("//th[@class='Title']//div[@title='Ascending [A-Z, 0-9]']")).click();;
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[text()='Current Hold Wait Time'])[2]/following-sibling::div/div[@class='upperImage']")).click();;
		Thread.sleep(4000);
		WebElement html = driver.findElement(By.xpath("//input[@id='fileExportOpenButton']"));
		for(int i =0 ; i< 3;i++){
		html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		}
		driver.findElement(By.xpath("(//div[text()='Copies to Buy'])[2]/following-sibling::div/div[@class='lowerImage']")).click();;
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//div[text()='Projected Hold Wait Time'])[2]/following-sibling::div/div[@class='upperImage']")).click();;		
		//driver.findElement(By.xpath("(//div[text()='Projected Hold Wait Time'])[2]/following-sibling::div/div[@class='lowerImage']")).click();;
		for(int i =0 ; i<3;i++){
			html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
			}*/
		
	}

}

