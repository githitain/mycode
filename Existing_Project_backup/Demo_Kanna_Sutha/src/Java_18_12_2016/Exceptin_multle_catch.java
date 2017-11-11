package Java_18_12_2016;

public class Exceptin_multle_catch 
{
	public static void main (String args[]) //throws IOException
	{
		try
		{
		int a[] = new int [2];
		a[4]=30/2;
		System.out.println("the code correct");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Warning: ArithmeticException");
			e.printStackTrace();
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Warning: ArrayIndexOutOfBoundsException");
//			e.printStackTrace();
//		}
		catch(Exception e)
		{
			System.out.println("unknow Exception");
			e.printStackTrace();
		}
	}
		

	
	
}
