package baseballgame;

import java.util.Scanner;

public class Player {

	int[] playerNums;
	
	Player(){
		playerNums = new int[3];
	}
	
	int inputValue() {
		Scanner input = new Scanner(System.in);
		return input.nextInt(); 
	}
	
}
