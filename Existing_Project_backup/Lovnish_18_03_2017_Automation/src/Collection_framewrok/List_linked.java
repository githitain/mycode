package Collection_framewrok;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List_linked 
{
	public static void main(String[] args) 
	{
	LinkedList <Integer> arrls = new LinkedList <Integer>();
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
	arrls.removeFirst();
	arrls.clear();
	System.out.println("array values" +arrls);
}
}
