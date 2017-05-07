package com.spconger;

public class Card {
	/*this class defines a card. A card
	 * has a name, a suit (which comes from
	 * the enum and a value of 1 to 11.
	 * It could also have a path to the card
	 * picture, but that is for later.
	 * I have included two constructors
	 * an empty one and one that takes in
	 * all three values. I have also included
	 * gets and sets for all the fields.
	 * This allows for flexibility, in how
	 * the class is accessed and used.
	 */
	
	private Suits suit;
	private int cardNumber;
	
	//empty constructor
	public Card(){}
	//over loaded constructor
	public Card(Suits suit, int cardNumber){
		
		this.suit=suit;
		this.cardNumber=cardNumber;
	}
	//sets and gets
	
	public Suits getSuit() {
		return suit;
	}
	public void setSuit(Suits suit) {
		this.suit = suit;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int value) {
		this.cardNumber = value;
	}
	
}
