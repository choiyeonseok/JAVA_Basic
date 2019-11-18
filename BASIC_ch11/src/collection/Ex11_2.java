package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex11_2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);

		HashSet<Integer> set = new HashSet<Integer>(list);
		TreeSet<Integer> tset = new TreeSet<Integer>(set);  //오름차순 정렬 set

		Stack<Integer> stack = new Stack<Integer>();
		stack.addAll(tset);
		
		while(!stack.empty())
			System.out.println(stack.pop()); //뒤에서부터 팝됨
		
	}

}
