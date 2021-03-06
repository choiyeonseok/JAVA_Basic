package lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * 로또 한장을 의미하는 객체
 */
public class Lotto {
	private final List<Integer> numbers;
	
	public Lotto(List<Integer> numbers) {
		this.numbers = numbers; 
	}
	
	/*
	 * 로또 번호 출력
	 */
	public void showLottoNumber() {
		Collections.sort(numbers);
		System.out.println(Arrays.toString(numbers.toArray()));	
	}
	
	/*
	 * 로또 번호 접근자
	 */
	public List<Integer> getNumbers(){
		return numbers;
	}
}
