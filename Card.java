package Week06Project;

public class Card {
	
	//Fields
	
	String name;  //e.g. "Two", "King", "Ace", etc...
	String suit;  //"Spades", "Hearts, etc...
	int value;  //will contain a value from 2-14 representing cards
	
	public Card(String name, String suit, int value) {
			this.name = name;
			this.suit = suit;
			this.value = value;
	}
	

	//Methods: Getters and Setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setSuit (String suit) {
		this.suit = suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	// Methods: "Describe" method
	
	public void describe() {
		System.out.println(this.name + " of " + this.suit + ": " + this.value);
	}
}
