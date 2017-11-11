package Desions_Loop;

public class Expection_h 
{
	public static void main (String args [])
	{
		int num, num1, num3 = 0;
		try
		{
			 num=45;
			 num1=0;
			 num3=num/num1;
			 
			 
			 
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("PLz chk ur calulation");
		}
		System.out.println(num3);
		
		try
		{
		int ar[]={1,2,3,4,5};
		System.out.println(ar[2]);
		System.out.println(ar[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("");
		}
	}
}
