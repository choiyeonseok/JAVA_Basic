package domain.user;

import domain.card.Card;
import domain.card.Symbol;

import java.util.ArrayList;
import java.util.List;


public class Dealer {
    private final List<Card> cards = new ArrayList<>();

    public Dealer() {}

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getDealerScore(int BLACKJACK_SCORE, int ACE_SCORE_FACTOR) {
    	int score = 0;
    	boolean hasAce = false;
    	for (Card card : cards) {
    		score += card.getCardScore();
    		if (card.getSymbol().equals(Symbol.ACE)) {
    			hasAce = true;
    		}
    	}
    	if(hasAce && score < BLACKJACK_SCORE - ACE_SCORE_FACTOR) {
    		score += ACE_SCORE_FACTOR;
    	}
    	return score;
    }
    
    public void showCardInfo() {
    	System.out.print("���� ī�� : ");
    	for (Card card : cards) {
    		System.out.print(card.toString() + " ");
    	}
    }
}
