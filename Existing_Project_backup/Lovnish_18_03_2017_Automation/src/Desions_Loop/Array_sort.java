package Desions_Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Array_sort 
{
	public static void main(String[] args) 
	{
		//int[] array;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=s.nextInt();
		System.out.println("enter elements in the array:" +size+ "of array");
		int[]array = new int[size];
		for(int i =0; i<array.length;i++)
		{
			System.out.println("enter the number");
			array[i]=s.nextInt();
		}
		for(int i =0; i<array.length;i++)
		{
			System.out.println("Print the value of array:" +array[i]);
		}
		Arrays.sort(array);
		//System.out.println(array);
		System.out.println("array sort");
		for(int i =0;i<array.length;i++)
		{
			if(i!=0)
			{
				System.out.println("");
			}
			System.out.println(array[i]);
		}
		
	}
}
