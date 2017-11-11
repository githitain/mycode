package Java_8_1_2017;

public class Java_StaticMethod 
{
	int roll;
	String name;
	static String college= "IBM";
	
	public static void info()
	{
		System.out.println("Clas name is:"+ college );
		//System.out.println("Clas name is:"+ roll);
	}
	Java_StaticMethod(int r, String a)
	{
		roll=r;
		name=a;
	}
	void dis()
	{
		System.out.println("roll no and name"+roll+name);
	}
	
	public static void main(String args[])
	{
		info();
		Java_StaticMethod obj = new Java_StaticMethod(15,"ram");
		obj.dis();
		info();
	}
	
}
