package lambda;

import java.util.List;
import java.util.ArrayList;

public class TravelCustomerTest {

	public static void main(String[] args) {
		
		TravelCustomer lee = new TravelCustomer("ÀÌ¼ø½Å ", 40, 100);
		TravelCustomer kim = new TravelCustomer("±èÀ¯½Å", 20, 100);
		TravelCustomer hong = new TravelCustomer("È«±æµ¿ ", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(lee);
		customerList.add(kim);
		customerList.add(hong);
		for (TravelCustomer customer: customerList) {
			System.out.println(customer.toString());
		}
		

		customerList.stream().map(s->s.getName()).forEach(c -> System.out.println(c));
		
		int total = 0;
		total = customerList.stream().mapToInt(c->c.getCost()).sum();
		System.out.println(total);
		customerList.parallelStream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
	}

}
