package Overriding;

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		RBI r = new RBI();
		System.out.println(r.rateofintrest()); // we call in syso b'coz this is return type method
		System.out.println(r.personalloanintrest());
		
		SBI s = new SBI();
		System.out.println(s.rateofintrest());  // we call in syso b'coz this return type method  
		System.out.println(s.personalloanintrest());
		
		HDFC h = new HDFC();
		System.out.println(h.rateofintrest());
		
		
	}
	

}
