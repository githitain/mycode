package Introduction_to_CoreJava_1;

public class Child2 extends Parent2
{
	int P1=50;
	
	Child2()
	{
		//super();
		System.out.println("Child class constructorer");
	}
	
	void mins()
	{	
		int b;
		super.sum();
		b=this.P1-super.P1;
		System.out.println("mins is :"+b);
		
		
	}
}
