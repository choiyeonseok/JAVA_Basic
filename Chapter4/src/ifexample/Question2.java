package ifexample;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int start = (int)(n/2);
		int end = (int)(n/2);
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if (j < start) {
					System.out.print(" ");
				}
				else if (j <= end) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}		
			}
			
			if (i < (int)(n/2)) {
				start -= 1;
				end += 1;
			}
			else {
				start +=1;
				end -= 1;
			}
			
			System.out.println();
			
		}
		
	}

}
