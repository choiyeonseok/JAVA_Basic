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
		System.out.println(customerName + "���� " + customerGrade + "��� �Դϴ�.");
		System.out.println("������ �ݾ��� " + r_price + "�� �̰� ���� �� ������ ���ʽ�����Ʈ�� " + bonusPoint + "�� �Դϴ�.");
	}
	
	public void showAgentInfo() {
		System.out.println("���� ������ " + agentID + "�Դϴ�.");
	}
	
}
