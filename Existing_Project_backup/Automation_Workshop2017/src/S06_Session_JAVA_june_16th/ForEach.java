package S06_Session_JAVA_june_16th;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	
	public static void main(String args[]){
		List<String> myList=new ArrayList<String>();
		myList.add("aaaa");
		myList.add("bbbb");
		myList.add("cccc");
		myList.add("dddd");
		
		//for(String s:myList){
		//	System.out.println(s);
		//}
		for(int i=0;i<myList.size();i++){
		System.out.println(myList.get(i));
		}
	}

}
