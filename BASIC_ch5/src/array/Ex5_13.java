package array;

import java.util.Scanner;

public class Ex5_13 {

	public static void main(String[] args) {
		
		String[] words = {"television", "computer", "mouse", "phone"};
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
			
			for(int j=0; j<question.length; j++) {
				int idx = (int)(Math.random() * question.length);
				
				char temp = question[j];
				question[j] = question[idx];
				question[idx] = temp;

			}
			
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.", i+1, new String(question));
			String answer = scanner.nextLine();
			
			//trim���� �¿� ������ ������ ��, equals�� word[i]�� ��
			if(words[i].equals(answer.trim()))
				System.out.println("�¾ҽ��ϴ�.");
			else
				System.out.println("Ʋ�Ƚ��ϴ�.");
			
		}
		
	}
	
}
