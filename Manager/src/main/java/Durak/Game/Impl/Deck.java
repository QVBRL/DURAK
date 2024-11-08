package Durak.Game.Impl;

import java.util.List;

public class Deck {

    /**
     * A standard 52 card playing Deck,
     * All cards 2 -> Ace included
     */
    public List<Card> deck;
    
    /**
     * The Card that determines the trump suit,
     * Sits face up next to the deck, and is drawn only
     * when there are no more cards left in the deck to draw
     */
    public Card trumpCard;
}
