package Java_18_12_2016;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException_ex1 
{
	public static void main (String args[]) //throws IOException
	{
		int a = 10;
		int b =0;
//		int result=a/b;
//		System.out.println(result);
//		int min=a-b;
//		System.out.println(min);
		
//		try
//		{
			int result=a/b;
			System.out.println(result);
		//}
//		catch(ArithmeticException e)
//		{
//			//System.out.println(e);
//			e.printStackTrace();
//		}
		int min=a-b;
		System.out.println(min);
		}

	}

