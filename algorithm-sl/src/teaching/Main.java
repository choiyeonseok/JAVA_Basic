package teaching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static boolean[] visited = new boolean[26];
	static List<String> wordList = new ArrayList<>();
	static int selectedCount = 0;
	static int maxCount = 0;
	static int N, K;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/input/input_1062.txt"));
		Scanner sc = new Scanner(System.in);
		
		N = Integer.parseInt(sc.next());
		K = Integer.parseInt(sc.next());
		
		for (int i = 0; i < N; i++) {
			wordList.add(sc.next());
		}
		
		visited[0] = true;
		visited['c' - 'a'] = true;
		visited['i' - 'a'] = true;
		visited['t' - 'a'] = true;
		visited['n' - 'a'] = true;
		selectedCount = 5;
		
		if (K < 5) {
			System.out.println(0);
			return;
		} else if (K >= 26) {
			System.out.println(N);
			return;
		} else if (K == 5) {
			System.out.println(currentCount());
			return;
		}
	
		for (int i = 0; i < 26; i++) {
			if (!visited[i]) {
				dfs((char)(i + 'a'));
			}
		}
		
		System.out.println(maxCount);
		
		
	}

	private static void dfs(char start) {
		int index = start - 'a';
		//1. �湮�ϱ�
		//2. üũ�� �ϱ�
		visited[start - 'a'] = true;
		selectedCount ++;
		
		//3. �����ߴ��� Ȯ���ϱ�
		if (selectedCount == K) {
			maxCount = Math.max(maxCount, currentCount());
		} else {
			//4. ���� �̵���� �湮�ϱ�
			for (int i = index + 1; i < 26; i++) {
				if (!visited[i]) {
					dfs((char)(i + 'a'));
				}
			}
		}
		//5. üũ�ƿ��ϱ�
		visited[start - 'a'] = false;
		selectedCount --;
	}
	
	private static int currentCount() {
		int cnt = 0;
		for (String word : wordList) {
			boolean flag = true;
			for (int i = 0; i < word.length(); i++) {
				if (!visited[word.charAt(i)-'a']) {
					flag = false; 
					break;
				}
			}
			if (flag) {
				cnt ++;
			}
		}
		return cnt;
	}
	
}
