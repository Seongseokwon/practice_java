package chapter5;

public class OrderTest {
	public static void main(String []ar ) {
		Order order = new Order();
		
		order.orderNumber = 20190712321L;
		order.orderID = "abc123";
		order.orderDate = "2019��7��12��";
		order.orderName ="ȫ���";
		order.orderItemNumber = "PD0345-12";
		order.address ="����� �������� ���ǵ��� 20����";
			
		System.out.println("�ֹ� ��ȣ : " + order.orderNumber);
		System.out.println("�ֹ��� ���̵� : " + order.orderID);
		System.out.println("�ֹ� ��¥ : " + order.orderDate);
		System.out.println("�ֹ��� �̸� : " + order.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.orderItemNumber);
		System.out.println("��� �ּ� : " + order.address);
		
		
	}
}
