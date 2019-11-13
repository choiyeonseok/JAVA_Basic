package practice2;

import java.util.List;
import java.util.ArrayList;

public class TravelCustomerTest {

	public static void main(String[] args) {
		
		
		TravelCustomer Lee = new TravelCustomer("ÀÌ¼ø½Å", 40, 100);
		TravelCustomer Kim = new TravelCustomer("±èÀ¯½Å", 20, 100);
		TravelCustomer Hong = new TravelCustomer("È«±æµ¿", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(Lee);
		customerList.add(Kim);
		customerList.add(Hong);
		
		for(TravelCustomer customer: customerList) {
			System.out.println(customer);
		}
		
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		int total = customerList.stream().mapToInt(c->c.getCost()).sum();
		System.out.println(total);
		
		customerList.stream().filter(c->c.getAge() >= 20).forEach(s->System.out.println(s));

	}

}
