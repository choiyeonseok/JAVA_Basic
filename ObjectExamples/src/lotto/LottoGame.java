package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGame {
	private static final int LOTTO_SIZE = 6;
	
	private Player player;
	private WinningCalculator winningCalculator;
	
	public void play() {
		player = new Player();
		player.purchaseLotto();
		
		winningCalculator = new WinningCalculator(inputWinningNumbers(), inputBonusNumber());
		winningCalculator.calculateScore(player);
		winningCalculator.showScoreMaps();
		winningCalculator.calculateRateOfReturn(player);
		
	}
	
	private List<Integer> inputWinningNumbers() {
		Scanner input = new Scanner(System.in);
		List<Integer> winningNumbers = new ArrayList<>();
		System.out.println("��÷ ��ȣ�� �Է����ּ���");
		for (int i = 0; i < LOTTO_SIZE; i++) {
			winningNumbers.add(input.nextInt());
		}
		return winningNumbers;
	}
	
	private int inputBonusNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("���ʽ� ��ȣ�� �Է��� �ּ���");
		return input.nextInt();
	}
	
	private void calcuateWinningScore() {
		winningCalculator.calculateScore(player);
	}
	
	
	
}