package baseballgame;


public class Computer {

	int[] comNums;
	
	Computer(){
		comNums = new int[3];
	}
	
	int getRandNum() {
		return (int)(Math.random() * 10);
	}
	
	int getExceptZero() {
		int rand;
		do {
			rand = getRandNum();
		}while(rand == 0);
		
		return rand;
	}
	
	boolean dupliCheck(int[] comNums, int rand) {
		for (int number : comNums) {
			return number == rand;
		}
		return false;
	}
}
