package grammer;

public class Weight {

	public static void main(String[] args) {

		double mon = 78.4;
		double tue = mon + 0.4;
		double wed = tue - 0.6;
		double thu = wed + 0.1;
		double fri = thu + 0.8;
		
		double avgWeight = (mon + tue + wed + thu + fri) / 5;
		
		System.out.printf("Æò±Õ ¸ö¹«°Ô : %.2fkg", avgWeight);
		
	}

}
