package Java_8_1_2017;

public class Java_Inhertance_supeer2 extends Java_Inhertance_supeer
{
	int speed=150;
	void dis()
	{
		System.out.println(super.speed);
	}
	Java_Inhertance_supeer2()
	{
		super();
		System.out.println("Java_Inhertance_supeer2 construer 2");
	}
	

	void mss()
	{
		System.out.println("This is child class 'Java_Inhertance_supeer2'");
	}
	void dismss()

	{
		super.mss();
		mss();
		
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

		child.dis();
		child.dismss();
		child.Overriding();
		child.Overriding2();
		//super.
				
	}
}
