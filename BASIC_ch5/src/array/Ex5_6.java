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
				System.out.println(coinUnit[i] + "�� ¥�� ���� " + coin[i] + "��" );
				coin[i] = 0;
			}
			else {
				money %= coinUnit[i];
				coin[i] -= cnt;
				System.out.println(coinUnit[i] + "�� ¥�� ���� " + cnt + "��" );
			}
		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);
		}
	
		System.out.println("=���� ������ ����=");
		for(int i=0; i<coinUnit.length; i++) 
			System.out.println(coinUnit[i] + "��: " +coin[i]);
	}
	
	
}
