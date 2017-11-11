package S08_Session_Java_June_21st;


import java.io.IOException;

public class difer_try_throw_throws 
{
	//Without Exception Handling----------------------------------------------------------------
	static void sum(int a)
	{
			int num,sum=0;
			num=10;
			sum=10/a;
			System.out.println("Try is used divisions and result"+sum);
	}
	
	//With Exception Handling Try Catch----------------------------------------------------------	
	static void sumTry(int a)
	{
		try
		{
			int num,sum=0;
			num=10;
			sum=10/a;
			System.out.println("Try is used divisions and result"+sum);
		}
		catch(ArithmeticException e )
		{
			System.out.println("Try is used-invaild divisions");
		}
	}
	
	//With Exception Handling Throw----------------------------------------------------------	
	static void sumThrow(int a)
	{
			int num,sum=0;
			num=10;
			
			if(a<=0)
			{
				ArithmeticException e = new ArithmeticException("Throw is used-invaild divisions");
				throw e;
			}
			 else
				sum=10/a;
				System.out.println("Throw is used divisions and result"+sum);
	}
	
	
	//With Exception Handling Throws----------------------------------------------------------
	static void sumThrws(int a) throws Exception
	{
			int num,sum=0;
			num=10;
			sum=10/a;
			System.out.println("Throw is used divisions and result"+sum);
		}

			/*//With Exception Handling Throws with option 1-Throws Declareatin----------------------------------------------------------
			static void sumThowsSub1(int i) throws Exception 
			{
				sumThrws(0);
			}
			
			//With Exception Handling Throws with option 2- Try-Catch----------------------------------------------------------			
			static void sumThowsSub2(int i) 
			{
				try {
					sumThrws(0);
				} catch (Exception e) 
				
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
		
	//With Exception Handling Finaaly with Catch----------------------------------------------------------			
	static void sumFinaaly_Catch(int a)
	{
		try
		{
			int num,sum=0;
			num=10;
			System.out.println("1-Finally-Catch is used divisions and result"+sum);
			sum=10/a;
			System.out.println("Finally-Catch is used divisions and result"+sum);
		}
		catch(ArithmeticException e )
		{
		  System.out.println("Finally-Catch is used-invaild divisions");
		  System.out.println(e.getMessage());
		  //System.out.println(e.printStackTrace());
		  e.printStackTrace();
		}
		finally 
		{ 
	         System.out.println("finally-Catch block is always executed"); 
	    } 
		
		System.out.println("this is not done");
	}

	//With Exception Handling Finaaly with Try----------------------------------------------------------			
	static void sumFinaaly_Try(int a)
	{
		try
		{
			int num,sum=0;
			num=10;
			sum=10/a;
			System.out.println("Finally-Try is used divisions and result"+sum);
		}
		finally 
		{ 
	         System.out.println("finally-Try-block is always executed"); 
	    } 
		
		System.out.println("this is not done");
	}
	
	
	 static void notstatic(int a)
	{
		try
		{
			int num,sum=0;
			num=10;
			sum=10/a;
			System.out.println("Finally-Try is used divisions and result"+sum);
		}
		finally 
		{ 
	         System.out.println("finally-Try-block is always executed"); 
	    } 
	}
		
/*	
	public static void main(String[] args) 
	{

		sum(0);
//		sumTry(0);
//		sumThrow(0);
//		sumThrws(0);
//		sumThowsSub1(0);
//		sumThowsSub2(0);
//		sumFinaaly_Catch(0);
//		sumFinaaly_Try(0);
		
		System.out.println("Main Method Statument");
		
	}*/
}
