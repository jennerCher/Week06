package Week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//create Deck class with field cards

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	// Constructor populates new Deck with standard 52 cards.
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String suit : suits) {
            for (int i = 0; i < names.length; i++) {
                cards.add(new Card(values[i], names[i] + " of " + suit));
            }
        }
    }

    // Shuffle method
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Draw method
    public Card draw() {
        return cards.remove(0);
    }
}