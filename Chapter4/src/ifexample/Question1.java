package ifexample;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		int b = scanner.nextInt();
		
		char operator = '+';
		
		int result = 0;
		
		if (operator == '+') {
			result = a+b;
		}
		else if (operator == '-') {
			result = a-b;
		}
		else if (operator == '*') {
			result = a*b;
		}
		else if (operator == '/') {
			result = a/b;
		}
		
		System.out.println(result);
	}

}
