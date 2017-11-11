package Java_8_1_2017;

public class Java_class_object1 
{
	int puppyAge;  // instance variables
	String dogA;//="German shagad";// instance variables
	String dogB;//="pug";// instance variables
	
	Java_class_object1()//constructer
	{
		System.out.println("First is constructer");
	}
	Java_class_object1(String a, String b)///constructer paratized
	{
		dogA=a;
		dogB=b;
			
		System.out.println("1 Types of dogs:" + dogA );
		System.out.println("2 Types of dogs:" + dogB );
	}
	public void name(String name) // methods
	{
		System.out.println(name);
	}
	public void setAge(int age)  // methods
	{
		puppyAge=age;
	}
	public int getAge()  // methods
	{
		System.out.println("P age:" + puppyAge);
		return puppyAge;
	}
	
	public static void main(String args[])
	{
		Java_class_object1 p = new Java_class_object1("German","Pug");
		Java_class_object1 p1 = new Java_class_object1();
		p.name("tiger");
		p.setAge(15);
		p.getAge();
		//p.puppyAge;
	
		//System.out.println("p info: + " p.puppyAge);
		
	}
}
