package Week06;

import java.util.ArrayList;
import java.util.List;

//create Player Class with hand, score, and name fields

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	
	// Constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    // Describe method
    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    // Flip method removes and returns the top card of the hand
    public Card flip() {
        return hand.remove(0);
    }

    // Draw method takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    // Increment score method adds 1 to player's score
    public void incrementScore() {
        score++;
    }

    // Getters
    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}