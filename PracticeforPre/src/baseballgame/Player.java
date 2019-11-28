package baseballgame;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Player {

	/** 게임을 위해 필요한 숫자의 자릿 수  */
	private static final int DIGITS = 3;

	/** 플레이어가 입력한 숫자 (배열로 저장) */
	public int[] playerNums;

	/**
	 * 플레이어 클래스의 생성자 입니다.
	 * 객체가 생성되면서 입력받을 숫자를 저장할 배열을 선언합니다. 
	 */
	public Player() {
		playerNums = new int[DIGITS];
	}

	/**
	 * 사용자로부터 입력받은 숫자를 배열로 저장하는 메소드 입니다.
	 * 입력받은 수가 '세자리 수'인지, '0을 포함하고 있는 지', '중복되는 수가 포함되어있는 지' 여부를
	 * 검사하고 해당사항이 없으면 세 수를 받고 있는 배열을 playerNums에 복사합니다.
	 * 예외사항 조건에 하나라도 해당되면, 수를 계속 다시 입력받습니다.
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
	 * 사용자로부터 실질적으로 입력을 받는 메소드 입니다.
	 * 문자가 입력으로 들어왔을 경우, 예외처리가 발생하여 다시 입력을 받습니다. 
	 * @return 입력받은 정수를 반환합니다.
	 */
	private int inputValue() {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int inputValue;
		while (true) {
			try {
				inputValue = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.print("숫자를 입력해주세요 : ");
				input = new Scanner(System.in);
			} catch (Exception e) {
			}
		}
		return inputValue;
	}

	/**
	 * 입력받은 정수를 한 자리 씩 정수형 배열에 저장하는 메소드 입니다.
	 * @param inputNum
	 * @return 정수형 배열을 반환합니다.
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
	 * 입력받은 정수가 세자리 수 인지 확인합니다.
	 * @param inputNum
	 * @return 세 자리수 이면 true를, 그렇지 않으면 false를 반환합니다.
	 */
	private boolean isThreeDigits(int inputNum) {
		return (int) (Math.log10(inputNum) + 1) == DIGITS;
	}

	/**
	 * 입력받은 정수 배열에 0이 포함되어있는지 확인합니다.
	 * @param inputNums
	 * @return 0이 포함되어 있으면 true를, 그렇지 않으면 false를 반환합니다.
	 */
	private boolean hasZero(int[] inputNums) {
		return IntStream.of(inputNums).anyMatch(i -> i == 0);
	}

	/**
	 * 입력받은 정수 배열에 중복되는 수가 있는지 확인합니다.
	 * 배열 내 각 원소가 등장하는 횟수를 세어 2이상이면 중복으로 간주합니다. 
	 * @param inputNums
	 * @return 중복이 확인되면 true를, 그렇지 않으면 false를 반환합니다.
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
	 * 배열 내 특정 원소가 등장하는 횟수를 계산합니다.
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
