package matt.thewizard.techreturners.pokerhandskata.model;

public record Card(Value value,
                   Suit suit) implements Comparable<Card> {

    public Value getValue() {
        return value;
    }

    @Override
    public int compareTo(Card c) {
        return c.value.getValue() - this.value.getValue();
    }
}
