package com.spconger;

public abstract class Game implements IGame{
	/*
	 * This as an abstract class from which
	 * each card game type will inherits
	 * It also implements the interface
	 * IGame. Because this class is abstract
	 * it does not have to implement
	 * the interface methods, but all
	 * it's children do.
	 */
	
	//every game will have a deck
    protected Deck deck;
    //every game should have a description
    private String gameDescription;
    
    //sets and gets for the fields
	public Deck getDeck() {
		return deck;
	}
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	public String getGameDescription() {
		return gameDescription;
	}
	public void setGameDescription(String gameDescription) {
		this.gameDescription = gameDescription;
	}
	public String toString(){
		return "Put name of the game here";
	}
	
}
