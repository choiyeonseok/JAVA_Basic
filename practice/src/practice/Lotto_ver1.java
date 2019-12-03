package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto_ver1 {
	
	static int count = 0;
	static int bonus;
	static int b_flag = 0;
	static int[] check = new int[6];
	
	public static void main(String[] args) {
		
		int[][] hong = {{1, 2, 3, 4, 5, 6}, {10, 15, 25, 35, 40, 42}, {1, 9, 11, 22, 23, 25}, {9, 28, 31, 34, 35, 36}, {1, 9, 23, 28, 33, 35}};
		int[] lotto = new int[7];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금주의 로또 번호 입력 : " );
		for (int i = 0; i < lotto.length-1; i++) {
			lotto[i] = sc.nextInt();
		}
		System.out.print("보너스 번호 입력 : " );
		bonus = sc.nextInt(); 
		lotto[lotto.length-1] = bonus;
		
		
		for (int i = 0; i < hong.length; i++) {
			calculateOneSet(i, hong[i], lotto);
		}
		
	}

	
	
	public static void calculateOneSet(int set, int[] hongLotto, int[] answerLotto) {
		
		/** 세트마다 변수값 초기화 */
		initialize();
		
		/** 로또 한세트 돌면서 포함 여부 판단 및 check 배열에 표시 */
		for (int i = 0; i < hongLotto.length; i++) {

			if (isContained(hongLotto[i], answerLotto)){
				count++;
				check[i] = 1;   // 1, 2, 35, 4, 5, 6    1 -> o => check = [1, 0, 1, 1, 0, 0] => 1 x 3 4 x x 
			} 
			
			/** 2등을 판별하기 위한 flag 변수 */
			if (hongLotto[i] == bonus){
				b_flag = 1;
			}
		}
		
		/**
		 * 2등 미만으로 bonus 있을 시 순위조정
		 */
		coordinate(hongLotto);
		
		/**
		 * 결과 출력
		 */
		System.out.print("<" + (++set) + ">회차 : ");
		showResult(count, hongLotto);
		
		
	}
	
	public static void initialize() {
		/** check 배열 0으로 초기화 및 count 값 초기화 */
		Arrays.fill(check, 0);
		count = 0;
		b_flag = 0;
	}
	
	/**
	 * 2등이 아니고 bonus점수를 보유한 경우 count 에서 빼기
	 * 
	 */
	public static void coordinate(int[] hongLotto) {
		for (int i = 0; i < check.length; i++) { 
			if (check[i] == 0 && b_flag == 1) {
				count -= 1;
			}
			
			if (hongLotto[i] == bonus) {
				check[i] = 0;
			}
		}
	}
	
	
	/**
	 * 특정 숫자가 금주의 로또 번호 안에 포함되어있으면 true값 반환
	 */
	public static boolean isContained(int number, int[] answer) {
		for (int i = 0; i < answer.length; i++) {
			if (number == answer[i]) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 로또 결과를 출력해줌
	 * @param count
	 * @param hongLotto
	 */
	public static void showResult(int count, int[] hongLotto) {
		
		for(int i : hongLotto) {
			System.out.print(i + " ");
		}
		System.out.print("=> ");
		
		
		for (int i = 0; i < hongLotto.length; i++) {
			if (check[i] == 1) {
				System.out.print(hongLotto[i] + " ");
			}else {
				System.out.print("x ");
			}
		}
		
		switch(count) {
			case 3:
				System.out.println("<5등>");
				break;
			case 4:
				System.out.println("<4등>");
				break;
			case 5:
				System.out.println("<3등>");
				break;
			case 6:
				if (b_flag == 1) {
					System.out.println("<2등>");
				}else {
					System.out.println("<1등>");
				}
				break;
			default:
				System.out.println("<꽝>");
			}
	}
	
	
	
}
