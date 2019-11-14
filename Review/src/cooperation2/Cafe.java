package cooperation2;

public class Cafe {

	public String name;
	public int money;
	public int customerCount;
	
	public Cafe(String name) {
		this.name = name;
		money = 0;
		customerCount = 0;
	}
	
	public void buy(int money) {
		this.money += money;
		customerCount += 1;
	}
	
	public void showInfo() {
		System.out.println(name + "�� �� �� ���� " + customerCount +"�̰� �� ������ " + money + "�Դϴ�.");
	}
}
