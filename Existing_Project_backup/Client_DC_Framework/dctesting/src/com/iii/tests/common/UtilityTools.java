package com.iii.tests.common;

/**

 * @version $Id: UtilityTools.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
@SuppressWarnings("unused")

public class UtilityTools {
	static WebDriver driver;
	static String targetBrowser;
	static String username;
	static String password;
	static String site;
	static long sleepTime = 5000;
	File logDirName= new File("C:\\DC\\dcfiles");
	static String envDoc = "C:\\DC\\dcfiles\\Decision_Center.xml";
	
	public static String readFileToString(String filePath) throws java.io.IOException{
	    byte[] buffer = new byte[(int) new File(filePath).length()];
	    BufferedInputStream f = null;
	    try {
	        f = new BufferedInputStream(new FileInputStream(filePath));
	        f.read(buffer);
	    } finally {
	        if (f != null) try { f.close(); } catch (IOException ignored) { }
	    }
	    return new String(buffer);
	}

	public static boolean writeStrToFile(String str, String file) {
		BufferedWriter out;
		try {
			out = new BufferedWriter(new FileWriter(file, true));
			out.write(str);
			out.close();
			return true;
		} catch (IOException e) {
			System.err.println("exception returned: " + e);
			return false;
		}
	}

	public static boolean assertDirExist(String dirPath) {
		boolean ret = true;
		File dir = new File(dirPath);
		if (!dir.exists()) {
			try {
				boolean success = (dir).mkdirs();
				if (success) {
					System.out
							.println("\tDirectories: " + dirPath + " created");
				}
			} catch (Exception e) {
				System.err.println("\tError: " + e.getMessage());
				ret = false;
			}
		}
		return ret;
	}

	public static boolean cleanDir(File dirPath) {
		boolean ret = true;
		try {
			if (dirPath.exists()) {
				File[] files = dirPath.listFiles();
				for (int i = 0; i < files.length; i++) {
					if (files[i].isDirectory()) {
						cleanDir(files[i]);
					} else {
						files[i].delete();
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Unable to clean dir: " + dirPath + " Error: "
					+ e.getMessage());
			ret = false;
		}
		return ret;
	}
	
	public static String getCurrentPath() {
		String curPath = "";
		File dir1 = new File(".");
		try {
			curPath = dir1.getCanonicalPath() + "/";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return curPath;
	}

	public static String getDateTime() {
		String dateFormatNow = "MM-dd-yyyy_HH-mm-ss";
		String dateTimeStr = null;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormatNow);
		dateTimeStr = sdf.format(cal.getTime());
		return dateTimeStr;
	}

	public static String makeStrUnique(String in) {
		String out = null;
		String dateFormatNow = "MMddyyyyHHmmss";
		String dateTimeStr = null;
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormatNow);
		dateTimeStr = sdf.format(cal.getTime());
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(88);
		String randomStr = Integer.toString(randomInt);
		out = in + "_" + randomStr + "_" + dateTimeStr;
		return out;
	}

	public static long getAvg(List<Long> listOfValues) {
		long sum = 0;
		long size = listOfValues.size();
		for (Long i : listOfValues) {
			sum += i;
		}
		long avg = sum / size;
		return avg;
	}
	
	public static void deleteFile(String file) {
	    File f = new File(file);
	    if (!f.exists())
	      throw new IllegalArgumentException(
	          "Delete: no such file or directory: " + file);
	    if (!f.canWrite())
	      throw new IllegalArgumentException("Delete: write protected: "
	          + file);
	    if (f.isDirectory()) {
	      String[] files = f.list();
	      if (files.length > 0)
	        throw new IllegalArgumentException(
	            "Delete: directory not empty: " + file);
	    }
	    boolean success = f.delete();
	    if (!success)
	      throw new IllegalArgumentException("Delete: deletion failed");
	  }

    @SuppressWarnings("static-access")
	public static void MySleep(long sleepTime) {
        // System.out.println("Starting......");
       
        // pause for a while
        Thread thisThread = Thread.currentThread();
        try
            {
            Thread.sleep(sleepTime);
        }
        catch (Throwable t)
            {
            throw new OutOfMemoryError("An Error has occured");
        }
        
       // System.out.println("Ending......");
       
    }
    
    public static boolean CreateReportInfo(String tableName, String fileName, WebDriver driver) {
		boolean createReport = true;

		System.out.println("\n"+tableName+" |" + fileName + "\n");
		//WebElement BudgetProjectionBySubject = driver.findElement(By.id(tableName));
		//List<WebElement> tableRows = BudgetProjectionBySubject.findElements(By.xpath("id('"+tableName+"')/tbody/tr"));
		WebElement BudgetProjectionBySubject = driver.findElement(By.xpath("//table[@class='"+tableName+"']"));
		List<WebElement> tableRows = BudgetProjectionBySubject.findElements(By.xpath("//table[@class='"+tableName+"']/tbody/tr"));
		Iterator<WebElement> i = tableRows.iterator();
		// System.out.println("\nNUMBER rows = "+tableRows.size()+"\n");
		
		
		while(i.hasNext()) { 
	        WebElement row = i.next(); 
	        List<WebElement> columns = row.findElements(By.tagName("td"));
	        Iterator<WebElement> j = columns.iterator();
	        
	        String myrecord = "";
	        
	        while(j.hasNext()) { 
	                WebElement column = j.next(); 
	                if ((column.getText()).length() > 0){
	                	myrecord = myrecord + column.getText() + ", "; 
	                }
	                 
	        }  
	        // System.out.println(myrecord);
	        createReport = writeStrToFile((myrecord + "\n"), fileName);
	        
		}
		
		// System.out.println("\nFinish createing file" + fileName + " | " + createReport);
		return createReport;


    }
    
	public static String readReportBody(String tableName, WebDriver driver) {
		String reportBody="";
				
		//WebElement BudgetProjectionBySubject = driver.findElement(By.id(tableName));
		//List<WebElement> tableRows = BudgetProjectionBySubject.findElements(By.xpath("id('"+tableName+"')/tbody/tr"));
		WebElement BudgetProjectionBySubject = driver.findElement(By.xpath("//table[@class='"+tableName+"']"));
		List<WebElement> tableRows = BudgetProjectionBySubject.findElements(By.xpath("//table[@class='"+tableName+"']/tbody/tr"));
		Iterator<WebElement> i = tableRows.iterator();
		
		
		
		while(i.hasNext()) { 
	        WebElement row = i.next(); 
	        List<WebElement> columns = row.findElements(By.tagName("td"));
	        Iterator<WebElement> j = columns.iterator();
	        
	        String myrecord = "";
	        
	        while(j.hasNext()) { 
	                WebElement column = j.next(); 
	                if ((column.getText()).length() > 0){
	                	myrecord = myrecord + column.getText() + ", "; 
	                }
	                 
	        }  
	        // System.out.println(myrecord);
	        reportBody = reportBody + myrecord + "^";
	        
		}
		
    	return reportBody;
	}

	public static WebDriver MyRelogin (WebDriver driver) {
		
	//driver = new FirefoxDriver();
	
	try {
		 File file = new File(envDoc);
		 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		 DocumentBuilder db = dbf.newDocumentBuilder();
		 Document document = db.parse(file);
		 document.getDocumentElement().normalize();
		 NodeList node = document.getElementsByTagName("dc");
		 
		 Node nNode = node.item(0);
		 Element eElement = (Element) nNode;
		 
		 targetBrowser = getTagValue("targetBrowser", eElement);
		 site = getTagValue("site", eElement);
		 username = getTagValue("username", eElement);
		 password = getTagValue("password", eElement);
		 
		 driver=DriverSelector.selectWebDriver(targetBrowser);
		 driver.get(site);
		 
	} catch (Exception e) {
		System.out.println("\tunable to open env info");
		e.printStackTrace();
	}
		if (driver.findElements(By.xpath("//*[contains(.,'Welcome, iii')]")).size()==0){
			
			//if (driver.findElements(By.xpath("//html/body//input[@name='j_username']")).size()==0){
		    WebElement usernameField = driver.findElement(By.name("j_username"));
			usernameField.sendKeys(username);
			WebElement passwordField = driver.findElement(By.name("j_password"));
			passwordField.sendKeys(password);
			// driver.findElement(By.id("remember_me")).click();
			driver.findElement(By.id("submit")).click();
		}
		return driver;
				
	}
	
	public static WebDriver LoginMeIn () {
		
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList node = document.getElementsByTagName("dc");
			 
			 Node nNode = node.item(0);
			 Element eElement = (Element) nNode;
			 
			 targetBrowser = getTagValue("targetBrowser", eElement);
			 site = getTagValue("site", eElement);
			 username = getTagValue("username", eElement);
			 password = getTagValue("password", eElement);
			 
			 driver = DriverSelector.selectWebDriver(targetBrowser);
			 driver.get(site);
			 
			 WebElement usernameField = driver.findElement(By.name("j_username"));
				usernameField.sendKeys(username);
			 WebElement passwordField = driver.findElement(By.name("j_password"));
				passwordField.sendKeys(password);
			 driver.findElement(By.id("submit")).click();
			 

		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}
		
		return driver;
	}
	
	public static WebDriver LoginTo (String envSite) {
		
		try {
			 File file = new File(envDoc);
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList node = document.getElementsByTagName(envSite);
			 
			 Node nNode = node.item(0);
			 Element eElement = (Element) nNode;
			 
			 targetBrowser = getTagValue("targetBrowser", eElement);
			 site = getTagValue("site", eElement);
			 username = getTagValue("username", eElement);
			 password = getTagValue("password", eElement);
			 
			 driver = DriverSelector.selectWebDriver(targetBrowser);
			 driver.get(site);
			 
			 WebElement usernameField = driver.findElement(By.name("j_username"));
				usernameField.sendKeys(username);
			 WebElement passwordField = driver.findElement(By.name("j_password"));
				passwordField.sendKeys(password);
			 driver.findElement(By.id("submit")).click();
			 

		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}
		
		return driver;
	}


	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
	 
	        Node nValue = nlList.item(0);
	 
		return nValue.getNodeValue();
	}
	
	public static void sortingTest (WebDriver driver) {
		
		try {			
			
			WebElement html = driver.findElement(By.xpath("//input[@id='fileExportOpenButton']"));
			for(int i =0 ; i< 3;i++){
			html.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
			}

			 List<WebElement> divList =  driver.findElements(By.cssSelector("div.upperImage"));
			 
			 System.out.println("Start Soting");

			for(int i = 0; i < divList.size(); ++i) {

				int newNumI = i + 1;
				
				UtilityTools.MySleep(sleepTime);
				
				WebElement w = driver.findElement(By.xpath("(//div[@class='upperImage'])["+newNumI+"]"));
				if(w!=null){
					driver.findElement(By.xpath("(//div[@class='upperImage'])["+newNumI+"]")).click();
					
					UtilityTools.MySleep(sleepTime);					

					Assert.assertFalse("Element present", driver.getPageSource().contains("Error 500"));
					driver.findElement(By.xpath("(//div[@class='lowerImage'])["+newNumI+"]")).click();
					UtilityTools.MySleep(sleepTime);
					Assert.assertFalse("Element present", driver.getPageSource().contains("Error 500"));
					
					System.out.println("\nPass verification of sorting: "+newNumI+"\n");
				}
					
				Thread.sleep(500); 
							
			}
			System.out.println("Soting Passed");
			
			for(int i1 =0 ; i1<3;i1++){
				html.sendKeys(Keys.chord(Keys.CONTROL, Keys.ADD));
			}
			} catch (Exception e) {
				System.out.println("\t Unable to sort columns");
				e.printStackTrace();
			}					
		
	}

	public static void deleteInfoFile (String fileName) {
		File fileTemp = new File(fileName);
		if (fileTemp.exists()){
			fileTemp.delete();
		}
	}

}
