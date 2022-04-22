package matt.thewizard.techreturners.pokerhandskata.app;

import matt.thewizard.techreturners.pokerhandskata.model.hand.Hand;

public class PokerHands {

    private static final String outputMessage = "%s wins. - with %s: %s";


    public String calculateWinningHand(String black, String white){
        Hand blackHand = HandFactory.createHand(black);
        Hand whiteHand = HandFactory.createHand(white);

        String winner;
        Hand winningHand;
        if(blackHand.compareTo(whiteHand) < 0){
            winningHand = blackHand;
            winner = "Black";
        } else{
            winningHand = whiteHand;
            winner = "White";
        }


        return String.format(outputMessage, winner, winningHand.getName(), winningHand.getValueAsString());
    }

}
