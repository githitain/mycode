package Sierra_TestSuite;

import org.testng.annotations.Test;

import Parametration_XML.XML_file_Reading;
import ExecutionDriver.Runner;
import Sierra_ReuseableFunctions.P1_Functions;
import Sierra_TestCases.TC_Sierra_UserAccounts;

public class TS_Sierra_UserAccounts extends Runner
{
	@Test
	public static void TC1() throws Exception
	{
//		//TC_Homepage.search();
//		//TC_SBI_Homepage.Cap_Login();
//		System.out.println(XML_file_Reading.getXMLTagValue("dc", "Skills"));
//		//System.out.println(XML_file_Reading.getXMLTagValue("XSierra", "XCuser"));
//		System.out.println(XML_file_Reading.getXMLTagValue("XSierra", "Xpassword"));
//		System.out.println(XML_file_Reading.getXMLTagValue("XSierra", "Xusername"));
//		System.out.println(XML_file_Reading.getXMLTagValue("XSierra", "XCuser"));
//		System.out.println(XML_file_Reading.getXMLTagValue("XSierra", "XCUNumber"));
//		
		
		P1_Functions.Sirra_login(XML_file_Reading.getXMLTagValue("XSierra", "Xusername"),XML_file_Reading.getXMLTagValue("XSierra", "Xpassword"));
		TC_Sierra_UserAccounts.Add_User(XML_file_Reading.getXMLTagValue("XSierra", "XCuser"), Integer.parseInt(XML_file_Reading.getXMLTagValue("XSierra", "XCUNumber")));
		
		
		 
	}
}
