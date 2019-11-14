package cooperation;

public class Subway {

	public int money;
	public int passengerCount; 
	
	public Subway() {
		money = 0;
		passengerCount = 0;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount += 1;
	}

	public void showInfo() {
		System.out.println("ÇöÀç ÁöÇÏÃ¶ ½Â°´Àº " + passengerCount + "ÀÌ°í, ÃÑ ¼öÀÔÀº  " + money + "ÀÔ´Ï´Ù.");
	}
	
}
