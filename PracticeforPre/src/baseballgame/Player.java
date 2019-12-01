package baseballgame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * 유저에게 세자리수 정수를 입력받고 배열에 저장한다. 게임 진행을 위해 playerNums을 만드는 클래스
 * 
 * @author smr60
 *
 */
public class Player {

	/** 게임을 위해 필요한 숫자의 자릿 수 */
	private static final int DIGITS = 3;

	/** 플레이어가 입력한 숫자 */
	List<Integer> playerNums;


	/**
	 * 사용자로부터 입력받은 숫자를 배열로 저장하는 메소드 입니다. 입력받은 수가 '세자리 수'인지, '0을 포함하고 있는 지', '중복되는 수가
	 * 포함되어있는 지' 여부를 검사하고 해당사항이 없으면 세 수를 받고 있는 배열을 playerNums에 복사합니다. 예외사항 조건에 하나라도
	 * 해당되면, 수를 계속 다시 입력받습니다.
	 */
	public void createNumbers() {
		List<Integer> list = inputIntValue();
	
		while(!isThreeDigits(list) | isDuplicated(list) | hasZero(list)) {
			list = inputIntValue();
		}
		
		playerNums = new ArrayList<Integer>(list);
	}

	/**
	 * 사용자로부터 실질적으로 입력을 받는 메소드 입니다. 문자가 입력으로 들어왔을 경우, 예외처리가 발생하여 다시 입력을 받습니다.
	 * 
	 * @return 입력받은 정수를 한자리씩 List에 저장하여 반환합니다.
	 */
	private List<Integer> inputIntValue() {
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int inputIntValue;
		List<Integer> list = new ArrayList<>();
		
		while (true) {
			try {
				inputIntValue = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.print("숫자를 입력해주세요 : ");
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
	 * 입력받은 정수가 세자리 수 인지 확인합니다.
	 * 
	 * @param inputNum
	 * @return 세 자리수 이면 true를, 그렇지 않으면 false를 반환합니다.
	 */
	private boolean isThreeDigits(List<Integer> inputNum) {
		return inputNum.size() == 3;
	}

	/**
	 * 입력받은 정수 배열에 0이 포함되어있는지 확인합니다.
	 * 
	 * @param inputNums
	 * @return 0이 포함되어 있으면 true를, 그렇지 않으면 false를 반환합니다.
	 */
	private boolean hasZero(List<Integer> inputNum) {
		return inputNum.contains(0);
	}

	/**
	 * 입력받은 정수 배열에 중복되는 수가 있는지 확인합니다. 배열 내 각 원소가 등장하는 횟수를 세어 2이상이면 중복으로 간주합니다.
	 * 
	 * @param inputNums
	 * @return 중복이 확인되면 true를, 그렇지 않으면 false를 반환합니다.
	 */
	private boolean isDuplicated(List<Integer> inputNum) {
		Set<Integer> set = new HashSet<Integer>(inputNum);
		if (set.size() < inputNum.size()) {
			return true;
		}
		return false;
	}
}
