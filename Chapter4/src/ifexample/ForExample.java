package ifexample;

public class ForExample {

	public static void main(String[] args) {
		
		int count;
		int sum = 0;
		int total = 0;
		
		for(count =1; count <=10; count++) {
			sum += count;
		}
		
		
		count = 1;
		for(int i = 0; i < 10; i++, count++) {
			total += count;
		}
		System.out.println(sum);
		System.out.println(total);
	
	
	}

}
