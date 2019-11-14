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
		System.out.println("현재 버스의 승객은 " + passengerCount + "이고, 총 수입은  " + money + "입니다.");
	}
	
}
