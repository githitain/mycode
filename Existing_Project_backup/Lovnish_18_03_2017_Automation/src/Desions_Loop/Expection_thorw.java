package Desions_Loop;

public class Expection_thorw 
{

	public static void main (String args [])
	{
		//sumThrow(9);
		//sumCatch(10);
		try
		{
		sumTrows(10);
		}
		catch(ArrayIndexOutOfBoundsException ee)
		{
			System.out.println("not hanflr");
		}
		
		int num, num1, num3 = 0;
		try
		{
				
				
			num=45;
			 num1=0;
			 num3=num/num1;
			 //throw new ArithmeticException("inot");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Try is used - Arithmtic error is here");
			e.printStackTrace();
			//throw e;
		}
		
		System.out.println("No expectin");
		
	}
	
	static void sumThrow(int a)
		{
			int ar[]={9,2,8,4,8};
			//System.out.println(ar[2]);
			//System.out.println(ar[a]);
			if(a>5)
			throw new ArrayIndexOutOfBoundsException("Thrwo is used - not valid array potions ");
			
			else
				System.out.println("welcome");
		}
	
	static void sumCatch(int a)
	{
		try
		{
			int ar[]={9,2,8,4,8};
			//System.out.println(ar[2]);
			System.out.println(ar[a]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catch is used - not valid array potions ");
		}
	}
	
	static void sumTrows(int a) throws ArrayIndexOutOfBoundsException 
		{
			int ar[]={9,2,8,4,8};
			//System.out.println(ar[2]);
			System.out.println(ar[a]);
			/*if(a>5)
				throw new ArrayIndexOutOfBoundsException("throws is used - not valid array potions ");
				
				else
					System.out.println("welcome");*/
			
		}
	
	}
		
		
	
	

