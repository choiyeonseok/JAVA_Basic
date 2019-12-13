package domain.card;

import java.util.Objects;

public class Card {
    private final Symbol symbol;

    private final Type type;

    public Card(Symbol symbol, Type type) {
        this.symbol = symbol;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return symbol == card.symbol &&
                type == card.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, type);
    }

    @Override
    public String toString() {
    	if (symbol.getScore() < 10 | symbol.equals(symbol.TEN)) {
    		return "" + symbol.getScore() + type.getKoreanWord();
    	}
    	return "" + symbol.name().charAt(0) + type.getKoreanWord();
    }
    
    public Symbol getSymbol() {
    	return symbol;
    }

    public int getCardScore() {
    	return symbol.getScore();
    }
    
}
