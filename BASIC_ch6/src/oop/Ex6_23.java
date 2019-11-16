package oop;

public class Ex6_23 {

	public static int max(int[] arr) {
		
		int err = -999999;
		
		if (arr == null || arr.length == 0)
			return err;
		int MAX = arr[0];
		for(int i=1; i<arr.length; i++) {
			if (MAX < arr[i])
				MAX = arr[i];
		}
		return MAX;
	}
	
	public static void main(String[] args) {
		
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		
		System.out.println("최대값 :"+ max(data)); 
		System.out.println("최대값 :"+ max(null)); 
		System.out.println("최대값 :"+ max(new int[]{}));

	}

}
