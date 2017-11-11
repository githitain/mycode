package dataTable;

import java.io.File;
import java.io.IOException;

public class demo 

{
	
	

	    public static void main(String[] args)
	    {   

	        try{

	            //create a temp file
	            File temp = File.createTempFile("te1", ".tmp"); 

	            System.out.println("Mytempfile : " + temp.getAbsolutePath());

	        //Get tempropary file path
	            String absolutePath = temp.getAbsolutePath();
	            String tempFilePath = absolutePath.
	                substring(0,absolutePath.lastIndexOf(File.separator));

	            System.out.println("Temp file path : " + tempFilePath);

	        }catch(IOException e){

	            e.printStackTrace();

	        }

	    }


}
