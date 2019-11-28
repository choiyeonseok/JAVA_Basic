package baseballgame;

import java.util.Arrays;

public class Computer {

	/** ������ ���� �ʿ��� ������ �ڸ� ��  */
	private static final int DIGITS = 3;
	
	/** ���ӿ� ���Ǵ� ������ ���� 1 ~ 9 �� ����� ���� ���  */
	private static final int RANGE = 10;

	/** ��ǻ�Ͱ� �������� ������ ���� �迭  */
	int[] comNums;

	/**
	 * ��ǻ�� Ŭ������ �������Դϴ�.
	 * ��ü�� �����Ǹ鼭 �������� ������ ���ڸ� ������ �迭�� �����մϴ�. 
	 */
	Computer() {
		comNums = new int[DIGITS];
	}

	/**
	 * ��ǻ�Ͱ� 1���� 9������ ���δٸ� ������ ���� �迭�� �����ϴ� �޼ҵ� �Դϴ�.
	 */
	void createNumbers() {
		for (int i = 0; i < comNums.length; i++) {
			comNums[i] = getNotDuplicated();
		}
	}

	/**
	 * 1���� 9������ �ߺ����� ���� ���� ���� ������ ������ �����մϴ�.
	 * @return �ߺ����� ���� 1~9������ ���� �ϳ��� ��ȯ�մϴ�.
	 */
	private int getNotDuplicated() {
		int rand;
		do {
			rand = getExceptZero();
		} while (dupliCheck(comNums, rand));
		return rand;
	}

	/**
	 * ������ �����ϴ� �޼ҵ��Դϴ�.
	 * @return 0~9������ ������ ������ ��ȯ�մϴ�.
	 */
	private int getRandNum() {
		return (int) (Math.random() * RANGE);
	}

	/**
	 * 0�� �ƴ� ������ ���� ������ ��� ������ �����մϴ�.
	 * @return ���� ���� �� 0�� �ƴ� ������ ������ �̸� �ٷ� ��ȯ�մϴ�.
	 */
	private int getExceptZero() {
		int rand;
		do {
			rand = getRandNum();
		} while (rand == 0);
		return rand;
	}

	/**
	 * �ߺ��� Ȯ���ϴ� �޼ҵ� �Դϴ�.
	 * ������� ������ comNums�迭�� ������ �߰��� ������ ���Ͽ� �ߺ����θ� �����մϴ�.
	 * @param comNums
	 * @param rand
	 * @return �߰��� ������ ���� ���� comNums�� �����ϸ� true�� ��ȯ�մϴ�.
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
