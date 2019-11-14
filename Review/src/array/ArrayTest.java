package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		char[] arr = new char[26];
		
		for(int i=0; i<26; i++) {
			arr[i] = ((char)(i+65));
		}
		
		for(char c: arr) {
			System.out.print(c + " ");
		}
		
	}

}
