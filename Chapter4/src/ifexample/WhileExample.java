package ifexample;

public class WhileExample {

	public static void main(String[] args) {
	
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++; //11
			
		}

		System.out.println(sum); //55
		System.out.println(num); //11
	}

}
