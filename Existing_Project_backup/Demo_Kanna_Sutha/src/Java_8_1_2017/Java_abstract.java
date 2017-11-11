package Java_8_1_2017;

public abstract class Java_abstract 
{
	int speed= 500;
	public abstract void start();
	//public abstract void breakd();

	public void stop()
	{
		System.out.println("stopping the vechile");
		System.out.println(this.speed);
	}
}
