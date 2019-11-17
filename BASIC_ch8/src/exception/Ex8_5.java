package exception;

public class Ex8_5 {

	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException();  // 예외가 발생하면 catch(RuntimeException)으로 간다.
			System.out.println(2);
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {               // 예외 발생 여부에 관계 없이 항상 실행되는 문장!!!!
			System.out.println(5);
		}
		
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		
		method(true);
		method(false);

	}

}
