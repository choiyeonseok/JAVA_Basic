package interfaceex;

public class CalcTest {

	public static void main(String[] args) {

		Calc calc = new CompleteCalc();
		//Calc calc = new CompleteCalc();   �������̽��� ������ Ŭ������ �������̽� Ÿ������ ������ �����Ͽ� �ν��Ͻ�ȭ �Ҽ� �ִ�.
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
