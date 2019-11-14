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
		System.out.println(customerName + "���� " + customerGrade + "��� �Դϴ�.");
		System.out.println("������ �ݾ��� " + price + "�� �̰� ���� �� ������ ���ʽ�����Ʈ�� " + bonusPoint + "�� �Դϴ�.");
	}
	
}
