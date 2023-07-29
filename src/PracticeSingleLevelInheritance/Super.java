package PracticeSingleLevelInheritance;

public class Super {
	
	public void m1() {
		System.out.println("thise is super class or parent class");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(" *");
			}
			System.out.println();
			
		}
		
		
		
	}

}
