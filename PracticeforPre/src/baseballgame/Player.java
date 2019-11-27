package baseballgame;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Player {

	int[] playerNums;
	
	Player(){
		playerNums = new int[3];
	}
	
	void createNumbers() {
		int inputValue;
		int[] inputArray;
		
		do {
			inputValue = inputValue();
			inputArray = toIntArray(inputValue);
		}while(!isThreeDigits(inputValue) | hasZero(inputArray) | isDuplicated(inputArray));
		
		System.arraycopy(inputArray, 0, playerNums, 0, playerNums.length);
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
	
	boolean hasZero(int[] inputNums) {
		return IntStream.of(inputNums).anyMatch(i -> i == 0);
	}
	
	boolean isDuplicated(int[] inputNums) {
		for (int number : inputNums) {
			if (countValue(inputNums, number) >= 2) {
				return true;
			}
		}
		return false;
	}
	
	int countValue(int[] inputNums, int target) {
		int count = 0;
		for (int number : inputNums) {
			if (number == target) {
				count++;
			}
		}
		return count;
	}
	
}
