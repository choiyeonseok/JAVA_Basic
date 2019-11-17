package exception;

public class Ex8_10 {

	public static void main(String[] args) {
		
		try {
			method1();            //예외 발생!!
			System.out.println(6);//예외가 발생해서 실행 x
		} catch(Exception e) {
			System.out.println(7);
		}
	}
	
	static void method1() throws Exception{
		try {
			method2();
			System.out.println(1);
		} catch(NullPointerException e) {
			System.out.println(2);
			throw e;                      // 예외를 다시 발생, 예외 되던지기 (re-throwing)
		} catch(Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		
		System.out.println(5);
	}
	
	static void method2() {
		throw new NullPointerException();
	}

}
// 2, 4, 7