package baseballgame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaseballGame {

	/** ������ ���� �ʿ��� ������ �ڸ� ��  */
	private static final int DIGITS = 3;

	/** ������ ���, ������ �����ϱ� ���� ���  */
	private static final int EXIT = 2;

	/** ������ ���, ������ ������ϱ� ���� ���  */
	private static final int START = 1;

	/** strike�� ���� */
	private int strike;

	/** ball�� ���� */
	private int ball;

	/** ��ǻ�Ϳ� �÷��̾��� ��ü ���� */
	Computer com;
	Player player;

	/**
	 * BaseballGame Ŭ������ ������ �Դϴ�.
	 * ��ü ������ ��ǻ�Ϳ� �÷��̾��� ��ü�� ���ÿ� �����մϴ�.
	 */
	BaseballGame() {
		com = new Computer();
		player = new Player();
	}

	/**
	 * ��ü ���� ������ �����ϴ� �޼ҵ��Դϴ�.
	 * �� �ܰ迡���� �ʿ��� �޼ҵ���� ȣ���մϴ�.
	 */
	void play() {
		while (true) {
			com.createNumbers();
			do {
				player.createNumbers();
				calculateScore();
				showResult();
			} while (!checkAnswer());
			replayOrNot();
		}

	}

	/**
	 * strike�� ball�� ����� ���ÿ� ���ִ� �޼ҵ� �Դϴ�.
	 */
	private void calculateScore() {
		calcStrike();
		calcBall();
	}

	/**
	 * ��ǻ�Ͱ� ������ ���� �÷��̾ ������ ���� ���Ͽ� strike ������ ����մϴ�.
	 * ����� �ʿ��� ������ strike�� 0���� �ʱ�ȭ�� �� ��갪�� ���� �����մϴ�.
	 */
	private void calcStrike() {
		strike = 0;
		for (int i = 0; i < DIGITS; i++) {
			if (com.comNums[i] == player.playerNums[i]) {
				strike++;
			}
		}
	}
	
	/**
	 * ��ǻ�Ͱ� ������ ���� �÷��̾ ������ ���� ���Ͽ� ball ������ ����մϴ�.
	 * ����� �ʿ��� ������ ball�� 0���� �ʱ�ȭ�� �� ��갪�� ���� �����մϴ�.
	 */
	private void calcBall() {
		ball = 0;
		for (int i = 0; i < DIGITS; i++) {
			if ((com.comNums[i] != player.playerNums[i]) && checkContain(com.comNums, player.playerNums[i])) {
				ball++;
			}
		}
	}

	/**
	 * ball�� ������ ����ϱ� ���� ���� �޼ҵ� �Դϴ�.
	 * �迭�� Ư�� ��Ұ� ���ԵǾ��ִ��� ���θ� Ȯ���մϴ�.
	 * @param array
	 * @param value
	 * @return ���ԵǾ��ִٸ� true��, �׷��� �ʴٸ� false�� ��ȯ�մϴ�.
	 */
	private boolean checkContain(int[] array, int value) {
		for (int number : array) {
			if (number == value) {
				return true;
			}
		}
		return false;
	}

	/**
	 * �÷��̾��� �Է¿� ���� strike�� ball�� ����� ����� �ݴϴ�.
	 */
	private void showResult() {
		String result = "����";
		if (strike > 0 && ball > 0) {
			result = strike + " ��Ʈ����ũ " + ball + "��";
		} else if (strike > 0) {
			result = strike + " ��Ʈ����ũ";
		} else if (ball > 0) {
			result = ball + "��";
		}
		System.out.println(result);
	}

	
	/**
	 * ������ Ȯ���ϴ� �޼ҵ� �Դϴ�.
	 * strike ������ 3�̸� �������� �����ϰ� ���� �޽����� �Բ� ������ �����/���� ���θ� �����ϴ�. 
	 * @return ������ ��� true�� ��ȯ, �׷��� ������ false�� ��ȯ�մϴ�.
	 */
	private boolean checkAnswer() {
		if (strike == DIGITS) {
			System.out.println("3���� ���ڸ� ��� ���߼̽��ϴ�! ���� ����");
			System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���");
			return true;
		}
		return false;
	}

	/**
	 * �÷��̾�� 1 �Ǵ� 2�� �Է� �ް�, 2�� ��� ���α׷��� ����˴ϴ�.
	 * ���ڸ� �Է¹ްų�, 1 �Ǵ� 2�̿��� ���� �Է¹޾��� ���� ����ó���� �߻��Ͽ� �ٽ� �Է��� �޽��ϴ�.
	 * 1�� �Է����� ��� ���� ������ ������ �ٽ� ����ǰ� �˴ϴ�.
	 */
	private void replayOrNot() {
		Scanner input = new Scanner(System.in);
		int inputValue = 0;
		while (true) {
			try {
				inputValue = input.nextInt();
				createException(inputValue);
				break;
			} catch (InputMismatchException e) {
				checkAnswer();
				input = new Scanner(System.in);
			} catch (Exception e) {
			}
		}
		if (inputValue == EXIT) {
			System.exit(0);
		}
	}

	/**
	 * 1 �Ǵ� 2�̿��� ������ �Է����� �޾��� ��, ���Ƿ� ����ó���� �߻���Ű�� �޼ҵ� �Դϴ�.
	 * ���ܰ� �߻��ϸ� �Է��� �ٽ� �޽��ϴ�.
	 * @param inputValue
	 */
	private void createException(int inputValue) {
		if (inputValue != START && inputValue != EXIT) {
			throw new InputMismatchException();
		}
	}

}