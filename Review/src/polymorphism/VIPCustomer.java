package polymorphism;

public class VIPCustomer extends Customer{

	double salesRatio;
	String agentID;
	
	public VIPCustomer(int customerID, String customerName, String agentID) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.1;
		salesRatio = 0.1;
		this.agentID = agentID;
	}

	@Override
	public void buy(int price) {
		bonusPoint += price * bonusRatio;
		int r_price = price - (int)(price * salesRatio);
		System.out.println(customerName + "고객은 " + customerGrade + "등급 입니다.");
		System.out.println("지불한 금액은 " + r_price + "원 이고 현재 총 적립된 보너스포인트는 " + bonusPoint + "원 입니다.");
	}
	
	public void showAgentInfo() {
		System.out.println("전문 상담원은 " + agentID + "입니다.");
	}
	
}
