package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	//메서드임
	Runnable getRunnable(int i) {
		
		int num = 100;
		class MyRunnable implements Runnable{
			
			@Override
			public void run() {
				
				//num += 10;  불가능
				//i = 200;    불가능
				//참조는 할 수 있지만 변경은 할 수 없다.
				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		}
		
		return new MyRunnable();
	}
}


public class LocalInnerClassTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
	}

}
