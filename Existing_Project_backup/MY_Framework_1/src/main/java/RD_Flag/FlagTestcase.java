package RD_Flag;


import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import PFO.Library.PFOLibrary;
import PFO.Library.PFOLibraryImpl;
import PFOAppication1Pages.HomePage;
import PFOAppication1Pages.LendingPage;
import PFOAppication1Pages.LoginPage;
import PFOAppication1Pages.SearchDetailsPage;
import POM.Configuratin_setting;
import POM.Configuratin_setting;
import POM.MainPage;
import POM.TestDataC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FlagTestcase 
{
	@Test
	int revsersnumber(int number)
	{
		number = 78954;
		int reverse =0;
		System.out.println("Input your number and press enter: "+number);
		while(number!=0)
		{
			 reverse = reverse * 10;
			 reverse = reverse + number%10;
			 number = number/10;
			 
		}
		System.out.println("Reverse of input number is: "+reverse);

		return reverse;
	}
	
	@Test
	int palindromeNumber(int number)
	{
		number = 78954;
		int reverse =0;
		int temp=number;
		System.out.println("Input your number and press enter: "+number);
		while(number!=0)
		{
			 reverse = reverse * 10;
			 reverse = reverse + number%10;
			 number = number/10;
			 
		}
		System.out.println("Reverse of input number is: "+reverse);

		if (reverse==temp)
			System.out.println("Number is palindrome "+reverse);
		else 
			System.out.println("Number is not palindrome "+temp);
		
		return reverse;
	}
	
	@Test
	String revsersString (String s1)
	{
		s1="Selenium";
		String reverse =" ";
		int len=s1.length();
		System.out.println("Original string is: "+s1);
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		
		System.out.println("Reverse of entered string is: "+reverse);
		return reverse;
		
	}
	
	@Test
	String palindromeString (String s1)
	{
		s1="Selenium";
		String reverse =" ";
		int len=s1.length();
		
		System.out.println("Original string is: "+s1);
		
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+s1.charAt(i);
		}
		
		System.out.println("Reverse of entered string is: "+reverse);
		
		if (reverse==s1)
			
			System.out.println("String is palindrome "+reverse);
		else 
			System.out.println("String is not palindrome "+s1);
		
		return reverse;
		
	}
	
	@Test
	int FibonacciExample1(int n)
	{
		n=5;
		int n1=0,n2=1,n3 = 0;
		
		for(int i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		return n3;
		
	}
	
	@Test
	Boolean factorial(int n)
	{
		n=5;
		boolean flag=false;
		
		int n1=1;
		for(int i=1;i<n;i++)
		{
		n1=n1*i;
		}
		System.out.println("The factorial of n is " + n1);
		
		if(n1>1)
		{
			flag=true;
			
		}
			
		return flag;
		
		
		
	}
	
	@Test
	void SwapElementsWithoutThirdVariableExample(int n1, int n2)
	{
		n1=120; n2=130;
		System.out.println("number 1 before swapping:"+n1 );
		System.out.println("number 2 before swapping:"+n2 );
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("number 1 After swapping:"+n1 );
		System.out.println("number 2 After swapping:"+n2 );
		
	}
	

}
