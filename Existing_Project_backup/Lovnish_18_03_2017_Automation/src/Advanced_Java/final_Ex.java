package Advanced_Java;

public class final_Ex 
{
	final int limit=20;
	int speed=20;
	
	void bike()
	{
		System.out.println(limit);
	}
	final void car()
	{
		speed=400;
		System.out.println(speed);
	}
	public static void main(String[] args) 
	{	static_ex.compnay_info();
		
		final_Ex f1=new final_Ex();
		static_ex s2=new static_ex();
		f1.bike();
		f1.car();
		s2.show();
	}
}
