package grammer;

public class NewLine {

	public static void threeLines() {
		for(int i=0; i<3; i++) {
			System.out.println(">");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Line1");
		threeLines();
		System.out.println("Line2");

	}

}
