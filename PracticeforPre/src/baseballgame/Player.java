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
	
	int[] toIntArray(int inputNum) {
		int[] tmpArray = new int[3];
		for (int i = 0; i < tmpArray.length; i++) {
			tmpArray[i] = (int) (inputNum / Math.pow(10, 2-i));
			inputNum %= Math.pow(10, 2-i);
		}
		return tmpArray;
	}
	
	boolean isThreeDigits(int inputNum) {
		return (int)(Math.log10(inputNum) + 1) == 3;
	}
	
	
}
