package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class ArraylistProgram {
	
	public static void main(String[] args) {
		// declaring ArrayList
		ArrayList al = new ArrayList();     // import ArrayList from java.util
		al.add(15);
		al.add("abc");
  //		al.add(" ");                       // to add blank space  
		al.add('A');
		al.add(15);
		System.out.println(al);
			
  // add the element on existing index	
		
		al.add(2,'B');                         // this will shift the data from mentioned index
		System.out.println(al);
		
		al.set(3, "XYZ");                    // this set is for replacement
		System.out.println(al);
		
		al.remove(4);                        // to remove the element from respective position
		System.out.println(al);
		
//		System.out.println("---");
//		al.clone();
//		System.out.println(al);               
		
		
		System.out.println("Checking the emptiness :-"+ al.isEmpty());  //this check empty or not
		
		// to calculate the size
		System.out.println("Checking the size of ArrayList :-"+ al.size()); // check the size of ArrayList
		                           // the size is in counting basis not on index basis... 
		
		 // show the index of perticular element
		System.out.println("The index of B "+ al.indexOf('B'));  
		
		// dynamic condition checking.to check any element available inside the ArrayList
		System.out.println("Contain Method:- "+al.contains(15));
		
		// to get value at any index
		System.out.println("to check the index :-"+al.get(1));
		
		al.add(15);
		System.out.println(al);
		System.out.println("index of 15 "+al.indexOf(15));   // this will show me for first 15
		System.out.println("index of 15 "+al.lastIndexOf(15));  // last index of 15

//       Reading the ArrayList 		
		//1. By using Regular For-loop
		//2. By using Advanced for-loop(enhanced for-loop)
		//3. By Iterator
		//4. By List Iterator
		
//		//1. By using Regular For-loop
//		for(int i=0;i<al.size();i++) {
//			System.out.println(" "+al.get(i));
//		}
		
		
		//2. By using Advanced For-loop
//		for(Object value:al) {
//			System.out.println(value);
//		}
		
	
//		//3.declaring the Iterator
//		Iterator itr = al.iterator();               // import this from java.util 
//		while(itr.hasNext()) {
//			System.out.println(itr.next()); 
//		}
		
		//4. By using listIterator
		// this is only for list interface classes.
		
//		ListIterator litr = al.listIterator();       // import this from java.util
//		while (litr.hasNext()) {
//			System.out.println(litr.next());
//		}
		
		 
// to Reverse the ArrayList order
		
		Collections.reverse(al);
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}
	
}
