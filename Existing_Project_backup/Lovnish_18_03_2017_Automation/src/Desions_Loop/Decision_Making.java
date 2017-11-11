package Desions_Loop;

import java.util.Scanner;

public class Decision_Making 
{
	public static void main(String args[])
	{
		//Example if statement
		System.out.println("Example if statement--------------");
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
		System.out.println("Example if else statement--------------");	
			int no;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter any number :");
			no=s.nextInt();
			if(no%2==0)
			{
				System.out.println("Example if else-Even number");
			}
			else
			{
				System.out.println("Example if else-Odd number");
			}
		System.out.println("Example switch statement--------------");
	
		char c;
		//with byte, short, char and int 
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any Char :");
		c=s1.next().charAt(0);
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
		
		int i;
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter any number :");
		i=s2.nextInt();
		switch (i)
		{
		case 1: 
		System.out.println("Sanday");
		break;
		
		case 2: 
			System.out.println("Monday");
			break;
		
		case 3: 
			System.out.println("Tusday");
			break;
		case 4: 
			System.out.println("Wednesday");
			break;
		case 5: 
			System.out.println("Thrudday");
			break;
		case 6: 
			System.out.println("Fri");
			break;
		case 7: 
			System.out.println("Saturday");
			break;	
		default: 
			System.out.println("Invaild");
		}
	}
	
}