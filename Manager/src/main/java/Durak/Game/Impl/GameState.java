package Durak.Game.Impl;

import java.util.List;

import Durak.Player.impl.Player;
import lombok.Builder;


@Builder
public class GameState {
 
    public List<Player> players;

    public Deck deck;
    
    public Suit trumpSuit;

}
