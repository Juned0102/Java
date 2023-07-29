package Arrays;

public class ArreayRiverseString {
	
	// Reverse String
	public static void main(String[] args) {
//		// Reverse String
//
//				String Original="abcdef";
//				String reverse="";       
////      in reverse string any character,space as well as number not write in between the double quatation.				
//				System.out.println(Original.length());
//				
//				for (int i=Original.length()-1;i>=0;i--)
//				{
//					reverse=reverse+Original.charAt(i);
//				}
//				
//				System.out.println("The Reverse String is "+ reverse);
//	
//===============================================================================
		
		
		// Palindrome String

				String Original= "abcba";
				String Reverse="";
				
				for (int i= Original.length()-1; i>=0;i--) {
					Reverse=Reverse+Original.charAt(i);
				}
				System.out.println(Reverse);
			
				//System.out.println(Original.equals(Reverse)); // true // false
				
				if(Original.equals(Reverse)) {
					System.out.println("The entered String is Palindrome");
				}else {
					System.out.println("The entered String is not Palindrome");
				}
	
		
	}
	
}		
