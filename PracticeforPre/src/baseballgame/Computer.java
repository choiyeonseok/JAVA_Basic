package baseballgame;

import java.util.ArrayList;
import java.util.List;

/**
 * 1���� 9���� ���� �ٸ� ������ �� ���� �����ϴ� Ŭ����
 * 
 * @author smr60
 *
 */
public class Computer {

	/** ������ ���� �ʿ��� ������ �ڸ� �� */
	private static final int DIGITS = 3;

	/** ���ӿ� ���Ǵ� ������ ���� 1 ~ 9 �� ����� ���� ��� */
	private static final int RANGE = 10;

	/** ��ǻ�Ͱ� �������� ������ ���� �迭 */
	List<Integer> comNums = new ArrayList<>(); 


	/**
	 * ��ǻ�Ͱ� 1���� 9������ ���δٸ� ������ ���� �迭�� �����ϴ� �޼ҵ� �Դϴ�.
	 */
	void createNumbers() {
		while (comNums.size() < 3) {
			comNums.add(getNotDuplicated());
		}
	}

	/**
	 * 1���� 9������ �ߺ����� ���� ���� ���� ������ ������ �����մϴ�.
	 * 
	 * @return �ߺ����� ���� 1~9������ ���� �ϳ��� ��ȯ�մϴ�.
	 */
	private int getNotDuplicated() {
		int rand = getExceptZero();
		while(comNums.contains(rand)) {
			rand = getExceptZero();
		}
		return rand;
	}

	/**
	 * ������ �����ϴ� �޼ҵ��Դϴ�.
	 * 
	 * @return 0~9������ ������ ������ ��ȯ�մϴ�.
	 */
	private int getRandNum() {
		return (int) (Math.random() * RANGE);
	}

	/**
	 * 0�� �ƴ� ������ ���� ������ ��� ������ �����մϴ�.
	 * 
	 * @return ���� ���� �� 0�� �ƴ� ������ ������ �̸� �ٷ� ��ȯ�մϴ�.
	 */
	private int getExceptZero() {
		int rand = 0;
		while (rand == 0) {
			rand = getRandNum();
		}
		return rand;
	}
}
