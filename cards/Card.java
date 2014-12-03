public class Card {
    private final Pip value;
    private final Suit suit;
    public Card(Pip p, Suit s) {
        value = p;
        suit = s;
    }
    public String toString() {
        return value + " of " + suit;
    }
}

