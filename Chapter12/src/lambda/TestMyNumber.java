package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
	
		MyMaxNumber max = (x, y) -> (x >= y) ? x: y;  //�޼��� ����, �Լ��̸��� x
		System.out.println(max.getMaxNumber(10, 20));
	}

}
