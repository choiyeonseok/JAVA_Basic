package cooperation;

public class Bus {

	public int money;
	public int passengerCount; 
	
	public Bus() {
		money = 0;
		passengerCount = 0;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount += 1;
	}

	public void showInfo() {
		System.out.println("���� ������ �°��� " + passengerCount + "�̰�, �� ������  " + money + "�Դϴ�.");
	}
	
}
