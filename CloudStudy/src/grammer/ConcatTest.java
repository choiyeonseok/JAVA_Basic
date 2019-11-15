package grammer;

public class ConcatTest {

	public static void main(String[] arguments) {
	    String date = "2018-04-16";
	    String name = "홍길동";
	    String action = "프로그래밍 시작";
	    
	    System.out.println(date.concat(" " + name.concat(" " + action)));
	}
}
