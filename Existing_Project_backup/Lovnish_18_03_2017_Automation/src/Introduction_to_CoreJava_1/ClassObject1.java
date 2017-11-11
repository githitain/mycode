package Introduction_to_CoreJava_1;

public class ClassObject1 
{
	public String name;
	//8private String india;
	 String address="india";
	
	
	static String clgname ="ABCD";
	
	public void student(String n)
	{
		int age=7;
		System.out.println(age);
		name=n;
		System.out.println(n);
	}
	
/*	public String setname()
	{
		return name;
	}
	*/
	ClassObject1(int b, int c)
	{
		System.out.println("Construtr parameter 1:" +b);
		System.out.println("Construtr parameter 2:" +c);

	}
	ClassObject1()
	{
		System.out.println("by defualt Construtr ");
	
	}
	
	ClassObject1(int m)
	{
		System.out.println("Construtr parameter 1:" +m);
		//System.out.println("Construtr parameter 2:" +c);

	}
	
	
	public void max(int a, int b)
	{
		int sum= a+b;
		System.out.println(sum);
	}
	
	public static void mul(int a, int b)
	{
		int sum= a*b;
		System.out.println(sum);
	}
	
	public static void main(String []args) 
	{
	
			ClassObject1 s1= new ClassObject1(12,23);
			ClassObject1 s2= new ClassObject1();
			ClassObject1 s3= new ClassObject1(78);
			//ClassObject1 s4= new ClassObject1(78,23);
			
			/*s1.student("amiy");
			s2.student("amiy");
			s3.student("amiy");
			s4.student("amiy");
			//s5.student("amiy");
			
			System.out.println(clgname);
			/*System.out.println(name);
			System.out.println(age);*/
			
			/*System.out.println(s1.address);
			System.out.println(s1.name);
			//s1.address();
			
			s1.max(45, 89);
			s2.max(99, 78);
			s3.max(96, 23);
			//s1.mul(45, 1);
			mul(78,3);
			//max(92,23);*/
	}
	
	
	
}
