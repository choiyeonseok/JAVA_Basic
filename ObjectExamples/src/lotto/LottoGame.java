package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
	private static final int LOTTO_SIZE = 6;
	private List<Integer> winningNumbers = new ArrayList<>();
	private int bonusNumber;
	
	public void inputWinningNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("당첨 번호를 입력해주세요");
		for (int i = 0; i < LOTTO_SIZE; i++) {
			winningNumbers.add(input.nextInt());
		}
		System.out.println("보너스 번호를 입력해 주세요");
		bonusNumber = input.nextInt();
	}
	
	
}
