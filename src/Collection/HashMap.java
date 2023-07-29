package Collection;

import java.util.Map;
import java.util.Map.Entry;

public class HashMap {
// In hashmap keys are always unique.the values can be duplicate 
//	(i.e.key does not accept duplicate but value can accept duplicate 
	
	//ex key is (101,"abc"),here key is 101 and value is abc

	public static void main(String[] args) {
		// declaring the hashmap
		
		java.util.HashMap<Integer,String> hm = new java.util.HashMap<Integer,String>();
// to add the data we use put method
		hm.put(101, "shaikh");
		hm.put(102, "juned");
		hm.put(103, "ABC");
		hm.put(104, "PQR");
		hm.put(98, "LMN");
		System.out.println(hm);
	// to read hashmap only possible by for-loop
		
		for(Entry m:hm.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		
		
	}
}
