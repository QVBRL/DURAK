package Durak.Game.Impl;

public class Card
{
    /**
     * Suit of the card
     * Represented by the enum Suit: CLUBS, SPADES, HEARTS, DIAMOND
     */
    public Suit suit;
    
    /**
     * Integer Value Representation of the Card
     * 2 = 2, 3=3, ..., Jack = 11, Queen = 12, King = 13, Ace = 14
     * (Game is played Ace high)
     */
    public Integer value;
}
