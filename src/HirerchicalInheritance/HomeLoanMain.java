package HirerchicalInheritance;

public class HomeLoanMain {
	
	public static void main(String[] args) {
		// first customer for Homeloan
		
		Homeloan hl= new Homeloan ();
		hl.username("xyz");
		hl.mobileNumber("123456543");
		hl.address("delhi");
		hl.HloanintrestRate();
		System.out.println("===================");
		
		//second customer for Ploan
		
		Ploan pl=new Ploan();
		pl.username("abc");
		pl.mobileNumber("234566784");
		pl.address("mumbai");
		pl.PloanintrestRate();
		System.out.println("=========================");
		
		//third customer for vehicle loan
		
		VehicleLoan vl=new VehicleLoan();
		vl.username("pqr");
		vl.mobileNumber("56473829");
		vl.address("pune");
		vl.fourWheelerloanintrestRate();
		System.out.println("for two wheeler intrest rate");
		vl.TwoWheelerloanintrestRate();
		
		System.out.println("for six wheeler intrest rate");
		
		vl.sixWheelerloanintrestRate();
		
		
	}

}
