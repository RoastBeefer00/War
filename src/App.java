import java.util.ArrayList;
import java.util.Stack;

public class App {
    static Deck deck;
    static Deck playerOneDeck;
    static Deck playerTwoDeck;
    static Deck playerOneDiscard;
    static Deck playerTwoDiscard;
    
    private void addDiscardToDeck(Deck discard, Deck deck){
        for (Card card : discard.cards) {
            deck.cards.add(card);
            discard.cards.remove(card);    
        }
    }

    private void war(){

    }

    private void play(){
        Card playerOneCard = playerOneDeck.getTopCard();
        Card playerTwoCard = playerTwoDeck.getTopCard();

        if (playerOneCard.value == playerTwoCard.value) {
            war();
        }
        else if (playerOneCard.value > playerTwoCard.value){
            playerOneDiscard.cards.push(playerOneCard);
            playerOneDiscard.cards.push(playerTwoCard);
        }
        else {
            playerTwoDiscard.cards.push(playerOneCard);
            playerTwoDiscard.cards.push(playerTwoCard);
        }
    }


    public static void main(String[] args) throws Exception {
        // Initialize new deck of 54 cards
        Deck deck = new Deck();

        // Initialize deck and discard for two players
        Stack<Card> empty = new Stack<>();
        playerOneDeck = new Deck(empty);
        playerTwoDeck = new Deck(empty);
        playerOneDiscard = new Deck(empty);
        playerTwoDiscard = new Deck(empty);
        
        // Shuffle the deck of cards before dealing
        deck.shuffle();

        // Deal cards between each player
        // flip counter back and forth to mimic dealing cards between two decks
        int flip = 0;
        for (Card card : deck.cards) {
            switch (flip) {
                case 0:
                    playerOneDeck.cards.add(card);
                    flip++;
                    break;
                case 1:
                    playerTwoDeck.cards.add(card);
                    flip--;
                    break;
                default:
                    break;
            }
        }

        // Play
        
    }
}
