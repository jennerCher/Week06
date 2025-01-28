package Week06;

//Create App class with main method

public class APP {

public static void main(String[] args) {
// instantiate Deck	and 2 players
	Deck deck = new Deck();
    Player player1 = new Player("Cheryl");
    Player player2 = new Player("John");
    
    //call the shuffle() method on the deck
    deck.shuffle();

    // Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
    for (int i = 0; i < 52; i++) {
        if (i % 2 == 0) {
            player1.draw(deck);
        } else {
            player2.draw(deck);
        }
    }
    
    //Using a traditional for loop, iterate 26 times and call the flip method for each player.

    for (int i = 0; i < 26; i++) {
        Card card1 = player1.flip();
        Card card2 = player2.flip();

        System.out.print(player1.getName() + " flips: ");
        card1.describe();
        System.out.print(player2.getName() + " flips: ");
        card2.describe();
        
        //Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.  Print a message to say which player received a point
        
        if (card1.getValue() > card2.getValue()) {
            player1.incrementScore();
            System.out.println(player1.getName() + " wins this round.\n");
        } else if (card1.getValue() < card2.getValue()) {
            player2.incrementScore();
            System.out.println(player2.getName() + " wins this round.\n");
        } else {
            System.out.println("It's a tie! No points awarded.\n");
        }
    }

    System.out.println("Final Scores:");
    System.out.println(player1.getName() + ": " + player1.getScore());
    System.out.println(player2.getName() + ": " + player2.getScore());

    if (player1.getScore() > player2.getScore()) {
        System.out.println(player1.getName() + " is the winner!");
    } else if (player1.getScore() < player2.getScore()) {
    	System.out.println(player2.getName() + " is the winner");
    }
}
}