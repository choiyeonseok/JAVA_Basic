package baseballgame;

import java.util.List;
import java.util.Scanner;

public class BaseballGame {

	static int flags = 1;
	int strikes = 0;
	int balls = 0;
	
	Computer comp = new Computer();
	User user = new User();
	
	void play() {
		while (flags == 1) {
			initial_values();
			comp.createNumbers();
			while (strikes != 3) {
				user.createNumbers();
				initial_values();
				calcScores();
			}
		}
	}
	
	void initial_values() {
		strikes = 0;
		balls = 0;
	}
	
	void calcScores(){
		this.strikes = calcStrike(comp.comNums, user.userNums);
		this.balls = calcBall(comp.comNums, user.userNums);
		showInfo();
		if (this.strikes == 3)
			askProceed();
	}
	
	int calcStrike(List<Integer> comNums, char[] userNums) {
		int strike = 0;
		for (int i = 0; i < comNums.size(); i++) {
			if (comNums.get(i) == Character.digit(userNums[i], 10)) strike++;
		}
		return strike;
	}
			
	int calcBall(List<Integer> comNums, char[] userNums) {
		int ball = 0;
		for (int i = 0; i < comNums.size(); i++) {
			if (comNums.contains(Character.digit(userNums[i], 10)) && 
					comNums.get(i) != Character.digit(userNums[i], 10)) ball++;
		}
		return ball;
	}
	
	
	void askProceed() {
		System.out.println("3개의 숫자를 모두 맞히셨습니다.! 게임 종료");
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		flags = scanner.nextInt();
		if (flags == 2) System.exit(0);
	}
	
	void showInfo() {
		if (strikes > 0 && balls > 0)
			System.out.println(strikes + " 스트라이크  " + balls + " 볼");
		else if (strikes > 0)
			System.out.println(strikes + " 스트라이크");
		else if (balls > 0)
			System.out.println(balls + " 볼");
		else
			System.out.println("낫싱");
	}
	
	
}
