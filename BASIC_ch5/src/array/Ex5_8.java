package array;

public class Ex5_8 {

	public static void main(String[] args) {

		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
	
		for(int i=0; i<answer.length; i++) {
			if(answer[i] == 1)
				counter[0] += 1;
			else if (answer[i] == 2)
				counter[1] += 1;
			else if (answer[i] == 3)
				counter[2] += 1;
			else
				counter[3] += 1;
		}
		
		for(int i: counter) {
			System.out.print(i);
			for (int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
