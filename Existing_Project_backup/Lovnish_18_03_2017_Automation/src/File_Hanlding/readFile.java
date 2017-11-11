package File_Hanlding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile 
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
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			while((str=br.readLine()) != null)
			{
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}
}
