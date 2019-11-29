package practicerqrq;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	static int count = 0;
	static int bonus;
	static int b_flag = 0;
	static int[] check = new int[6];
	
	public static void main(String[] args) {
		
		int[][] hong = {{1, 2, 3, 4, 5, 6}, {10, 15, 25, 35, 40, 42}, {1, 9, 11, 22, 23, 25}, {9, 28, 31, 34, 35, 36}, {1, 9, 23, 28, 33, 35}};
		int[] lotto = new int[7];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ζ� ��ȣ �Է� : " );
		for (int i = 0; i < lotto.length-1; i++) {
			lotto[i] = sc.nextInt();
		}
		System.out.print("���ʽ� ��ȣ �Է� : " );
		bonus = sc.nextInt(); 
		lotto[lotto.length-1] = bonus;
		
		
		for (int i = 0; i < hong.length; i++) {
			calculateOneSet(i, hong[i], lotto);
		}
		
	}

	
	
	public static void calculateOneSet(int set, int[] hongLotto, int[] answerLotto) {
		
		/** ��Ʈ���� ������ �ʱ�ȭ */
		initialize();
		
		/** �ζ� �Ѽ�Ʈ ���鼭 ���� ���� �Ǵ� �� check �迭�� ǥ�� */
		for (int i = 0; i < hongLotto.length; i++) {

			if (isContained(hongLotto[i], answerLotto)){
				count++;
				check[i] = 1;   // 1, 2, 35, 4, 5, 6    1 -> o => check = [1, 0, 1, 1, 0, 0] => 1 x 3 4 x x 
			} 
			
			/** 2���� �Ǻ��ϱ� ���� flag ���� */
			if (hongLotto[i] == bonus){
				b_flag = 1;
			}
		}
		
		/**
		 * 2�� �̸����� bonus ���� �� ��������
		 */
		coordinate(hongLotto);
		
		/**
		 * ��� ���
		 */
		System.out.print("<" + (++set) + ">ȸ�� : ");
		showResult(count, hongLotto);
		
		
	}
	
	public static void initialize() {
		/** check �迭 0���� �ʱ�ȭ �� count �� �ʱ�ȭ */
		Arrays.fill(check, 0);
		count = 0;
		b_flag = 0;
	}
	
	/**
	 * 2���� �ƴϰ� bonus������ ������ ��� count ���� ����
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
	 * Ư�� ���ڰ� ������ �ζ� ��ȣ �ȿ� ���ԵǾ������� true�� ��ȯ
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
	 * �ζ� ����� �������
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
				System.out.println("<5��>");
				break;
			case 4:
				System.out.println("<4��>");
				break;
			case 5:
				System.out.println("<3��>");
				break;
			case 6:
				if (b_flag == 1) {
					System.out.println("<2��>");
				}else {
					System.out.println("<1��>");
				}
				break;
			default:
				System.out.println("<��>");
			}
	}
	
	
	
}
