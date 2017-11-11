package Collection_framewrok;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Hashmap 
{
	public static void main(String[] args) 
	{

	HashMap<Integer,String> m1 = new HashMap<Integer,String>();
	 m1.put(0, "Rul");
	 m1.put(1, "Rul");
	 m1.put(2, "Rul");
	 m1.put(3, "Rul");
	 m1.put(3, "Rul");
	 
	 System.out.println(m1);
	 
	Set set = m1.entrySet();
	Iterator it = set.iterator();
	while(it.hasNext())
	{
		Map.Entry mentry = ((Map.Entry)it.next());
		System.out.println("k: " + mentry.getKey()+"& Value is:");
		System.out.println(mentry.getValue());
	}
	}
}
