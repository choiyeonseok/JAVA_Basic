package baseballgame;

import java.util.Arrays;

public class Computer {

	int[] comNums;
	
	Computer(){
		comNums = new int[3];
	}
	
	void createNumbers() {
		for (int i = 0; i < comNums.length; i++) {
			comNums[i] = getNotDuplicated();
		}
	}
	
	int getNotDuplicated() {
		int rand;
		do {
			rand = getExceptZero();
		} while (dupliCheck(comNums, rand));
		return rand;
	}
	
	int getRandNum() {
		return (int)(Math.random() * 10);
	}
	
	int getExceptZero() {
		int rand;
		do {
			rand = getRandNum();
		}while(rand == 0);
		
		return rand;
	}
	
	boolean dupliCheck(int[] comNums, int rand) {
		for (int number : comNums) {
			if (number == rand) {
				return true;
			}
		}
		return false;
	}
	
	void showInfo() {
		System.out.println(Arrays.toString(comNums));
	}
	
}
