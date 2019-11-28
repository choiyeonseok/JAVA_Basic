package baseballgame;

import java.util.Arrays;

public class Computer {

	private static final int DIGITS = 3;
	
	private static final int RANGE = 10;

	
	int[] comNums;

	Computer() {
		comNums = new int[DIGITS];
	}

	void createNumbers() {
		for (int i = 0; i < comNums.length; i++) {
			comNums[i] = getNotDuplicated();
		}
	}

	private int getNotDuplicated() {
		int rand;
		do {
			rand = getExceptZero();
		} while (dupliCheck(comNums, rand));
		return rand;
	}

	private int getRandNum() {
		return (int) (Math.random() * RANGE);
	}

	private int getExceptZero() {
		int rand;
		do {
			rand = getRandNum();
		} while (rand == 0);

		return rand;
	}

	private boolean dupliCheck(int[] comNums, int rand) {
		for (int number : comNums) {
			if (number == rand) {
				return true;
			}
		}
		return false;
	}

	private void showInfo() {
		System.out.println(Arrays.toString(comNums));
	}

}
