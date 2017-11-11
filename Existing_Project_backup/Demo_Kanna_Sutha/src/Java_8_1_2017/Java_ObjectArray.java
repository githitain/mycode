package Java_8_1_2017;

public class Java_ObjectArray 
{
	String name;
	int id;
	int age;
	
	Java_ObjectArray(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	Java_ObjectArray(String name, int id, int age)
	{
		this.name=name;
		this.id=id;
	}



public static void main(String args[])
{

			Java_ObjectArray[] obj=new Java_ObjectArray[4];
			obj[0]=new Java_ObjectArray("ram", 101);
			obj[1]=new Java_ObjectArray("ram1", 1011);
			obj[2]=new Java_ObjectArray("ram2", 1012);
			obj[3]=new Java_ObjectArray("ram3", 1013);
			//obj[4]=new Java_ObjectArray("ram4", 1014);
			
			for(Java_ObjectArray obj1:obj)
			{
				System.out.println(obj1.name+ "and " + obj1.id);
			}
}}

