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
		System.out.println("��÷ ��ȣ�� �Է����ּ���");
		for (int i = 0; i < LOTTO_SIZE; i++) {
			winningNumbers.add(input.nextInt());
		}
		System.out.println("���ʽ� ��ȣ�� �Է��� �ּ���");
		bonusNumber = input.nextInt();
	}
	
	
}
