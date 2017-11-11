package Java_18_12_2016;

import java.io.IOException;

public class Exceptin_Throws 
{
	static void f1(int num)throws IOException, ClassNotFoundException
	{
		if(num==1)
			throw new IOException("Exception Mess1");
		else
			throw new ClassNotFoundException("Exception Mess2");
	}
	public static void main (String args[])
	{
		try
		{
		f1(4);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
		

}
