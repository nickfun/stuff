import java.util.Collections;
import java.util.ArrayList;

public class Deck {
    private final ArrayList<Card> deck = new ArrayList<>();
    public Deck() {
        for (Suit s : Suit.values()) {
            for (Pip v : Pip.values()) {
                deck.add( new Card(v,s) );
            }
        }
    }

    public Card deal() {
        Card top = deck.get(0);
        deck.remove(0);
        return top;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public String toString() {
        return deck.toString();
    }
}  

