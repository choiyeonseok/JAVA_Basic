package cooperation;

public class Student {

	private String name;
	private int money;
	
	
	public Student(String name, int money) {
		this.setName(name);
		this.setMoney(money);
	}

	public void takeBus(Bus bus) {
		bus.take(Fares.busFare);
		money -= Fares.busFare;
		bus.showInfo();
	}
	
	public void takeSubway(Subway subway) {
		subway.take(Fares.subwayFare);
		money -= Fares.subwayFare;
		subway.showInfo();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void showInfo() {
		System.out.println(name + "의 현재 잔액은 " + money + "입니다.");
	}
	
	
}
