package Java_18_12_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOut_inputfrmkeyword 
{
	public static void main (String args[]) throws IOException //throws IOException

	{
		String t1;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("givr name");

		t1=br.readLine();
		System.out.println(t1);
				
		
	}
}
