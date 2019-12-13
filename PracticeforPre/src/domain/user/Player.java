package domain.user;

import domain.card.Card;
import domain.card.Symbol;

import java.util.ArrayList;
import java.util.List;


public class Player {
    private final String name;
    private final double bettingMoney;
    private final List<Card> cards = new ArrayList<>();

    public Player(String name, double bettingMoney) {
        this.name = name;
        this.bettingMoney = bettingMoney;
    }

    public void addCard(Card card) {
        cards.add(card);
    }
    
    public String getName() {
    	return name;
    }
    
    public double getBettingMoney() {
    	return bettingMoney;
    }
    
    public int getPlayerScore(int BLACKJACK_SCORE, int ACE_SCORE_FACTOR) {
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
    	System.out.print(name + " Ä«µå : ");
    	for (Card card : cards) {
    		System.out.print(card.toString() + " ");
    	}
    }

}
