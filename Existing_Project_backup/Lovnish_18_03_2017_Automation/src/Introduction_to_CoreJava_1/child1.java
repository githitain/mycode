package Introduction_to_CoreJava_1;

public class child1 extends ClassObject1
{
	int v1=50;

	public void now()
	{
		int v1=10;
		System.out.println("This is child method");
		System.out.println("local variable value" + v1);
		System.out.println("Instance variable value" + this.v1);
	}
}
