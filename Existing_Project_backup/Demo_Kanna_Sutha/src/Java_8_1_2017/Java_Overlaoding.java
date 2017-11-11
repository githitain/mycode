package Java_8_1_2017;

public class Java_Overlaoding extends Java_Inhertance_supeer

{	int speed=150;
	void dis()
	{
		System.out.println(super.speed);
		
	}
	
	
	void mss()
	{
		System.out.println("This is child class 'Java_Inhertance_supeer2'");
	}
	
	
	
	@Override
	void Overriding2()
	{  
		System.out.println("Overriding2 this method'");

	}
	
	public static void main(String args[])
	{
		Java_Inhertance_supeer2 child = new Java_Inhertance_supeer2();
		//Java_Inhertance_supeer2 child = new Java_Inhertance_supeer2();

//		child.dis();
//		child.dismss();
		child.Overriding();
		child.Overriding2();
		//super.
				
	}
}
