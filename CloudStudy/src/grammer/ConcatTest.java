package grammer;

public class ConcatTest {

	public static void main(String[] arguments) {
	    String date = "2018-04-16";
	    String name = "ȫ�浿";
	    String action = "���α׷��� ����";
	    
	    System.out.println(date.concat(" " + name.concat(" " + action)));
	}
}
