package lambda;

import java.util.Random;

public class Ex14_6 {

	public static void main(String[] args) {
		
		//임의의 로또번호(1~45) 정렬해서 출력
		
		new Random().ints(1, 46)  // 1~45사이의 정수
					.distinct()   // 중복제거
					.limit(6)     // 6개만
					.sorted()     // 정렬
					.forEach(System.out::println);
		
	}

}
