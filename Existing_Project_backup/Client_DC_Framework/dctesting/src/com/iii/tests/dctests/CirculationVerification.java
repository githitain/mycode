package com.iii.tests.dctests;
/**

 * @version $Id: CirculationVerification.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

 */
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import com.iii.tests.common.UtilityTools;

public class CirculationVerification {
	
	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	static String repNameList = "C:\\DC\\regressionDecisionCenter\\src\\test\\resources\\ReporterSelection.xml";
	static String envSite ="dc"; // dev for erdev of dc for erqa
	static String tmpRepFile = "C:\\DC\\dcfiles\\tmpReport.txt";
	
	public static boolean ReportVerification(WebDriver driver) {
		boolean ret = true;
		boolean createReport = true;
		String[ ] linkNames;
		String[ ] fileNames;
		
		// Start verify Agency reports info
		
		/*driver = UtilityTools.LoginTo(envSite);
		UtilityTools.MySleep(sleepTime);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);*/
		
		 driver =UtilityTools.MyRelogin(driver);
		 driver.manage().window().maximize();		   		   		   
		   
   	     driver.findElement(By.id("evaluation")).click();
   	     UtilityTools.MySleep(sleepTime);
   	    
   	  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      File file = null;
		
		try {
			 file = new File(repNameList);
			// DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("Agency");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[3]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"- Agency reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Agency reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Agency reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
                driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nAgency reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		//driver.quit();
	
		
		// Start verify Call Number Range reports info
		/*driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);*/
		
		//--------------------- Commented by Nancy for Execution purpose
		//To be un-commented
		try {
			  file = new File(repNameList);
			// DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("CallNumberRange");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[4]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"- Call Number Range reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Call Number Range reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Call Number Range reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
                 driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}
		
		//--------------------- Commented by Nancy for Execution purpose
				//To be un-commented
		
		System.out.print("\nCall Number Range reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		// driver.quit();
		
		// Start verify Holdshelf reports info
		
				/*driver = UtilityTools.LoginTo(envSite);
				driver.manage().window().maximize();
				UtilityTools.MySleep(sleepTime);
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);*/
				
				try {
					  file = new File(repNameList);
					 //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					 DocumentBuilder db = dbf.newDocumentBuilder();
					 Document document = db.parse(file);
					 document.getDocumentElement().normalize();
					 NodeList listOfReports = document.getElementsByTagName("Holdshelf");
					 int totalReports = listOfReports.getLength();
					 System.out.println("Total number of Holdshelf Reports=" +totalReports);
					 
					 linkNames = new String[totalReports];
					 fileNames = new String[totalReports];

			         for (int i = 0; i < totalReports; i++) {
			        	 Node nNode = listOfReports.item(i);
			        	 Element eElement = (Element) nNode;
			        	 linkNames[i] = getTagValue("name", eElement);
			        	 fileNames[i] = getTagValue("location", eElement);

			         }
			         
			        for (int i=0; i<linkNames.length; i++){
			        	
			        	String nameLink = linkNames[i];
					    String nameFile = fileNames[i];
					    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[5]")).click();
					    
					    UtilityTools.MySleep(sleepTime);
					    //driver.findElement(By.linkText(nameLink)).click();
					    driver.findElement(By.linkText(nameLink)).click();
					    UtilityTools.MySleep(sleepTime);

					    driver.findElement(By.id("submit")).click();
						UtilityTools.MySleep(sleepTime);
						System.out.println("Startig verifying "+nameLink+" \n");
						
						String textFromFile = UtilityTools.readFileToString(nameFile);
						String textFromReport=UtilityTools.readReportBody(tableName, driver);
						try {
							int RNum = i+1;
							if (textFromFile.equals(textFromReport)){
							    System.out.println("Report number: "+RNum+"- Holdshelf reports info verification PASS \n");
							    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
							} else {
								System.out.println("Report number: "+RNum+"- Holdshelf reports info verification Failed \n");
								createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
							}
							
							System.out.println("\nCreate report result : "+ createReport+"\n");
					    	   
					       } catch (Exception e) {
								System.out.println("\ntext comperising faild for Holdshelf reports\n");
								e.printStackTrace();
								 ret = false;

					       }
						
						
						driver.findElement(By.linkText("Collection Tools")).click();
						
						//driver.findElement(By.linkText("Evaluation")).click();
						driver.findElement(By.id("evaluation")).click();
						UtilityTools.MySleep(sleepTime);
			        }
				
				
				} catch (Exception e) {
					System.out.println("\tunable to open env info");
					e.printStackTrace();

				}	
				
				System.out.print("\nHoldshelf reports info verification - finish time: "+UtilityTools.getDateTime()+"\n"); 
				
		
		// Start verify Hourly Activity reports info
		
		/*driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);*/
		
		try {
			  file = new File(repNameList);
			 //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("HourlyActivity");
			 int totalReports = listOfReports.getLength();
			 System.out.println("Total number of HourlyActivity Reports=" +totalReports);
			 
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    //driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[5]")).click();
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[6]")).click();
			    UtilityTools.MySleep(sleepTime);
			    //driver.findElement(By.linkText(nameLink)).click();
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"- Hourly Activity reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Hourly Activity reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Hourly Activity reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
				driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nHourly Activity reports info verification - finish time: "+UtilityTools.getDateTime()+"\n"); 
		//driver.quit();
		
		// Start verify Items reports info
		
		/*driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);*/
		
		try {
			  file = new File(repNameList);
			 //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("Items");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    //driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[6]")).click();
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			    UtilityTools.MySleep(sleepTime);
			    //driver.findElement(By.linkText(nameLink)).click();
				driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"- Items reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Items reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Items reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
				driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nItems reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Owning Location reports info
		
		driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			  file = new File(repNameList);
			// DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("OwningLocation");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    //driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[7]")).click();
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[8]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"- Owning Location reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Owning Location reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Owning Location reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
				driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nOwning Location reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Patrons reports info
		driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			  file = new File(repNameList);
			 //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("Patrons");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    //driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[8]")).click();
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"- Patrons reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Patrons reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Patrons reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
				driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Patrons env info");
			e.printStackTrace();

		}	
		
		System.out.print("\nPatrons reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		
		
		// Start verify Postal Code reports info
		driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			  file = new File(repNameList);
			 //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("PostalCode");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    //driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[9]")).click();
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[10]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"- Postal Code reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Postal Code reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Postal Code reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
				driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Postal Code env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nPostal Code reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Resource Sharing (Local, ILL, INN-Reach)  reports info 
		
		driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			  file = new File(repNameList);
			 //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("ResourceSharing");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    //driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[10]")).click();
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[11]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"-Resource Sharing reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Resource Sharing reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Resource Sharing reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
				driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Resource Sharing env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nResource Sharing reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Statistics Group reports info
		
		driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			  file = new File(repNameList);
			 //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("StatisticsGroup");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    //driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[11]")).click();
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[12]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"-Statistics Group reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Statistics Group reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Statistics Group reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
				driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Statistics Group env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nStatistics Group reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Top Titles reports info
		
		driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			  file = new File(repNameList);
			 //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("TopTitles");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    //driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[11]")).click();
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"-Top Titles reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Top Titles reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Top Titles reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
				driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Top Titles env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nStatistics Group reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Transaction Location reports info
		
		driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			  file = new File(repNameList);
			 //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("TransactionLocation");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    //driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[13]")).click();
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[15]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"- Transaction Location reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Transaction Location reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Transaction Location reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
				driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Transaction Location env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nTransaction Location reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		// Start verify Transaction Type reports info
		
		driver = UtilityTools.LoginTo(envSite);
		driver.manage().window().maximize();
		UtilityTools.MySleep(sleepTime);
		driver.findElement(By.id("evaluation")).click();
		UtilityTools.MySleep(sleepTime);
		try {
			  file = new File(repNameList);
			 //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
			 Document document = db.parse(file);
			 document.getDocumentElement().normalize();
			 NodeList listOfReports = document.getElementsByTagName("TransactionType");
			 int totalReports = listOfReports.getLength();
			 linkNames = new String[totalReports];
			 fileNames = new String[totalReports];

	         for (int i = 0; i < totalReports; i++) {
	        	 Node nNode = listOfReports.item(i);
	        	 Element eElement = (Element) nNode;
	        	 linkNames[i] = getTagValue("name", eElement);
	        	 fileNames[i] = getTagValue("location", eElement);

	         }
	         
	        for (int i=0; i<linkNames.length; i++){
	        	
	        	String nameLink = linkNames[i];
			    String nameFile = fileNames[i];
			    //driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[14]")).click();
			    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
			    UtilityTools.MySleep(sleepTime);
			    driver.findElement(By.linkText(nameLink)).click();
			    UtilityTools.MySleep(sleepTime);

			    driver.findElement(By.id("submit")).click();
				UtilityTools.MySleep(sleepTime);
				System.out.println("Startig verifying "+nameLink+" \n");
				
				String textFromFile = UtilityTools.readFileToString(nameFile);
				String textFromReport=UtilityTools.readReportBody(tableName, driver);
				try {
					int RNum = i+1;
					if (textFromFile.equals(textFromReport)){
					    System.out.println("Report number: "+RNum+"- Transaction Type reports info verification PASS \n");
					    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
					} else {
						System.out.println("Report number: "+RNum+"- Transaction Type reports info verification Failed \n");
						createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
					}
					
					System.out.println("\nCreate report result : "+ createReport+"\n");
			    	   
			       } catch (Exception e) {
						System.out.println("\ntext comperising faild for Transaction Type reports\n");
						e.printStackTrace();
						 ret = false;

			       }
				
				
				driver.findElement(By.linkText("Collection Tools")).click();
				
				//driver.findElement(By.linkText("Evaluation")).click();
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
	        }
		
		
		} catch (Exception e) {
			System.out.println("\tunable to open Transaction Type env info");
			e.printStackTrace();

		}	
		
		
		System.out.print("\nTransaction Type reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
		driver.quit();
		
		
		return ret;
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
	 
	        Node nValue = nlList.item(0);
	 
		return nValue.getNodeValue();
	}


}
