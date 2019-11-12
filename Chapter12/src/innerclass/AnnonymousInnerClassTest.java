package innerclass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	//메서드임
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		//이게 익명 내부 클래스
		return new Runnable() {
			
			@Override
			public void run() {

				//참조는 할 수 있지만 변경은 할 수 없다.
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
			
		};
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Test");
			
		}
	};
	
}


public class AnnonymousInnerClassTest {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		outer.runner.run();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
