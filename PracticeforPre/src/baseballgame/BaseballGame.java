package baseballgame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaseballGame {
	
	int strike;
	int ball;
	
	Computer com;
	Player player;
	
	BaseballGame(){
		com = new Computer();
		player = new Player();	
	}
	
	void play() {
		while(true) {
			com.createNumbers();
			com.showInfo();
			boolean correct = false;
			do {
				player.createNumbers();
				calculateScore();
				showResult();
				correct = checkAnswer();
			} while(!correct);
			replayOrNot();
		}
		
	}
	
	void calculateScore() {
		calcStrike();
		calcBall();
	}
	
	void calcStrike() {
		strike = 0;
		for (int i = 0; i < 3; i++) {
			if (com.comNums[i] == player.playerNums[i]) {
				strike++;
			}
		}
	}
	
	void calcBall() {
		ball = 0;
		for (int i = 0; i < 3; i++) {
			if ((com.comNums[i] != player.playerNums[i]) &&
					checkContain(com.comNums, player.playerNums[i])) {
				ball++;
			}
		}
	}
	
	boolean checkContain(int[] array, int value) {
		for (int number : array) {
			if (number == value) {
				return true;
			}
		}
		return false;
	}
	
	void showResult() {
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
	
	boolean checkAnswer() {
		if (strike == 3) {
			System.out.println("3���� ���ڸ� ��� ���߼̽��ϴ�! ���� ����");
			System.out.println("������ ���� �����Ϸ��� 1, �����Ϸ��� 2�� �Է��ϼ���");
			return true;
		}
		return false;
	}
	
	void replayOrNot() {
		Scanner input = new Scanner(System.in);
		int inputValue = 0;
		
		try{
			inputValue = input.nextInt();
		} catch(InputMismatchException e){
			checkAnswer();
			input = new Scanner(System.in);
		} catch (Exception e) {	}
		
		if (inputValue == 2) {
			System.exit(0);
		}
	}
	
	
}