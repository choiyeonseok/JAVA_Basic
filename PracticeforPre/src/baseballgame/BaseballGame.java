package baseballgame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaseballGame {

	private static final int DIGITS = 3;

	private static final int EXIT = 2;

	private static final int START = 1;

	private int strike;

	private int ball;

	Computer com;
	Player player;

	BaseballGame() {
		com = new Computer();
		player = new Player();
	}

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

	private void calculateScore() {
		calcStrike();
		calcBall();
	}

	private void calcStrike() {
		strike = 0;
		for (int i = 0; i < DIGITS; i++) {
			if (com.comNums[i] == player.playerNums[i]) {
				strike++;
			}
		}
	}

	private void calcBall() {
		ball = 0;
		for (int i = 0; i < DIGITS; i++) {
			if ((com.comNums[i] != player.playerNums[i]) && checkContain(com.comNums, player.playerNums[i])) {
				ball++;
			}
		}
	}

	private boolean checkContain(int[] array, int value) {
		for (int number : array) {
			if (number == value) {
				return true;
			}
		}
		return false;
	}

	private void showResult() {
		String result = "낫싱";
		if (strike > 0 && ball > 0) {
			result = strike + " 스트라이크 " + ball + "볼";
		} else if (strike > 0) {
			result = strike + " 스트라이크";
		} else if (ball > 0) {
			result = ball + "볼";
		}
		System.out.println(result);
	}

	private boolean checkAnswer() {
		if (strike == DIGITS) {
			System.out.println("3개의 숫자를 모두 맞추셨습니다! 게임 종료");
			System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
			return true;
		}
		return false;
	}

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

	private void createException(int inputValue) {
		if (inputValue != START && inputValue != EXIT) {
			throw new InputMismatchException();
		}
	}

}