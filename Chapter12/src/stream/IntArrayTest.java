package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = Arrays.stream(arr).sum();          //IntStream~sum
		int count = (int)Arrays.stream(arr).count(); //IntStream~count
		
		System.out.println(sum);                     //15
		System.out.println(count);                   //5
		
		System.out.println(Arrays.stream(arr).reduce(0, (a, b) -> a+b));
	}

}
