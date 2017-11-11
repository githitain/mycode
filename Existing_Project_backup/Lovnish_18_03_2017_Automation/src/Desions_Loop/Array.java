package Desions_Loop;

public class Array {

	public static void main(String[] args) 
	{
	
		String[]names=new String[3];
		names[0]="A";
		names[1]="A1";
		names[2]="A2";
		//names[3]="A3";
		
		int s1= names.length;
		System.out.println(s1);
		
		for(int i=0; i<s1;i++)
		{
			System.out.println("The vlaues of names array"+names[i]);
		}
		
		int[]li={1,8,5,9};
		int size=li.length;
		System.out.println("size of array" +size);
		
		for(int i=0; i<size;i++)
		{
			System.out.println("The vlaues of Li array"+li[i]);
		}
		
		int max=li[0];
		for(int i=1; i<size;i++)
		{
			if(li[i]>max)
				max=li[i];
			
		}
		
		System.out.println("The maximum vlaues of Li array"+max);
		
		int min=li[0];
		for(int i=1; i<size;i++)
		{
			if(li[i]<min)
				min=li[i];
			
		}
		System.out.println("The min vlaues of Li array"+min);
		
		int sum=0;
		for(int i=0; i<size;i++)
		{
			sum+=li[i];
			
		}
		System.out.println("The sum of Li array:"+sum);
		
	}

}
