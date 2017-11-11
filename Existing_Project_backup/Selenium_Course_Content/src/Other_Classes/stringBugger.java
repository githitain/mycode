package Other_Classes;

public class stringBugger 
{
	public static void main(String args[])
	{
		int i =0;
		String Uname= "epop";
		StringBuffer e1=null;
		for(i=0; i<3; i++)
		{
		
			 e1= new StringBuffer(Uname).append(i);
			 System.out.println(e1);
			
		}
		
	}
}
