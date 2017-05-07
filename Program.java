package com.spconger;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		BlackJack bj = new BlackJack();
		Player p1 = new Player(bj);
		p1.setName("Player One");
		p1.setHand(2);
		Hand h = p1.showHand();
		ArrayList<Card> cards =h.getHand();
		System.out.println(p1.getName());
		for(Card c : cards)
		{
			
			System.out.println(c.getSuit() + ": " + c.getCardNumber());
		}
		
		Player p2 = new Player(bj);
		p2.setName("Player Two");
		p2.setHand(2);
		Hand h2 = p2.showHand();
		ArrayList<Card> cards2 =h2.getHand();
		System.out.println(p2.getName());
		for(Card c2 : cards2)
		{
			System.out.println(c2.getSuit() + ": " + c2.getCardNumber());
		}
	
		
		/*
		ArrayList<Card> cards = d.getDeck();
		for(Card c: cards){
			System.out.println(c.getSuit() + ": " + c.getValue());
		}
		
		System.out.println();;
		d.SortDeck();
		ArrayList<Card> shuffled = d.getDeck();
		for(Card c: shuffled){
			System.out.println(c.getSuit() + ": " + c.getValue());
		}
		*/
		
		
		
	}

}
