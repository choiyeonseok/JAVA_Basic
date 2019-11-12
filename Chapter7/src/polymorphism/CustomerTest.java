package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		GoldCustomer customerGo = new GoldCustomer(10030, "고길동");
		customerGo.bonusPoint = 7000;
		System.out.println(customerGo.showCustomerInfo());
		
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerGo);
		for(Customer customer: customerList) {
			System.out.println(customer.getCustomerName() + "고객의 구매가격은 " + customer.calcPrice(10000) + "원 입니다.");			
		}
		
	}

}
