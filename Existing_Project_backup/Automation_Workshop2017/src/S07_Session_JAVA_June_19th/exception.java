package S07_Session_JAVA_June_19th;

import java.io.IOException;

public class exception
{
	  public static void main(String[] args) 
	  {
		  int arra[]={1,2,3,6,7};
		  String arra1[]={"Ram","Sita"};
		  
		  int len = arra.length;
		  int len1 = arra1.length;
		  
		  
		  
		try  
		{
		  System.out.println(len);
		  
		  for(int i=0;i<=len;i++)
		  {
			  System.out.println(arra[i]);
		  }
		  
		  
		  
		  System.out.println(len1);
		  
		  
		  
		  for(int i=0;i<len1;i++)
		  {
			  System.out.println(arra1[i]);
		  }
		}
		
		catch(ArrayIndexOutOfBoundsException E)
		{
			System.out.println(E);
		}
		  
	
		  
		  System.out.println("Thios is done ");

		try  
		{
		  int a= 10;
		  int b= 0;

		 
		  int c= a/b;
		  System.out.println(c);
		}
		  
		catch(ArithmeticException E)
		{
			System.out.println(E);
		}
		  System.out.println("Thios is done2 ");
		  
		  
	  }
}
