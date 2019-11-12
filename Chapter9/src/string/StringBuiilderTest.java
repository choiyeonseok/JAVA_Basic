package string;

public class StringBuiilderTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer)); //366712642
		buffer.append("android");  
		System.out.println(System.identityHashCode(buffer)); //366712642
		java = buffer.toString();

	}

}
