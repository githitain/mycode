package S05_Session_JAVA_June_14th;

import java.util.Scanner;

public class switch_1 
{
	public static void main(String args[])
	{
		//Example if statement
		/*System.out.println("Example if statement--------------");
			int a = 10;
			int b = 20;
			if(a>b)
			{
				System.out.println("Example if - a is greater than b");
			}
			if(b>a)
			{
				System.out.println("Example if -b is greater than a");
			}
			
			//Example if else
		System.out.println("Example if else statement--------------");	*/
			
			int no;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter any number :");
			no=s.nextInt();
			//no=s.nex
			if(no%2==0)
			{
				System.out.println("Example if else-Even number");
			}
			else
			{
				System.out.println("Example if else-Odd number");
			}
		System.out.println("Example switch statement--------------");
		
	
		char c='D';
		switch(c)
		{
			case 'A' :
			System.out.println("Excellent!"); 
			break;
			case 'B' :
			case 'C' :
			System.out.println("Well done");
			break;
			case 'D' :
			System.out.println("You passed");
			case 'F' :
			System.out.println("Better try again");
			break;
			default :
			System.out.println("Invalid grade");
		}

		System.out.println("Your grade is " + c);
		
		
	}
	
}