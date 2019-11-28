package baseballgame;

import java.util.Arrays;

public class Computer {

	/** 게임을 위해 필요한 숫자의 자릿 수  */
	private static final int DIGITS = 3;
	
	/** 게임에 사용되는 숫자의 범위 1 ~ 9 를 만들기 위한 상수  */
	private static final int RANGE = 10;

	/** 컴퓨터가 랜덤으로 지정한 숫자 배열  */
	int[] comNums;

	/**
	 * 컴퓨터 클래스의 생성자입니다.
	 * 객체가 생성되면서 랜덤으로 생성한 숫자를 저장할 배열을 선언합니다. 
	 */
	Computer() {
		comNums = new int[DIGITS];
	}

	/**
	 * 컴퓨터가 1에서 9까지의 서로다른 임의의 수를 배열에 저장하는 메소드 입니다.
	 */
	void createNumbers() {
		for (int i = 0; i < comNums.length; i++) {
			comNums[i] = getNotDuplicated();
		}
	}

	/**
	 * 1에서 9까지의 중복되지 않은 수가 나올 때까지 난수를 생성합니다.
	 * @return 중복되지 않은 1~9까지의 난수 하나를 반환합니다.
	 */
	private int getNotDuplicated() {
		int rand;
		do {
			rand = getExceptZero();
		} while (dupliCheck(comNums, rand));
		return rand;
	}

	/**
	 * 난수를 생성하는 메소드입니다.
	 * @return 0~9까지의 임의의 정수를 반환합니다.
	 */
	private int getRandNum() {
		return (int) (Math.random() * RANGE);
	}

	/**
	 * 0이 아닌 난수가 나올 때까지 계속 난수를 생성합니다.
	 * @return 난수 생성 중 0이 아닌 난수가 나오면 이를 바로 반환합니다.
	 */
	private int getExceptZero() {
		int rand;
		do {
			rand = getRandNum();
		} while (rand == 0);
		return rand;
	}

	/**
	 * 중복을 확인하는 메소드 입니다.
	 * 현재까지 생성된 comNums배열과 앞으로 추가될 난수를 비교하여 중복여부를 결정합니다.
	 * @param comNums
	 * @param rand
	 * @return 추가될 난수와 같은 수가 comNums에 존재하면 true를 반환합니다.
	 */
	private boolean dupliCheck(int[] comNums, int rand) {
		for (int number : comNums) {
			if (number == rand) {
				return true;
			}
		}
		return false;
	}
}
