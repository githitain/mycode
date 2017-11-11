package File_Hanlding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class create_file 
{
	public static void main(String []args) throws InterruptedException, IOException 
	{
		File file = new File("d:\\newfile.txt");
		
		try {
			if(file.createNewFile())
			{
				System.out.println("file has created");
			}
			else
			{
				System.out.println("file has already creared");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		
	}
}
