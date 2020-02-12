package inheritance;

public class CustomerTest {
	
	public static void main(String [] ar) {
		
	/*	Customer customerLee = new Customer();
		customerLee.setCustomerName("¿Ãº¯Ω≈");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
	*/
		
		Customer customerKim = new VIPCustomer(10020, "±Ë¿ØΩ≈");
		/*
		 * customerKim.setCustomerName("±Ë¿ØΩ≈"); 
		 * customerKim.setCustomerID(10020);
		 */
		customerKim.bonusPoint=50000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
