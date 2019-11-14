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
		System.out.println(customerName + "���� " + customerGrade + "��� �Դϴ�.");
		System.out.println("������ �ݾ��� " + r_price + "�� �̰� ���� �� ������ ���ʽ�����Ʈ�� " + bonusPoint + "�� �Դϴ�.");
		
	}
}
