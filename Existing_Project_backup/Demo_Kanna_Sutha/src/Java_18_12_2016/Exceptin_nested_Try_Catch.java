package Java_18_12_2016;

public class Exceptin_nested_Try_Catch 
{
	public static void main (String args[]) //throws IOException
	{
		try
		{
			try
			{
				int b=45/0;
				System.out.println(b);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			try
			{
				int a[]=new int[7];
				a[8]=30/2;
				System.out.println("code correct");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
							
		int a1=5, a2=10;
		int a3=a1+a2;
		System.out.println(a3);
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
