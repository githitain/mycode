package Java_18_12_2016;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOut_createfile 
{
	public static void main (String args[]) //throws IOException //throws IOException
	{
		// create a file
		try
		{
			File file = new File("C:/Ashu Folder/ch2.txt");
			
			if(file.createNewFile())
			{
				System.out.println("file is created");
			}
			else
			{
				System.out.println("file has already created");
			}					
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		// read a file
		try
		{
			File file = new File("C:/Ashu Folder/ch1.txt");
			BufferedReader br= new BufferedReader(new FileReader(file));
			String s1;
			//s1.split(regex)
			while((s1=br.readLine())!=null)
			{
				//s1.split(regex)
				System.out.println(s1);
			}
			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		//write a file
		try
		{
			File file = new File("C:/Ashu Folder/ch2.txt");
			FileWriter wr = new FileWriter(file);
			
			String t1;
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("givr name");

			t1=br.readLine();
			System.out.println(t1);
			
			
			wr.write(t1);
			System.out.println("File has wriiten");

			br.close();
			wr.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
