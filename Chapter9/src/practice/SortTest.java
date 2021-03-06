package practice;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("BubbleSort : B");
		System.out.println("QuickSort : Q");
		System.out.println("HeapSort : H");
		
		
		int ch = System.in.read();
		
		Sort sort = null;
		if(ch == 'B' || ch == 'b') {
			sort =  new BubbleSort();
		}
		else if(ch == 'Q' || ch == 'q') {
			sort =  new QuickSort();
		}
		else if(ch == 'H' || ch == 'h') {
			sort =  new HeapSort();
		}
		else {
			System.out.println("유효하지않은 정렬입니다.");
		}
		
		if (sort != null) {
		sort.ascending();
		sort.descending();
		sort.description();
		sort.showInfo();
		}
		
	}

}
