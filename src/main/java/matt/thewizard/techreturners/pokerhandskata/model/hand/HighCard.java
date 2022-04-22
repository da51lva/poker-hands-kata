package matt.thewizard.techreturners.pokerhandskata.model.hand;

import matt.thewizard.techreturners.pokerhandskata.model.Card;

import java.util.Collection;

public class HighCard extends Hand{

    public HighCard(Collection<Card> cards) {
        super(cards);
    }

    @Override
    public String getName() {
        return "high card";
    }

    @Override
    public int getRank() {
        return 0;
    }


    @Override
    public int getValue() {
        return cards.get(0).getValue().getValue();
    }

    @Override
    public String getValueAsString(){
        return cards.get(0).getValue().asString();
    }


}
