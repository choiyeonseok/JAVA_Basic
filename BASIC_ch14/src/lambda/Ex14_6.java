package lambda;

import java.util.Random;

public class Ex14_6 {

	public static void main(String[] args) {
		
		//������ �ζǹ�ȣ(1~45) �����ؼ� ���
		
		new Random().ints(1, 46)  // 1~45������ ����
					.distinct()   // �ߺ�����
					.limit(6)     // 6����
					.sorted()     // ����
					.forEach(System.out::println);
		
	}

}
