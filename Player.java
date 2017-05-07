package com.spconger;

public class Player {
	/*
	 * This class represents a player
	 * it is certainly not complete
	 * The constructor takes in a generic
	 * Game class. Of course the Game
	 * class is abstract and so cannot be
	 * instantiated directly, but any
	 * child can substitute for a parent,
	 * though to get its full content
	 * you have to cast it back to its
	 * true type. 
	 */
	private Hand hand;
	private String name;
	private int points;
	private Game g;
	
	//constructor with abstract Class as parameter
	public Player(Game g){
		hand = new Hand();
		//check on the games type using
		//its toString function and 
		//initialize it as that type
		if(g.toString().equals("BlackJack")){
		this.g=new BlackJack();
		}
	}
	//sets and gets
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	//method to populate a hand
	public void setHand(int number){
		for(int i=0; i<number; i++){
		Card c = g.deal();
		hand.addCard(c);
		}
	}
	public Hand showHand(){
		return hand;
	}

}
