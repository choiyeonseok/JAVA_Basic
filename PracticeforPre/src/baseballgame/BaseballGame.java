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

	
}