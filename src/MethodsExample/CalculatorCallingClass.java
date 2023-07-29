package MethodsExample;

public class CalculatorCallingClass {
	
	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		System.out.println(cal.getsum(50, 50));
		System.out.println(cal.getsubstraction(100, 50));
		System.out.println(cal.getmultiplication(10,2));
		System.out.println(cal.getdivision(10, 2));
		System.out.println(cal.getdsumthree(10,10, 10));
	
	}

}
