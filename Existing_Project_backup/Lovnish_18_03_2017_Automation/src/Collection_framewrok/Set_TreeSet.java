package Collection_framewrok;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet implements Comparable <Set_TreeSet>
{
	int id, quantity;
	String name, author,publisher;
	
	Set_TreeSet(int id, String name, String author, String publisher, int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	
	public int compareTo(Set_TreeSet b) 
	{
		if(id>b.id)
		{
			return 1;
		}
		else if(id<b.id)
		{
			return -1;
		}
		else
		{
		return 0;
	}}
	
	public static void main(String[] args) 
	{
		Set<Set_TreeSet> set = new TreeSet<Set_TreeSet>();
		Set<Set_TreeSet> setH = new HashSet<Set_TreeSet>();
		Set_TreeSet b3= new Set_TreeSet(121,"h31","A31","P31",3500);
		Set_TreeSet b1= new Set_TreeSet(1231,"h21","A21","P1",500);
		Set_TreeSet b2= new Set_TreeSet(1221,"h21","A21","P21",2500);
		
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		setH.add(b1);
		setH.add(b2);
		setH.add(b3);
		
		/*System.out.println(set);
		
		for(Set_TreeSet b:set)
		{
			System.out.println(b.id+" "+b.author+" "+b.name+" "+b.publisher+" " +b.quantity);
		}*/
		
		for(Set_TreeSet b:setH)
		{
			System.out.println(b.id+" "+b.author+" "+b.name+" "+b.publisher+" " +b.quantity);
		}
		
		
		
	}
}
