package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이홍");
		Customer customerShin = new Customer(10020,"신고");
		Customer customerHong = new GoldCustomer(10030,"홍고");
		Customer customerYul = new GoldCustomer(10040,"율기");
		
		
		Customer customerSeong = new VIPCustomer(10050,"성석원",12545);
		
		
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerSeong);
		
		
		System.out.println("======= 고객 정보 출력 =========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		
		
		System.out.println("===========할인율과 보너스 포인트 계산 ============");
		
		int price= 10000;
		
		for(Customer customer : customerList){
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이" + cost + "원 지불 하셨습니다");
			System.out.println(customer.getCustomerName() +"님의 현재 보너스 포인트는 "+ customer.bonusPoint + "점 입니다.");
		}
	}

}
