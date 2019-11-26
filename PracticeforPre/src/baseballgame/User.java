package baseballgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class User {

	char[] userNums;
	
	public User() {
		userNums = new char[3];
	}
	
	void createNumbers() {
		
		char[] inputValue = inputFromUser();
		
		if (checkZero(inputValue)){
			createNumbers();
		}
		else if (!checkThree(inputValue)) {
			createNumbers();
		}
		else if (checkDup(inputValue)) {
			createNumbers();
		}
		else 
			userNums = inputValue;
	}
	
	char[] inputFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		char[] value = Integer.toString(scanner.nextInt()).toCharArray();
		return value;
	}
	
	boolean checkThree(char[] inputValue) {
		if (inputValue.length == 3) return true;
		return false;
	}

	boolean checkZero(char[] inputValue) {
		for (char a: inputValue) if (a == '0') return true;
		return false;
	}

	boolean checkDup(char[] inputValue) {
		if (inputValue[0] == inputValue[1] | 
				inputValue[1] == inputValue[2] | 
				inputValue[2] == inputValue[0])
			return true;
		return false;
	}
	
}
