package interfaceex;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("� ������� �����Ͻðڽ��ϱ�?");
		System.out.println("������ : H");
		System.out.println("������ : Q");
		System.out.println("�������� : B");
		
	
		Sort sort = null;
		int ch = System.in.read();
		if (ch == 'H' || ch == 'h') 
			sort = new HeapSort();
		else if (ch == 'Q' || ch == 'q')
			sort = new QuickSort();
		else if (ch == 'B' || ch == 'b')
			sort = new BubbleSort();
		else
			System.out.println("�������� �ʴ� �����Դϴ�.");
			
		if (sort != null) {
			sort.description();
			sort.ascending();
			sort.descending();
			sort.showInfo();
		}
		
		
	}

}
