package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

	private List<Lotto> lottoSet = new ArrayList<>();
	private long amount;
	private static final int LOTTO_PRICE = 1000;
	private static final int LOTTO_SIZE = 6;
	
	public void inputPurchaseAmount() {
		Scanner input = new Scanner(System.in);
		System.out.println("���� �ݾ��� �Է��� �ּ���");
		amount = input.nextLong();
	}
	
	public void makeLottoSet() {
		for (int i = 0; i < (int)amount/LOTTO_PRICE; i++) {
			lottoSet.add(pickLottoNumbers());
		}
		showLottoSet();
	}
	
	private Lotto pickLottoNumbers() {
		Scanner input = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < LOTTO_SIZE; i++) {
			numbers.add(input.nextInt());
		}
		return new Lotto(numbers);
	}
	
	public void showLottoSet() {
		System.out.println((int)amount/LOTTO_PRICE + "���� �����߽��ϴ�.");
		for (Lotto lotto : lottoSet) {
			lotto.showLottoNumber();
		}
	}
	
	
}
