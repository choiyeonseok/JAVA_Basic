package practice1;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		
		System.out.println("---------고객정보 출력---------");
		
		for(Customer customer: customerList) {          //업 캐스팅 다형성
			customer.showCustomerInfo();
			if (customer instanceof VIPCustomer) {      //다운 캐스팅
				VIPCustomer vip = (VIPCustomer)customer; 
				vip.showAgentInfo();
			}
		}
		
		System.out.println("---------할인율과 보너스 포인트 계산---------");
		
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			customer.showCustomerInfo();
		}
	
	}

}
