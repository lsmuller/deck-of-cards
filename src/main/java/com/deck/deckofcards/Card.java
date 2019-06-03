package com.deck.deckofcards;

public abstract class Card {
	private boolean isAvailable = true;

	// numbers 2 - 10, 11 for Jack, 12 for Queen, 13 for King, 1 for Ace
	protected int faceValue;
	protected Suit suit;

	public Card(int faceValue, Suit suit) {
		this.faceValue = faceValue;
		this.suit = suit;
	}

	public abstract int value();

	public boolean isAvailable() {
		return isAvailable;
	}
	public void markAvailable() {
		isAvailable = true;
	}
	public void markUnavailable() {
		isAvailable = false;
	}

}
