package interfaceex;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("어떤 방식으로 정렬하시겠습니까?");
		System.out.println("힙정렬 : H");
		System.out.println("퀵정렬 : Q");
		System.out.println("버블정렬 : B");
		
	
		Sort sort = null;
		int ch = System.in.read();
		if (ch == 'H' || ch == 'h') 
			sort = new HeapSort();
		else if (ch == 'Q' || ch == 'q')
			sort = new QuickSort();
		else if (ch == 'B' || ch == 'b')
			sort = new BubbleSort();
		else
			System.out.println("지원하지 않는 정렬입니다.");
			
		if (sort != null) {
			sort.description();
			sort.ascending();
			sort.descending();
			sort.showInfo();
		}
		
		
	}

}
