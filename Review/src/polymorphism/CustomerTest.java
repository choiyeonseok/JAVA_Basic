package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer(100, "lee"));
		customerList.add(new Customer(101, "kim"));
		customerList.add(new GoldCustomer(102, "cho"));
		customerList.add(new GoldCustomer(103, "park"));
		customerList.add(new VIPCustomer(104, "hong", "ag101"));    

		for(Customer customer: customerList) {           // �� ĳ����
			customer.buy(10000);
			if (customer instanceof VIPCustomer) {       // �ٿ� ĳ����
				VIPCustomer vip = (VIPCustomer)customer;
				vip.showAgentInfo();
			}
				
			System.out.println();
			
		}
		
	}

}
