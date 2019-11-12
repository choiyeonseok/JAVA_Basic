package classpart;

public class OrderTest {

	public static void main(String[] args) {

		Order order = new Order();
		
		order.orderNumber = "201907210001";
		order.customerID = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.customerName = "홍길순";
		order.productID = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호: " + order.orderNumber);
		System.out.println("주문자아이디: " + order.customerID);
		System.out.println("주문날짜: " + order.orderDate);
		System.out.println("주문자이름: " + order.customerName);
		System.out.println("상품번호: " + order.productID);
		System.out.println("배송지: " + order.address);
		
	}

}
