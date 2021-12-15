import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();
        ArrayList<Card> empty = new ArrayList<>();
        Deck playerOneDeck = new Deck(empty);
        Deck playerTwoDeck = new Deck(empty);
        ArrayList<Card> playerOneDiscard = new ArrayList<>();
        ArrayList<Card> playerTwoDiscard = new ArrayList<>();
        deck.shuffle();
        for (Card card : deck.cards) {
            System.out.println(card.name + " of " + card.suit);
        }
        
    }
}
