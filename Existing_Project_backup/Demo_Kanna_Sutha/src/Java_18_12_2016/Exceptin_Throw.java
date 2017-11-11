package Java_18_12_2016;

public class Exceptin_Throw 
{

public static void main (String args[])
	
	{
		try
		{
		throw new ArithmeticException();
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}	
	}
		

}
