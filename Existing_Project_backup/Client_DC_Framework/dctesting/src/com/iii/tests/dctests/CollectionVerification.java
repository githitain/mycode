package com.iii.tests.dctests;
/**

 * @version $Id: CollectionVerification.java 253123 2015-12-10 22:18:48Z sergeii $ $Rev: 232046 $ $Date: 2014-04-25 12:32:28 -0700 (Fri, 25 Apr 2014) $

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

public class CollectionVerification {
	
	static long sleepTime = 1000;
	static WebDriver driver;
	static String tableName = "reportTable reportTableBody";
	static String repNameList = "C:\\DC\\regressionDecisionCenter\\src\\test\\resources\\ReporterSelection.xml";
	static String envSite ="dc"; // dev for erdev of dc for erqa
	static String tmpRepFile = "C:\\DC\\dcfiles\\tmpReport.txt";
	
	
	public static boolean ReportVerification() {
		boolean ret = true;
		boolean createReport = true;
		String[ ] linkNames;
		String[ ] fileNames;
		
		// Start verify Agency reports info
		
				driver = UtilityTools.LoginTo(envSite);
				UtilityTools.MySleep(sleepTime);
				driver.manage().window().maximize();
				UtilityTools.MySleep(sleepTime);
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
				
				try {
					 File file = new File(repNameList);
					 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					 DocumentBuilder db = dbf.newDocumentBuilder();
					 Document document = db.parse(file);
					 document.getDocumentElement().normalize();
					 NodeList listOfReports = document.getElementsByTagName("ItemTrends");
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
					    
					    UtilityTools.deleteInfoFile(nameFile);
					    
					    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[15]")).click();
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
							    System.out.println("Report number: "+RNum+"- Item Trends reports info verification PASS \n");
							    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
							} else {
								System.out.println("Report number: "+RNum+"- Item Trends reports info verification Failed \n");
								createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
							}
							
							System.out.println("\nCreate report result : "+ createReport+"\n");
					    	   
					       } catch (Exception e) {
								System.out.println("\ntext comperising faild for Item Trends reports\n");
								e.printStackTrace();
								 ret = false;

					       }
						
						driver.findElement(By.linkText("Evaluation")).click();
						UtilityTools.MySleep(sleepTime);
			        }
				
				
				} catch (Exception e) {
					System.out.println("\tunable to open Item Trends env info");
					e.printStackTrace();

				}	
				
				System.out.print("\nItem Trends reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
				driver.quit();
				
				// Start Collect Title Trends reports info
				driver = UtilityTools.LoginTo(envSite);
				UtilityTools.MySleep(sleepTime);
				driver.manage().window().maximize();
				UtilityTools.MySleep(sleepTime);
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
				
				try {
					 File file = new File(repNameList);
					 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					 DocumentBuilder db = dbf.newDocumentBuilder();
					 Document document = db.parse(file);
					 document.getDocumentElement().normalize();
					 NodeList listOfReports = document.getElementsByTagName("TitleTrends");
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
					    
					    UtilityTools.deleteInfoFile(nameFile);
					    
					    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[16]")).click();
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
							    System.out.println("Report number: "+RNum+"- Title Trends reports info verification PASS \n");
							    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
							} else {
								System.out.println("Report number: "+RNum+"- Title Trends reports info verification Failed \n");
								createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
							}
							
							System.out.println("\nCreate report result : "+ createReport+"\n");
					    	   
					       } catch (Exception e) {
								System.out.println("\ntext comperising faild for Title Trends reports\n");
								e.printStackTrace();
								 ret = false;

					       };
						
						driver.findElement(By.linkText("Evaluation")).click();
						UtilityTools.MySleep(sleepTime);
			        }
				
				
				} catch (Exception e) {
					System.out.println("\tunable to open Title Trends env info");
					e.printStackTrace();

				}	
				
				System.out.print("\nTitle Trends reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
				driver.quit();
				
				
				// Start Collect Turnover reports info
				driver = UtilityTools.LoginTo(envSite);
				UtilityTools.MySleep(sleepTime);
				driver.manage().window().maximize();
				UtilityTools.MySleep(sleepTime);
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
				
				try {
					 File file = new File(repNameList);
					 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					 DocumentBuilder db = dbf.newDocumentBuilder();
					 Document document = db.parse(file);
					 document.getDocumentElement().normalize();
					 NodeList listOfReports = document.getElementsByTagName("Turnover");
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
					    
					    UtilityTools.deleteInfoFile(nameFile);
					    
					    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[17]")).click();
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
							    System.out.println("Report number: "+RNum+"- Turnover reports info verification PASS \n");
							    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
							} else {
								System.out.println("Report number: "+RNum+"- Turnover reports info verification Failed \n");
								createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
							}
							
							System.out.println("\nCreate report result : "+ createReport+"\n");
					    	   
					       } catch (Exception e) {
								System.out.println("\ntext comperising faild for Turnover reports\n");
								e.printStackTrace();
								 ret = false;

					       }
						
						driver.findElement(By.linkText("Evaluation")).click();
						UtilityTools.MySleep(sleepTime);
			        }
				
				
				} catch (Exception e) {
					System.out.println("\tunable to open Turnover env info");
					e.printStackTrace();

				}	
				
				System.out.print("\nTurnover reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
				driver.quit();
				
				// Start Collect Summary reports info
				driver = UtilityTools.LoginTo(envSite);
				UtilityTools.MySleep(sleepTime);
				driver.manage().window().maximize();
				UtilityTools.MySleep(sleepTime);
				driver.findElement(By.id("evaluation")).click();
				UtilityTools.MySleep(sleepTime);
				
				try {
					 File file = new File(repNameList);
					 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
					 DocumentBuilder db = dbf.newDocumentBuilder();
					 Document document = db.parse(file);
					 document.getDocumentElement().normalize();
					 NodeList listOfReports = document.getElementsByTagName("Summary");
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
					    
					    UtilityTools.deleteInfoFile(nameFile);
					    
					    driver.findElement(By.xpath("(//span[@onclick='innoTree.toggleItem(this)'])[18]")).click();
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
							    System.out.println("Report number: "+RNum+"- Summary reports info verification PASS \n");
							    createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | PASS \n"), tmpRepFile);
							} else {
								System.out.println("Report number: "+RNum+"- Summary reports info verification Failed \n");
								createReport = UtilityTools.writeStrToFile((UtilityTools.getDateTime()+" | "+nameLink+" - report info verification | Failed \n"), tmpRepFile);
							}
							
							System.out.println("\nCreate report result : "+ createReport+"\n");
					    	   
					       } catch (Exception e) {
								System.out.println("\ntext comperising faild for Summary reports\n");
								e.printStackTrace();
								 ret = false;

					       }
						
						driver.findElement(By.linkText("Evaluation")).click();
						UtilityTools.MySleep(sleepTime);
			        }
				
				
				} catch (Exception e) {
					System.out.println("\tunable to open Summary env info");
					e.printStackTrace();

				}	
				
				System.out.print("\nSummary reports info verification - finish time: "+UtilityTools.getDateTime()+"\n");
				driver.quit();
				
				
				return ret;
			}

			private static String getTagValue(String sTag, Element eElement) {
				NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
			 
			        Node nValue = nlList.item(0);
			 
				return nValue.getNodeValue();
			}

}
