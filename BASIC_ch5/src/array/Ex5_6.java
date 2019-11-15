package array;

public class Ex5_6 {

	public static void main(String args[]) {
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin = {5, 5, 5, 5};
		
		int money = 3510;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) {
			int cnt = money/coinUnit[i];
			if (coin[i] < cnt) {
				money -= coin[i]*coinUnit[i];
				System.out.println(coinUnit[i] + "원 짜리 동전 " + coin[i] + "개" );
				coin[i] = 0;
			}
			else {
				money %= coinUnit[i];
				coin[i] -= cnt;
				System.out.println(coinUnit[i] + "원 짜리 동전 " + cnt + "개" );
			}
		}
		
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
	
		System.out.println("=남은 동전의 갯수=");
		for(int i=0; i<coinUnit.length; i++) 
			System.out.println(coinUnit[i] + "원: " +coin[i]);
	}
	
	
}
