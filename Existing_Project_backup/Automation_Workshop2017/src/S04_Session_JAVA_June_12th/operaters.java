package S04_Session_JAVA_June_12th;

public class operaters 
{
	public static void main(String args[])
	{
		
		//1-Arithmetic Operators- 
		
		 System.out.println("1-Arithmetic Operators------------");
			int X = 10;
			int Y = 20;
			System.out.println("Addition (X+Y) = "+(X+Y)); /* return 30,*/ 
			System.out.println("Subtraction  (X-Y) = "+(X-Y)); // return -10
			System.out.println("Multiplication (X*Y) = "+(X*Y)); // return 200
			System.out.println("Division (Y/X) = "+(Y/X)); // return 2
			System.out.println("Addition (Y%X) = "+(Y%X)); // return 0
			Y++;
			System.out.println("Increment Y = "+Y); // return 21
			X--;
			System.out.println("Decrement X = "+X); // return 9}}

		//2-Relational Operators
			System.out.println("2-Relational Operators----------------");

			System.out.println("(X == Y) = "+(X == Y));
			System.out.println("(X != Y) = "+(X != Y));
			System.out.println("(X > Y) = "+(X > Y));
			System.out.println("(X < Y) = "+(X < Y));
			System.out.println("(X >= Y) = "+(X >= Y));
			System.out.println("(X <= Y) = "+(X <= Y));	

		//3-Logical Operator
			System.out.println("3-Logical Operators----------------");
			if((X == Y) && (X != Y))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			if((X == Y) || (X != Y))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
			}
			
		//4-Assignment operators
			System.out.println("4-Assignment Operators----------------");
			X += 1;
			System.out.println("X+=1 : "+X);
			Y<<=1;
			System.out.println("Y<<=1 : "+Y);
			
		//5-Bitwise Operators
			System.out.println("5-Bitwise Operators----------------");
			int a = 60;	/* 60 = 0011 1100 */
		    int b = 13;	/* 13 = 0000 1101 */
		    int c = 0;

		      c = a & b;        /* 12 = 0000 1100 */
		      System.out.println("a & b = " + c );

		      c = a | b;        /* 61 = 0011 1101 */
		      System.out.println("a | b = " + c );

		      c = a ^ b;        /* 49 = 0011 0001 */
		      System.out.println("a ^ b = " + c );

		      c = ~a;           /*-61 = 1100 0011 */
		      System.out.println("~a = " + c );

		      c = a << 2;       /* 240 = 1111 0000 */
		      System.out.println("a << 2 = " + c );

		      c = a >> 2;       /* 15 = 1111 */
		      System.out.println("a >> 2  = " + c );

		      c = a >>> 2;      /* 15 = 0000 1111 */
		      System.out.println("a >>> 2 = " + c );

		  //6-Ternary operator
		      System.out.println("6-Ternary Operators----------------");
		      
		      int i, k;//from w  w  w .  j a  va 2s  . c  o  m
		      i = 10;
		      k = i < 0 ? -i : i; 
		      System.out.print("Absolute value of ");
		      System.out.println(i + " is " + k);

		      i = -10;
		      k = i < 0 ? -i : i; 
		      System.out.print("Absolute value of ");
		      System.out.println(i + " is " + k);      
}
}