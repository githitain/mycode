package Java_8_1_2017;

public class Java_Inhertance 
{
		int v1=5; // instance variable
		
		void sum(int v1)
		{
			//v1=10; // local variable
			System.out.println("Instancer variable:" + this.v1);
			System.out.println("Local variable:" + v1);
		}
		
		public static void main(String args[])
		{
			Java_Inhertance obj = new Java_Inhertance();
			obj.sum(40);
			
		}
}
