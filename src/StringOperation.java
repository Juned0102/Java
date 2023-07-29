public class StringOperation {
 
//		public static void main(String[] args) {
//			
//			String s= "Velocity";
//			String s1= "Velociity";
//			String s2= " Welcome to Home ";
	
	                      //the different types of string operations
//			
//			// To calculate the length.
//			System.out.println("The Length is "+ s.length());
//			
//			// Uppercase ==> To convert string in uppercase.
//			System.out.println("The Uppercase is "+ s.toUpperCase());
//			
//			// Lowercase
//			System.out.println("The Lowercase is "+ s.toLowerCase());
//			
//			// char at ==> the character at specific index.
//			System.out.println("The character at 3rd index " +s.charAt(3));
//			
//			// indexof ==> it will return index of specific character.
//			System.out.println("The index of i is "+ s.indexOf("i"));
//			
//			// lastindexof
//			System.out.println("The last index of i is "+ s1.lastIndexOf("i"));
//			
//			// trim 
//			System.out.println("The String s2 before trimming "+ s2);
//			System.out.println(" The String s2 after trimming "+ s2.trim());
//			
			
		// Program String Comparision

//				String s="Velocity";
//				String s1 ="VELOCITY";
//				String s2= "Veloc";
//				
//				// equals. // its a case sensitive.  // True /false.
//				System.out.println(s.equals(s1));
//				
//				// equalsingnorecase:- 
//				System.out.println(s1.equalsIgnoreCase(s));
//				
//				// contains.
//				System.out.println(s.contains(s2));
//				
//				// isempty();
//				System.out.println("Checking the emptyness "+ s.isEmpty());
//			
//				String s4= "abc";
//				String s5= "xyz";
//				// concats.
//				System.out.println("The Concatinated string is "+ s4.concat(s5));
//				
//				// startswith
//				System.out.println("The Strats with Method "+ s2.startsWith("ab"));
//				
//				// endswith
//				System.out.println("The ends with Method "+ s4.endsWith("bc"));
//				
//				String s6= "Welcome to Java";
//			
//				// replace
//				System.out.println("The Replace "+ s6.replace("Java", "Python"));
//				
//				
//				// substring
//				System.out.println("The Substring with start index only "+ s.substring(3));
//				System.out.println("The Substring with Start and end index "+ s.substring(3, 6));
//				
		
		// Reverse String

//				String Original="abcdef";
//				String reverse="";
//				
//				System.out.println(Original.length());
//				
//				for (int i=Original.length()-1;i>=0;i--)
//				{
//					reverse=reverse+Original.charAt(i);
//				}
//				
//				System.out.println("The Reverse String is "+ reverse);

		
		            // Palindrome String
//
//				String Original= "abcba";
//				String Reverse="";
//				
//				for (int i= Original.length()-1; i>=0;i--) {
//					Reverse=Reverse+Original.charAt(i);
//				}
//				System.out.println(Reverse);
//			
//				//System.out.println(Original.equals(Reverse)); // true // false
//				
//				if(Original.equals(Reverse)) {
//					System.out.println("The entered String is Palindrome");
//				}else {
//					System.out.println("The entered String is not Palindrome");
//				}
//

	public static void main(String[] args) {
		String a="SHAIKH";
		String b="junaid";
		
		System.out.println(a.toLowerCase());  //use for lowercase
		System.out.println(b.toUpperCase());  //use for uppercase
		
		System.out.println(b.concat(a));  // use for adding two String
		System.out.println(b+" ".concat(a));  //these is for adding Space between String b and String a.
		System.out.println(b.length());   //to find length of String
		
		String c="   stone     ";
		String d="";
		String e="learn";
		
		System.out.println(c.trim());    // use for neglecting blank Spaces (Starting and ending space)
		System.out.println(d.isEmpty()); // these see is our String is empty or not,if empty then print true other wise false
			
		
		System.out.println(b.charAt(2));    // use for showing index words
		System.out.println(a.indexOf('A')); // use for finding index number
		
		System.out.println(b.equals(a));//if both String is same then it will show true or if not same it will show false
		
		
		System.out.println(e.replace('r','e'));  //use for replacing words
		
		
//  Program for reverse String 		
//		String s="Crusher";
//		String rev ="";
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);		
//		}
//		System.out.println(rev);
//		
//	}
		
//----------------------------------------	
	String s="Crusher";
	String rev ="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);		
	}
	if(s.equals(rev)) {
		System.out.println("Palindrome String");		
    }else
    	System.out.println("Not a Palindrome String");	
	
}	
}
			
		
		
	  
	
	
	

