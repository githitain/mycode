package Collection_framewrok;

import java.util.ArrayList;
import java.util.Iterator;

public class list_Arralist 
{
	public static void main(String[] args) 
	{
	ArrayList <Integer> arrls = new ArrayList <Integer>();
	arrls.add(14);
	arrls.add(14);
	arrls.add(15);
	arrls.add(16);
	arrls.add(13);

	System.out.println(arrls);
	
	Iterator lt = arrls.iterator();
	while(lt.hasNext())
	{
		System.out.println(lt.next());
		
		
	}
	arrls.remove(3);
	System.out.println("array values" +arrls);
	arrls.clear();
	System.out.println("array values" +arrls);
}
}
