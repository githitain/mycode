package Advanced_Java;

public class static_ex 
{
	
	static
	{
		System.out.println("Static block");
	}
	
	int roll=101;
	String name="tt";
	final static String coompnay_name="ITS";
	final static String coompnay_dob="2007";
	
	static void compnay_info()
	{
		System.out.println(coompnay_dob);
		//System.out.println(roll);
	}
	
	void show()
	{
		System.out.println(coompnay_name);
		System.out.println(roll);
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
		static_ex s1=new static_ex();
		static_ex s2=new static_ex();
		//coompnay_name="00";
		s1.show();
		compnay_info();
	}
	
}
