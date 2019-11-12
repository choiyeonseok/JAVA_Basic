package polymorphism;

public class VIPCustomer extends Customer{

	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		
		// super()  <= 넣든 안넣든 컴파일러에서 자동으로 상위 클래스 생성자를 호출한다.
		// 디폴트 생성자가 존재해야 가능
		// 상위 디폴트 생성자가 명시 되어있지 않은경우 명시해줘야함
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;	
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}
