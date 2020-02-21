package interfaceEx;

public class CustomerTest {
	public static void main(String [] ar) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if(seller instanceof Customer) {
			
		}
	}
}
