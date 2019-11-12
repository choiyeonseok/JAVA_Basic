package practice2;

public class Coffee {

	public String name; //별다방, 콩다방
	public int money = 0;
	public String customer;
	
	public Coffee(String name){
		this.name = name;
	}
	
	public void buy(int price, String customer) {
		this.money += price;
		this.customer = customer;
		
	}
	
	public void showInfo() {
		System.out.println(name + "의 최근 고객은 " + customer + "이고  수입은  총" + money + "입니다.");
	}
	
}
