package collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{
	
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1);
	}
}

public class ComparatorTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());  //comparator방식으로 정렬함
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("김유신");
		
		for(String str: treeSet) {
			System.out.println(str);
		}


	}

}


