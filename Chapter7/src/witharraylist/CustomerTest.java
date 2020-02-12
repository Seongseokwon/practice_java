package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "��ȫ");
		Customer customerShin = new Customer(10020,"�Ű�");
		Customer customerHong = new GoldCustomer(10030,"ȫ��");
		Customer customerYul = new GoldCustomer(10040,"����");
		
		
		Customer customerSeong = new VIPCustomer(10050,"������",12545);
		
		
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerSeong);
		
		
		System.out.println("======= �� ���� ��� =========");
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		
		
		System.out.println("===========�������� ���ʽ� ����Ʈ ��� ============");
		
		int price= 10000;
		
		for(Customer customer : customerList){
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"����" + cost + "�� ���� �ϼ̽��ϴ�");
			System.out.println(customer.getCustomerName() +"���� ���� ���ʽ� ����Ʈ�� "+ customer.bonusPoint + "�� �Դϴ�.");
		}
	}

}
