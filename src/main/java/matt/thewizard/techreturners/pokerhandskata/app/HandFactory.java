package matt.thewizard.techreturners.pokerhandskata.app;

import matt.thewizard.techreturners.pokerhandskata.model.Card;
import matt.thewizard.techreturners.pokerhandskata.model.Suit;
import matt.thewizard.techreturners.pokerhandskata.model.Value;
import matt.thewizard.techreturners.pokerhandskata.model.hand.Hand;
import matt.thewizard.techreturners.pokerhandskata.model.hand.HighCard;

import java.util.HashSet;
import java.util.Set;

public class HandFactory {

    public static Hand createHand(String input) {

        Set<Card> hand = new HashSet<>();
        String[] cards = input.split(" ");

        for (String card : cards) {
            int suitIndex = card.length()-1;
            Suit suit = stringToSuit(card.substring(suitIndex));
            Value value = stringToValue(card.substring(0,suitIndex));
            hand.add(new Card(value,suit));
        }
        return new HighCard(hand);
    }

    private static Suit stringToSuit(String string) {
        switch (string) {
            case "C":
                return Suit.CLUBS;
            case "D":
                return Suit.DIAMONDS;
            case "H":
                return Suit.HEARTS;
            case "S":
                return Suit.SPADES;
            default:
                throw new IllegalArgumentException("Invalid input Suit: " + string);
        }
    }

    private static Value stringToValue(String string) {
        switch (string) {
            case "2":
                return Value.TWO;
            case "3":
                return Value.THREE;
            case "4":
                return Value.FOUR;
            case "5":
                return Value.FIVE;
            case "6":
                return Value.SIX;
            case "7":
                return Value.SEVEN;
            case "8":
                return Value.EIGHT;
            case "9":
                return Value.NINE;
            case "10":
                return Value.TEN;
            case "J":
                return Value.JACK;
            case "Q":
                return Value.QUEEN;
            case "K":
                return Value.KING;
            case "A":
                return Value.ACE;
            default:
                throw new IllegalArgumentException("Invalid input value: "+string);
        }
    }
}
