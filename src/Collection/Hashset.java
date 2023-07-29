package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	
	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		s.add("one");
		s.add("Two");
		s.add("Three");
		s.add("four");
		s.add("five");
		s.add("one");                  // this is duplicate value
		s.add("null");
	
		
		ArrayList<String> al =new ArrayList<String>();
		al.add("five");
		al.add("six");
		al.add("seven");
		al.add("eight");
		al.add("nine");
		al.add("ten");
		System.out.println(al);     // this will read only arrraylist
		s.addAll(al);               // but this will read both Hashset and Arraylist    
		System.out.println(s);      // this will print both
		
// using iterator for reading	 	
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}
	
	
	
	
	

}
