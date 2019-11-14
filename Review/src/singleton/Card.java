package singleton;

public class Card {

	private static int refNum = 10000;
	private int cardId;
	
	public Card() {
		refNum += 1;
		cardId = refNum;
	}
	
	public int getCardId() {
		return cardId;
	}
	
}
