package baseballgame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * �������� ���ڸ��� ������ �Է¹ް� �迭�� �����Ѵ�. ���� ������ ���� playerNums�� ����� Ŭ����
 * 
 * @author smr60
 *
 */
public class Player {

	/** ������ ���� �ʿ��� ������ �ڸ� �� */
	private static final int DIGITS = 3;

	/** �÷��̾ �Է��� ���� */
	List<Integer> playerNums;


	/**
	 * ����ڷκ��� �Է¹��� ���ڸ� �迭�� �����ϴ� �޼ҵ� �Դϴ�. �Է¹��� ���� '���ڸ� ��'����, '0�� �����ϰ� �ִ� ��', '�ߺ��Ǵ� ����
	 * ���ԵǾ��ִ� ��' ���θ� �˻��ϰ� �ش������ ������ �� ���� �ް� �ִ� �迭�� playerNums�� �����մϴ�. ���ܻ��� ���ǿ� �ϳ���
	 * �ش�Ǹ�, ���� ��� �ٽ� �Է¹޽��ϴ�.
	 */
	public void createNumbers() {
		List<Integer> list = inputIntValue();
	
		while(!isThreeDigits(list) | isDuplicated(list) | hasZero(list)) {
			list = inputIntValue();
		}
		
		playerNums = new ArrayList<Integer>(list);
	}

	/**
	 * ����ڷκ��� ���������� �Է��� �޴� �޼ҵ� �Դϴ�. ���ڰ� �Է����� ������ ���, ����ó���� �߻��Ͽ� �ٽ� �Է��� �޽��ϴ�.
	 * 
	 * @return �Է¹��� ������ ���ڸ��� List�� �����Ͽ� ��ȯ�մϴ�.
	 */
	private List<Integer> inputIntValue() {
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int inputIntValue;
		List<Integer> list = new ArrayList<>();
		
		while (true) {
			try {
				inputIntValue = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.print("���ڸ� �Է����ּ��� : ");
				input = new Scanner(System.in);
			} catch (Exception e) {
			}
		}
		
		while (inputIntValue > 0) {
			list.add(0, inputIntValue % 10);
			inputIntValue /= 10;
		}
		return list;
	}


	/**
	 * �Է¹��� ������ ���ڸ� �� ���� Ȯ���մϴ�.
	 * 
	 * @param inputNum
	 * @return �� �ڸ��� �̸� true��, �׷��� ������ false�� ��ȯ�մϴ�.
	 */
	private boolean isThreeDigits(List<Integer> inputNum) {
		return inputNum.size() == DIGITS;
	}

	/**
	 * �Է¹��� ���� �迭�� 0�� ���ԵǾ��ִ��� Ȯ���մϴ�.
	 * 
	 * @param inputNums
	 * @return 0�� ���ԵǾ� ������ true��, �׷��� ������ false�� ��ȯ�մϴ�.
	 */
	private boolean hasZero(List<Integer> inputNum) {
		return inputNum.contains(0);
	}

	/**
	 * �Է¹��� ���� �迭�� �ߺ��Ǵ� ���� �ִ��� Ȯ���մϴ�. �迭 �� �� ���Ұ� �����ϴ� Ƚ���� ���� 2�̻��̸� �ߺ����� �����մϴ�.
	 * 
	 * @param inputNums
	 * @return �ߺ��� Ȯ�εǸ� true��, �׷��� ������ false�� ��ȯ�մϴ�.
	 */
	private boolean isDuplicated(List<Integer> inputNum) {
		Set<Integer> set = new HashSet<Integer>(inputNum);
		if (set.size() < inputNum.size()) {
			return true;
		}
		return false;
	}
}
