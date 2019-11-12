package practice3;

public class CardCompany {

	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {} //외부에서 생성 못하도록 hiding
	
	public static CardCompany getInstance() {
		
		if ( instance == null ) {
			instance = new CardCompany();
		}
		return instance;
		
	}

	public Card createCard() {
		return new Card();
	}
	
}
