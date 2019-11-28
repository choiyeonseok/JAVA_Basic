package baseballgame;


public class BaseballGame {

	int strike;
	int ball;
	
	BaseballGame(){
		Computer com = new Computer();
		Player player = new Player();
		com.createNumbers();
		player.createNumbers();
	}
	
	
	
}