package polymorphism;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.bonusPoint = 0;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public void buy(int price) {
		bonusPoint += price * bonusRatio;
		System.out.println(customerName + "고객은 " + customerGrade + "등급 입니다.");
		System.out.println("지불한 금액은 " + price + "원 이고 현재 총 적립된 보너스포인트는 " + bonusPoint + "원 입니다.");
	}
	
}
