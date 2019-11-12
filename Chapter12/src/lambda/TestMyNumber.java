package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
	
		MyMaxNumber max = (x, y) -> (x >= y) ? x: y;  //메서드 구현, 함수이름은 x
		System.out.println(max.getMaxNumber(10, 20));
	}

}
