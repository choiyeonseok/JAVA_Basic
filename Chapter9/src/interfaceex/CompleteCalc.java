package interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0) 
			return ERROR;
		else
			return num1 / num2;
	}

	public void showInfo() {
		System.out.println("모든 기능이 구현됨");
	}

	@Override
	public void description() {
		System.out.println("재정의 된 description");
	}

}
