package practice;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer Lee = new Customer("�̼���", 40, 100);
		Customer Kim = new Customer("������", 20, 100);
		Customer Hong = new Customer("ȫ�浿", 13, 50);
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(Lee);
		customerList.add(Kim);
		customerList.add(Hong);
		
		for(Customer customer: customerList) {
			customer.showInfo();
			System.out.println(customer);
		}
		
		customerList.stream().map(c->c.getCustomerName()).forEach(s->System.out.println(s));
		int total = customerList.stream().mapToInt(c->c.getCost()).sum();
		System.out.println(total);

		customerList.stream().filter(c->c.getCustomerAge() >= 20).map(c->c.getCustomerName()).sorted().forEach(s->System.out.println(s));
	}

}
