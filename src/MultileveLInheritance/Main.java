package MultileveLInheritance;

public class Main {
	
public static void main(String[] args) {
		
		Grandson gs = new Grandson();
		gs.m3();  // original or grandson  class method
		gs.m2();  // parent for grandson
		gs.m1();  // parent for child
		
	}

}
