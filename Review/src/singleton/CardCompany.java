package singleton;

public class CardCompany {

	
	private static CardCompany instance = new CardCompany();  // ÷���� �ϳ� ����
	
	private CardCompany() {} // �ܺο��� ���� ���ϵ��� ������ hiding
	
	public static CardCompany getInstance() {
		
		if (instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	public Card createCard() {
		return new Card();
	}
	
	
}
