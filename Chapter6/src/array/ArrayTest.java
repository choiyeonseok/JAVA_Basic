package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		//int[] arr = new int[] {1, 2, 3}; // 선언과 동시에 초기화 가능
		
		// int[] arr;
		// arr = {1, 2, 3}은 안된다.
		
		int[] arr = new int[10];
		int total = 0;
		for(int i=0, num=1; i < arr.length; i++, num++) {
			arr[i] = num;
		}
		System.out.println(arr);
		
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
			System.out.println(arr[i]); //1 ~ 10
		}
		System.out.println(total);  //55

		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		
		double mtotal = 1;
		for(int i = 0; i < count; i++) {
			mtotal *= dArr[i];
		}
		System.out.println(mtotal);  //55
	}

}
