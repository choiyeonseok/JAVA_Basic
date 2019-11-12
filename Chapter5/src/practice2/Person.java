package practice2;

public class Person {

	private String name;
	private int money;
	private int coffeeCount = 0;
	
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;	
	}
	
	public void buyCoffee(Coffee coffee) {
		if (name == "������") { 
			coffee.buy(4000, name);
			money -= 4000;
		}
		else {
			coffee.buy(4500, name);
			money -= 4500;
		}
		
		coffeeCount += 1;
	}
	
	
	public void showInfo() {
		System.out.println(name + "���� �� " + coffeeCount + "���� ���̰� ���� �ܾ��� " + money + "�Դϴ�.");
	}
	
}
