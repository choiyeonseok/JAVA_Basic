package singleton;

public class CardCompany {

	
	private static CardCompany instance = new CardCompany();  // 첨부터 하나 생성
	
	private CardCompany() {} // 외부에서 생성 못하도록 생성자 hiding
	
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
