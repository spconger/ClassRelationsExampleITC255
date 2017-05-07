package com.spconger;

import java.util.ArrayList;

public class Hand {
	/*
	 * a hand is an ArrayList of cards
	 * taken from a deck, 
	 * the number of cards depends
	 * on the game.
	 * There are methods to add
	 * and remove cards
	 * and a method to return the whole
	 * hand
	 */
	private ArrayList<Card> cards;
	
	//constructor
	public Hand(){
		cards= new ArrayList<Card>();
	}
	
	public void addCard(Card c){
		cards.add(c);
	}
	
	public void RemoveCard(Card c){
		cards.remove(c);
	}
	
	public ArrayList<Card> getHand(){
	    return cards;
	}

}
