package baseballgame;


public class BaseballGame {
	
	Computer com;
	Player player;
	
	BaseballGame(){
		com = new Computer();
		player = new Player();
		
	}
	
	int calcStrike() {
		int strike = 0;
		for (int i = 0; i < 3; i++) {
			if (com.comNums[i] == player.playerNums[i]) {
				strike++;
			}
		}
		return strike;
	}
	
	int calcBall() {
		int ball = 0;
		for (int i = 0; i < 3; i++) {
			if ((com.comNums[i] != player.playerNums[i]) &&
					checkContain(com.comNums, player.playerNums[i])) {
				ball++;
			}
		}
		return ball;
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