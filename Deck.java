package Week06Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	// Instantiate a list of Card
	List<Card> cards = new ArrayList<Card>();
	
	Deck () {
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] numbers = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	
		for (String suit : suits) {
			int value = 2;
			for (String numberName : numbers) {
				cards.add(new Card(numberName, suit, value));
				
				value++;
			}
		}
	}
	
//Methods: Getters & Setters
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

//Method: 'describe' method
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}
//Method: 'shuffle' method
	public void shuffle() {
		Collections.shuffle(this.cards);
	}

//Method: 'draw' method
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
}