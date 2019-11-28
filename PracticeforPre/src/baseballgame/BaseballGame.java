package baseballgame;


public class BaseballGame {

	int strike;
	int ball;
	
	Computer com;
	Player player;
	
	BaseballGame(){
		com = new Computer();
		player = new Player();
		com.createNumbers();
		player.createNumbers();
	}
	
	int calcStrike() {
		strike = 0;
		for (int i = 0; i < 3; i++) {
			if (com.comNums[i] == player.playerNums[i]) {
				strike++;
			}
		}
		return strike;
	}
	
}