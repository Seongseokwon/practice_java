package chapter5;

public class OrderTest {
	public static void main(String []ar ) {
		Order order = new Order();
		
		order.orderNumber = 20190712321L;
		order.orderID = "abc123";
		order.orderDate = "2019년7월12일";
		order.orderName ="홍길순";
		order.orderItemNumber = "PD0345-12";
		order.address ="서울시 영등포구 여의도동 20번지";
			
		System.out.println("주문 번호 : " + order.orderNumber);
		System.out.println("주문자 아이디 : " + order.orderID);
		System.out.println("주문 날짜 : " + order.orderDate);
		System.out.println("주문자 이름 : " + order.orderName);
		System.out.println("주문 상품 번호 : " + order.orderItemNumber);
		System.out.println("배송 주소 : " + order.address);
		
		
	}
}
