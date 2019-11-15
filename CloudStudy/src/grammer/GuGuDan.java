package grammer;

public class GuGuDan {

	public static void main(String[] args) {
		
		printGuGuDan();

	}
	
	public static void printGuGuDan() {
		for(int i=2; i<10; i++) {
			printDan(i);
			System.out.println();
		}
	}
	
	public static void printDan(int dan) {
		System.out.printf("%d´Ü\n", dan);
		
		for(int i=1; i<10; i++) {
			System.out.printf("\t");
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			
		}
	
	}

}
