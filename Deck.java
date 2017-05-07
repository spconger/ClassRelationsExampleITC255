package com.spconger;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	/*
	 * A deck is essentially an ArrayList
	 * of cards with a method to populate
	 * the array with the usual 52
	 * card deck, a method to shuffle
	 * the deck, and a method that returns
	 * a copy of the deck
	 */
private ArrayList<Card> deck;

//constructor initializes the deck
public Deck(){
	deck=new ArrayList<Card>();
	populateDeck();
}

//populates the deck. The suit
//uses the enum Suits
private void populateDeck(){
	for(Suits suit : Suits.values()){
		
		for(int i = 1;i<=13;i++){
			Card card = new Card();
			card.setSuit(suit);
			card.setCardNumber(i);
			deck.add(card);
		}
	}
}

//shuffles the deck
public void shuffleDeck(){
	Collections.shuffle(deck);
}

//returns a copy of the deck
public ArrayList<Card> getDeck(){
	return deck;
}




} 

