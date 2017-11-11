package Java_18_12_2016;

public class Exceptin_Finaaly 
{
	public static void main (String args[]) //throws IOException
	{
		int a = 10;
		int b =0;
//		int result=a/b;
//		System.out.println(result);
//		int min=a-b;
//		System.out.println(min);
		
		try
		{
			int result=a/b;
			System.out.println(result);
		}
//		catch(ArithmeticException e)
//		{
//			//System.out.println(e);
//			e.printStackTrace();
//		}
		finally
		{
		
			
			int min=a-b;
			System.out.println(min);
		}
	}

}


