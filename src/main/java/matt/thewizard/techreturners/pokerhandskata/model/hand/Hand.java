package matt.thewizard.techreturners.pokerhandskata.model.hand;

import matt.thewizard.techreturners.pokerhandskata.model.Card;

import java.util.*;

public abstract class Hand implements Comparable<Hand>{

    protected List<Card> cards = new ArrayList<>();

    public Hand(Collection<Card> cards) {
        this.cards.addAll(cards);
        Collections.sort(this.cards);
    }

    public abstract String getName();

    public abstract int getRank();


    public abstract int getValue();

    public abstract String getValueAsString();

    @Override
    public int compareTo(Hand hand) {

        int rankDiff = hand.getRank() - this.getRank();
        if(rankDiff != 0)
            return rankDiff;

        return hand.getValue() - this.getValue();
    }
}
