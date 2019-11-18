package collection;

import java.util.ArrayList;

public class Ex11_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> kyo = new ArrayList<Integer>(); // 교집합
		ArrayList<Integer> cha = new ArrayList<Integer>(); // 차집합
		ArrayList<Integer> hap = new ArrayList<Integer>(); // 합집합

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);

		kyo.addAll(list1);
		kyo.retainAll(list2); //공통요소만 남기고 다 삭제
		
		cha.addAll(list1);
		cha.removeAll(list2);
		
		hap.addAll(list1);
		hap.addAll(list2);
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);

		
	}

}
