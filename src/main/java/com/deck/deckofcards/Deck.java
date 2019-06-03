package com.deck.deckofcards;

import java.util.ArrayList;

public class Deck <T extends Card> {
	private ArrayList<T> cards;
	private int dealtCard = 0;

	public void setDeckOfCards(ArrayList<T> deckOfCards) {
		this.cards = deckOfCards;
	}

	public  void shuffle() {

	}

	public int reaminingCard() {
		return cards.size() - dealtCard;
	}

	public T[] dealHand(int number) {
		return null;
	}

	public T dealCard() {
		return null;
	}

}
