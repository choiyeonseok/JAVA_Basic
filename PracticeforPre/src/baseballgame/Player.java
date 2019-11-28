package baseballgame;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Player {

	/** ������ ���� �ʿ��� ������ �ڸ� ��  */
	private static final int DIGITS = 3;

	/** �÷��̾ �Է��� ���� (�迭�� ����) */
	public int[] playerNums;

	/**
	 * �÷��̾� Ŭ������ ������ �Դϴ�.
	 * ��ü�� �����Ǹ鼭 �Է¹��� ���ڸ� ������ �迭�� �����մϴ�. 
	 */
	public Player() {
		playerNums = new int[DIGITS];
	}

	/**
	 * ����ڷκ��� �Է¹��� ���ڸ� �迭�� �����ϴ� �޼ҵ� �Դϴ�.
	 * �Է¹��� ���� '���ڸ� ��'����, '0�� �����ϰ� �ִ� ��', '�ߺ��Ǵ� ���� ���ԵǾ��ִ� ��' ���θ�
	 * �˻��ϰ� �ش������ ������ �� ���� �ް� �ִ� �迭�� playerNums�� �����մϴ�.
	 * ���ܻ��� ���ǿ� �ϳ��� �ش�Ǹ�, ���� ��� �ٽ� �Է¹޽��ϴ�.
	 */
	public void createNumbers() {
		int inputValue;
		int[] inputArray;
		do {
			inputValue = inputValue();
			inputArray = toIntArray(inputValue);
		} while (!isThreeDigits(inputValue) | hasZero(inputArray) | isDuplicated(inputArray));
		System.arraycopy(inputArray, 0, playerNums, 0, playerNums.length);
	}

	/**
	 * ����ڷκ��� ���������� �Է��� �޴� �޼ҵ� �Դϴ�.
	 * ���ڰ� �Է����� ������ ���, ����ó���� �߻��Ͽ� �ٽ� �Է��� �޽��ϴ�. 
	 * @return �Է¹��� ������ ��ȯ�մϴ�.
	 */
	private int inputValue() {
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		int inputValue;
		while (true) {
			try {
				inputValue = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.print("���ڸ� �Է����ּ��� : ");
				input = new Scanner(System.in);
			} catch (Exception e) {
			}
		}
		return inputValue;
	}

	/**
	 * �Է¹��� ������ �� �ڸ� �� ������ �迭�� �����ϴ� �޼ҵ� �Դϴ�.
	 * @param inputNum
	 * @return ������ �迭�� ��ȯ�մϴ�.
	 */
	private int[] toIntArray(int inputNum) {
		int[] tmpArray = new int[3];
		for (int i = 0; i < tmpArray.length; i++) {
			tmpArray[i] = (int) (inputNum / Math.pow(10, 2 - i));
			inputNum %= Math.pow(10, 2 - i);
		}
		return tmpArray;
	}

	/**
	 * �Է¹��� ������ ���ڸ� �� ���� Ȯ���մϴ�.
	 * @param inputNum
	 * @return �� �ڸ��� �̸� true��, �׷��� ������ false�� ��ȯ�մϴ�.
	 */
	private boolean isThreeDigits(int inputNum) {
		return (int) (Math.log10(inputNum) + 1) == DIGITS;
	}

	/**
	 * �Է¹��� ���� �迭�� 0�� ���ԵǾ��ִ��� Ȯ���մϴ�.
	 * @param inputNums
	 * @return 0�� ���ԵǾ� ������ true��, �׷��� ������ false�� ��ȯ�մϴ�.
	 */
	private boolean hasZero(int[] inputNums) {
		return IntStream.of(inputNums).anyMatch(i -> i == 0);
	}

	/**
	 * �Է¹��� ���� �迭�� �ߺ��Ǵ� ���� �ִ��� Ȯ���մϴ�.
	 * �迭 �� �� ���Ұ� �����ϴ� Ƚ���� ���� 2�̻��̸� �ߺ����� �����մϴ�. 
	 * @param inputNums
	 * @return �ߺ��� Ȯ�εǸ� true��, �׷��� ������ false�� ��ȯ�մϴ�.
	 */
	private boolean isDuplicated(int[] inputNums) {
		for (int number : inputNums) {
			if (countValue(inputNums, number) >= 2) {
				return true;
			}
		}
		return false;
	}

	/**
	 * �迭 �� Ư�� ���Ұ� �����ϴ� Ƚ���� ����մϴ�.
	 * @param inputNums
	 * @param target
	 * @return count
	 */
	private int countValue(int[] inputNums, int target) {
		int count = 0;
		for (int number : inputNums) {
			if (number == target) {
				count++;
			}
		}
		return count;
	}

}
