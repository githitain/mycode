package S05_Session_JAVA_June_14th;

public class if_else 
{
	public static void main(String[] args)
	{
		
		int a, b, c;
		a=5;
		b=5;
		c=a+b;
		
		if(c==10)
		{
			System.out.println("Thi is GRACED:" + c);

		}
		
		else if (c>10)
		{
			System.out.println("Thi is Passed:" + c);

		}
		
		else
			System.out.println("Thi is failed:" + c);
	}
}
