package polymorphism;

public class GoldCustomer extends Customer {

	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.03;
		salesRatio = 0.05;
	}

	@Override
	public void buy(int price) {
		bonusPoint += price * bonusRatio;
		int r_price = price - (int)(price * salesRatio);
		System.out.println(customerName + "고객은 " + customerGrade + "등급 입니다.");
		System.out.println("지불한 금액은 " + r_price + "원 이고 현재 총 적립된 보너스포인트는 " + bonusPoint + "원 입니다.");
		
	}
}
