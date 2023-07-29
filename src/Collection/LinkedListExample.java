package Collection;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		li.add(15);
		li.add("ABC");
		li.add('c');
		li.add(15);             // this is duplicate nummber
		
// to see the list 
		System.out.println(li);         // it allows duplicate
// to check the present element or number,o/p will be true or false,if present then true
		System.out.println("Contain Method "+li.contains('z'));
		
		
		li.add(2, "PQR");  //add on 2 index by removing
		System.out.println(li);
		
// checking the size 
		System.out.println("the size is "+ li.size());
		
		System.out.println(li.get(1)); // to get element by index number
		
		
		
// To read by using iterator		
		Iterator itr = li.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
// to read first element Method is .getfirst()		
		System.out.println("the first element is "+ li.getFirst());
// to read last element Method is  .getlast()		
		System.out.println("the last element is "+li.getLast());
// to add at first index Method is .addfirst()		
	    li.addFirst("java");              
		System.out.println(li);     // to see the updated or added list     
		
// to add at last index of list Methos is .addLast()
		li.addLast("Python");
		System.out.println(li);
// to remove first element of list Method is .removefirst() 		
		li.removeFirst();                  // this will remove first element only 
		System.out.println(li);           
		
// to remove element  of list method is  .removelast()		
		li.removeLast();                  // this will remove last element only.
		System.out.println(li);           
		
		
		
	}
	

}
