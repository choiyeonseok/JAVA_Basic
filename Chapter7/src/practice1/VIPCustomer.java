package practice1;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	
	public void showAgentInfo() {
		System.out.println(customerName + "���� ��� ������ ��ȣ�� " + agentID + "�Դϴ�.");
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}
