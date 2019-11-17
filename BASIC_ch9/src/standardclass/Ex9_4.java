package standardclass;

public class Ex9_4 {

	static void printGraph(int[] dataArr, char ch) {
		for(int data: dataArr) {
			for(int j=0; j<data; j++) {
				System.out.print(ch);
			}
			System.out.println(data);
		}
	}
	
	public static void main(String[] args) {
		printGraph(new int[]{3,7,1,4},'*');

	}

}
