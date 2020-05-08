package com.annapurna;

import java.util.*;

public class Dealer {
    //STATIC FIELDS //TODO getNumberOfPlayers
    public static final String name="Polly";


    //INSTANT FIELDS
    private List<Card> deck= Deck.newDeck();
    private int playerCount;

    //BUSINESS METHODS TODO HIT, STAND, DEAL
    public Boolean shuffleDeck(){
        boolean result=false;
        List<Card> checkDeck=List.copyOf(this.getDeck());
        Collections.shuffle(this.getDeck());
        if(!checkDeck.equals(this.deck)){
            result=true;
        }
        return result;
    }


    //ACCESSOR METHODS
    public List<Card> getDeck() {
        return deck;
    }




}
