package string;

public class StringTest2 {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java)); //366712624
		
		java = java.concat(android);
		System.out.println(System.identityHashCode(java)); //1829164700
	
	}

}
