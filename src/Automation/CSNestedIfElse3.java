package Automation;

public class CSNestedIfElse3 {
	public static void main(String[] args) {
		int marks = 40;
		if(marks>90) {
			System.out.println("A");
			
		}
		else {
			if(marks>70) {
				System.out.println("b");
			
			}
			else {
				if(marks>60) {
					System.out.println("C");
				}
				if(marks>40) {
					System.out.println("d");
				}
				if(marks>30) {
					System.out.println("e");
				}
			}
		}
		
	}

}
