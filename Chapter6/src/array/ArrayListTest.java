package array;

import java.util.ArrayList; //ctrl+shift+o

public class ArrayListTest {

	public static void main(String[] args) {

		// 어떤 타입의 배열을 쓸것인지 <String>식으로 뒤에 붙여줘야한다.
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		
		for(String s : list) {
			System.out.println(s);
		}
	}
}
