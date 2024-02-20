package Week06Project;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	//Create fields for hand (list of card): score (set to 0 in the constructor), name
	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	String playerName = "";
	Deck deck;
	Card card;

	public Player(String playerName) {
		this.playerName = playerName;
	}
	
	//Create Getters & Setters methods
	public String getPlayerName() {
		return playerName;
	}
	
	public void setPlayerName (String playerName) {
		this.playerName = playerName;
	}
	
	//Create 'describe' method (prints out info about the card)
	public void describe() {
		for (Card card : this.hand)
				card.describe();
	}
	
	//Create 'flip' method (removes and returns the top card of the Hand)
	public Card flip() {
		Card card = this.hand.remove(0);
		return card;
	}
	
	//Create 'draw' method (takes a Deck as an argument and calls the draw method on the deck,
	//...adding the returned Card to the hand field
	public Card draw(Deck deck) {
		Card topCard = deck.draw();
		hand.add(topCard);
		return topCard;
	}
	
	//Create 'incrementScore' method (adds 1 to the Player's score field)
	public void incrementScore() {
		score++;
	}
				
	}
