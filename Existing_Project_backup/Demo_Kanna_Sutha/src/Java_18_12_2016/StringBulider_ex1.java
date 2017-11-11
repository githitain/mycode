package Java_18_12_2016;

public class StringBulider_ex1 
{
	
	public static void main(String arg[])
	{
		String s1="code";
		StringBuffer s2= new StringBuffer("testing");
		StringBuilder s3= new StringBuilder("Support");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		
		
		s1="HI_code";
		s2.append("HI_testing");
		s3.append("HI_Support");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		

	}
}
