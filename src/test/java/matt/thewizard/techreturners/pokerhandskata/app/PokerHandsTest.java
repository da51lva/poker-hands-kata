package matt.thewizard.techreturners.pokerhandskata.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokerHandsTest {

    PokerHands pk;

    @BeforeEach
    public void setUp() {
        pk = new PokerHands();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/high-card-win.csv", numLinesToSkip = 1)
    public void testHighCardWin(String black, String white, String winner, String winningCard) {
        String expectedOutput = String.format("%s wins. - with high card: %s", winner, winningCard);
        assertEquals(expectedOutput, pk.calculateWinningHand(black, white));
    }
}