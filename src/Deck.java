import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class Deck {
    Stack<Card> cards;

    public Deck() {
        cards = new Stack<>();
        String[] suits = {"Spades","Clubs","Diamonds","Hearts"};
        for (Integer j = 1; j < 14; j++){
            for (String suit : suits) {
                Card card = new Card(j,suit);
                cards.push(card);
            }
        }
        Card joker = new Card(14,"Joker");
        cards.push(joker);
        cards.push(joker);
    }

    public Deck(Stack<Card> cards){
        this.cards = cards;
    }

    void shuffle() {
        Random rand = new Random();
        int randomVariable; 
        Card temp;
        for(int i = cards.size() - 1; i >= 1; i--)
        {
            // Finds a random number between 0 and the current location of array
            randomVariable = rand.nextInt(i+1);
            // Swaps the elements
            temp = cards.get(i);
            cards.set(i, cards.get(randomVariable));
            cards.set(randomVariable, temp);
        }
    }

    public Card getTopCard(){
        return cards.pop();
    }
}
