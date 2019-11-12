package inheritance;

public class VIPCustomer extends Customer{

	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		
		// super()  <= �ֵ� �ȳֵ� �����Ϸ����� �ڵ����� ���� Ŭ���� �����ڸ� ȣ���Ѵ�.
		// ����Ʈ �����ڰ� �����ؾ� ����
		// ���� ����Ʈ �����ڰ� ��� �Ǿ����� ������� ����������
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
