package interfaceex;

public class CalcTest {

	public static void main(String[] args) {

		Calc calc = new CompleteCalc();
		//Calc calc = new CompleteCalc();   인터페이스를 구현한 클래스는 인터페이스 타입으로 변수를 선언하여 인스턴스화 할수 있다.
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
			
		if (calc instanceof CompleteCalc) {
			CompleteCalc ccalc = (CompleteCalc)calc;
			ccalc.showInfo();
		}
		calc.description();
		int[] arr = {1, 2, 3, 4, 5};
		int sum = Calc.total(arr);
		System.out.println(sum);
		
	}

}
