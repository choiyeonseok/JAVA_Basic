package cooperation2;

public class Person {

	private String name;
	private int money;
	private String coffee;
	private String cafeName;
	private int coffeeCount;
	
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
		coffeeCount = 0;
	}

	public void buyAmericano(Cafe cafe) {
		money -= CoffeeFare.americano;
		cafe.buy(CoffeeFare.americano);
		cafeName = cafe.name;
		coffee = "Americano";
		coffeeCount += 1;
		
	}

	public void buyLatte(Cafe cafe) {
		money -= CoffeeFare.latte;
		cafe.buy(CoffeeFare.latte);
		cafeName = cafe.name;
		coffee = "Latte";
		coffeeCount += 1;
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
		System.out.println(name +"�� ��ħ�� " + cafeName + "���� " + coffee + "��  ��԰� " + money +"�� ���ҽ��ϴ�.");
		System.out.println("�� " + coffeeCount + "���� ���̽��ϴ�.");
	}
	
	
}
