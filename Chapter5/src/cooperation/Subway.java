package cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;	
	}
	
	public void take(int money) { // 승차 메서드
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "번  지하철의 승객은 " + passengerCount + "명이고  수입은" + money + "원 입니다.");
	}
	
}
