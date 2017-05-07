package com.spconger;

import java.util.ArrayList;

public class BlackJack extends Game{
	/*
	 * This class extends Game, and 
	 * because Game implements
	 * the interface IGame, BlackJack must
	 * implement and give a body to those
	 * methods.
	 */

	private ArrayList<Card> myDeck;
	
	//constructor for initializing elements
	public BlackJack(){
		deck = new Deck();;
		deck.shuffleDeck();
		myDeck=deck.getDeck();
	}
	//methods from interface
	@Override
	public Card deal() {
		Card card = myDeck.get(0);
		myDeck.remove(card);
		return card;
	}

	@Override
	public void turn(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int turnResult() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//returns the name of the game
    @Override
    public String toString(){
    	return "BlackJack";
    }
    
}
