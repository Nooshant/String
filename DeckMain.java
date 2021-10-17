package com.thakur.design;

import java.util.Arrays;
import java.util.Collections;

// Suits of card 
enum Suits {
	CLUB, DIAMOND, HEART, SPADE;
}

//Ranks of Card
enum Ranks {
	ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
}


//
class Card {
	String suitName;
	String rankName;

	public Card(String suitName, String rankName) {
		this.suitName = suitName;
		this.rankName = rankName;
	}

	public String getSuitName() {
		return suitName;
	}

	public String getRandName() {
		return rankName;
	}

	@Override
	public String toString() {
		return "Card [" + suitName + "-> " + rankName + "]";
	}
}

class Deck {

	private Card[] cards;

	public Deck() {
		cards = new Card[52];
		int i = 0;
		for (Suits suit : Suits.values()) {
			for (Ranks rank : Ranks.values()) {
				cards[i++] = new Card(suit.name(), rank.name());
			}
		}
	}

	// Get the Card data structure and shuffle while doing that.
	public Card[] getCards() {
		Collections.shuffle(Arrays.asList(cards));
		return cards;
	}
}

public class DeckMain {

	public static void main(String[] args) {
		Deck deck = new Deck();
		for (Card card : deck.getCards()) {
			System.out.println(card);
		}
	}
}
