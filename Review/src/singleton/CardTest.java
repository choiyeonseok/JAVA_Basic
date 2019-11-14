package singleton;

import java.util.ArrayList;

public class CardTest {

	public static void main(String[] args) {
		
		CardCompany cardCompany = CardCompany.getInstance();
		Card card = cardCompany.createCard();
		Card card2 = cardCompany.createCard();
		Card card3 = cardCompany.createCard();
		Card card4 = cardCompany.createCard();
	
		ArrayList<Card> cardList = new ArrayList<Card>();
		cardList.add(card);
		cardList.add(card2);
		cardList.add(card3);
		cardList.add(card4);
	
		for(Card c: cardList) {
			System.out.println(c.getCardId());
		}
	}

}
