package baseballgame;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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
	private static final int MIN = 1;
	private static final int MAX = 9;

	/** ��ǻ�Ͱ� �������� ������ ���� �迭 */
	List<Integer> comNums = new ArrayList<>(); 


	/**
	 * ��ǻ�Ͱ� 1���� 9������ ���δٸ� ������ ���� �迭�� �����ϴ� �޼ҵ� �Դϴ�.
	 */
	void createNumbers() {
		while (comNums.size() < 3) {
			int rand = getRandNum();
			if (!comNums.contains(rand)) {
				comNums.add(rand);
			}
		}
	}

	/**
	 * ������ �����ϴ� �޼ҵ��Դϴ�.
	 * 
	 * @return 1~9������ ������ ������ ��ȯ�մϴ�.
	 */
	private int getRandNum() {
		return (int)ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
	}
}
