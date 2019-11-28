package baseballgame;


public class BaseballGame {

	int strike;
	int ball;

	int[] comNums;
	int[] playerNums;
	
	BaseballGame(){
		Computer com = new Computer();
		Player player = new Player();
		
		comNums = com.createNumbers();
		playerNums = player.createNumbers();
	}
	
	
}
