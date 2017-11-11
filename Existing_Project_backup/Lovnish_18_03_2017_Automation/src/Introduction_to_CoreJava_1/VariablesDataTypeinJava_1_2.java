package Introduction_to_CoreJava_1;

public class VariablesDataTypeinJava_1_2 
{
	/*Variables - It is an indentiier which holds the values of another varables and chnages its value at run time or execution time.
				1-Local Variables- It is varaible which is decalrted in the method is called local variables.
				2-Instance/Class Variables - It is varables whihc is decaredl inside the class but outside the method.
				3-Static Variables- It is varables which is decared as static. It cancnot be changed and localy used.
	//Datatyes - It specfic the size and type of value of a variables.
	 1-Primtive- It is basic datatypen wihci is supported by java.
	 Numaric type
	 	A-byte
	 	B-short
	 	C-int
	 	D-long
	 	E-Float
	 	F-Double
	 Boolean
	 Char	
	 	
	 2-Non-Primitive- It is reference data type whichn is used to an object. These type data can nver be change.
	  String 
	  
	*/
	
	public static void main(String []args) 
	{
	
			int num1=10;
			int num2=20;
			//int sum=0;
			
			int sum=num1+num2;
			int mins=num1-num2;
			int mul=num1*num2;
			
			char a1='a';

			System.out.println(sum);
			/*System.out.println(mins);
			System.out.println(a1);
			System.out.println(mul);*/
			
			if(sum>10)
			{
				System.out.println(mins);

			}
			else
				
				System.out.println(mul);
	
	}
	
	
	
}
