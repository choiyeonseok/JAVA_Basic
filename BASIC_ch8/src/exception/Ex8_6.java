package exception;

public class Ex8_6 {

	public static void main(String[] args) {
		try {
			method1();
		} catch(Exception e) {
			System.out.println(5);
		}

	}
	
	static void method1() {
		try {
			method2();                   // method1에도 NullPointerException을 처리할 catch가 없다.
			System.out.println(1);
		} catch(ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		
		System.out.println(4);
	}
	
	static void method2() {
		throw new NullPointerException(); // 이 예외를 처리해줄 try-catch블럭이 없으므로 method2는 종료됨.
	}

}
