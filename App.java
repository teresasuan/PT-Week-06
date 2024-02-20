package Week06Project;

public class App {

	public static void main(String[] args) {
		
		// Instantiate a Deck
		Deck deck = new Deck();
		System.out.println("--------------");
		System.out.println("Deck has been created!");
		System.out.println("--------------");
		
		//Instantiate Player 1
		Player player1 = new Player("Player 1");
				
		//Instantiate Player 2
		Player player2 = new Player("Player2");
		
		//Call the describe method on the newly instantiated deck
		deck.describe();
		
		//Call the shuffle method on the deck
		deck.shuffle();
		System.out.println("--------------");
		System.out.println("Shuffled Deck:");
		System.out.println("--------------");
		
		//Call the describe method on the newly shuffled deck
		deck.describe();
		
		//Iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated
		boolean toggle = true;
		
		for (int i=0; i<52; i++) {
			if (toggle) {
				player1.draw(deck);
				toggle = false;
			} else {
				player2.draw(deck);
				toggle = true;
			}
		}
		System.out.println("--------------");
		System.out.println("Each player drew 26 cards");
		System.out.println("--------------");

		System.out.println("Player 1's cards:");
		System.out.println("--------------");
		player1.describe();
		
		System.out.println("--------------");
		System.out.println("Player 2's cards: ");
		System.out.println("--------------");
		player2.describe();
		
		System.out.println("--------------");
		
		//Iterate 26 times and call the flip method for each player:
		for (int i=0; i<26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			//Compare the value of each card returned by the two player's flip methods.
			if (player1Card.value > player2Card.value) {
				//Call the incrementScore method on the player whose card has the higher value.
				player1.incrementScore();
				
				System.out.println("Player 1 won turn # " + (i+1));

			} else if (player2Card.value > player1Card.value) {
				//Call the incrementScore method on the player whose card has the higher value.
				player2.incrementScore();
				
				System.out.println("Player 2 won turn # " + (i+1));
				
			} else if (player1Card.value == player2Card.value) {
				System.out.println("Turn # " + (i+1) + " was a draw");
			}
		}
		//After the loop, compare the final score from each player.
		//Print the final score of each player and either "Player 1", "Player 2", or "Draw" depending on which score is
		//higher or if they are both the same.
			System.out.println("--------------");
			System.out.println("FINAL SCORE");
			System.out.println("Player 1's total score: " + player1.score);
			System.out.println("Player 2's total score: " + player2.score);
			
		if (player1.score > player2.score) {
			System.out.println("Player 1 wins the game!");
	
		} else if (player2.score > player1.score) {
			System.out.println("Player 2 wins the game!");
			
		} else if (player1.score == player2.score) {
			System.out.println("This game was a tie! - DRAW");
		}

		System.out.println("--------------");
	}
}