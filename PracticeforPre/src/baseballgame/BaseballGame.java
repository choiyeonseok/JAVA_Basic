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
	

	
}