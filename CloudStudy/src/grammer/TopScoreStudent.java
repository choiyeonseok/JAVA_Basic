package grammer;

public class TopScoreStudent {

	public static void main(String[] args) {
		
		String[] name = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
		int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};
		
		int topIndex = topIndex(scores);
		System.out.println("1µî : " + name[topIndex] + "(" + scores[topIndex] + "Á¡)"); 

	}
	
	public static int topIndex(int[] arr) {
		int max = arr[0];
		int topIndex = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(max < arr[i+1]) {
				max = arr[i+1];
				topIndex = i+1;
			}
				
		}
		return topIndex;
	}

}
