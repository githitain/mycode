package Introduction_to_CoreJava_1;

public class ClassObject2 
{
	
	public static void main(String []args) 
	{
	
			ClassObject1 s1= new ClassObject1(12,47);
			ClassObject2 s2= new ClassObject2();
			ClassObject2 s3= new ClassObject2();
			ClassObject2 s4= new ClassObject2();
			
			s1.student("amiy");
			System.out.println(s1.address);
			System.out.println(s1.name);
			//s5.student("amiy");
			
			System.out.println(ClassObject1.clgname);
			/*System.out.println(name);
			System.out.println(age);*/
			
			
			s1.max(45, 89);
			
		
			ClassObject1.mul(78,3);
			
	}
	
	
	
}
