package array;

import java.util.Scanner;

public class Ex5_13 {

	public static void main(String[] args) {
		
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
			
			for(int j=0; j<question.length; j++) {
				int idx = (int)(Math.random() * question.length);
				
				char temp = question[j];
				question[j] = question[idx];
				question[idx] = temp;

			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.", i+1, new String(question));
			String answer = scanner.nextLine();
			
			//trim으로 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if(words[i].equals(answer.trim()))
				System.out.println("맞았습니다.");
			else
				System.out.println("틀렸습니다.");
			
		}
		
	}
	
}
