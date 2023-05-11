package test;

import main.Cheater;
import main.CooperativePlayer;
import main.Game;
import main.Player;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class GameTest {

    @Nested
    class TestResult {
        @Test
        public void shouldCheckForDrawWHenBothPlayerCooperate() {
            Player player1 = new CooperativePlayer();
            Player player2 = new CooperativePlayer();

            Game game = new Game(player1, player2, 1);

            assertEquals("Both Players Cooperated", game.Result());
        }

        @Test
        public void shouldCheckWhenOneCheatAndTwoCooperates(){
            Player player1 = new Cheater();
            Player player2 = new CooperativePlayer();

            Game game = new Game(player1, player2, 1);

            assertEquals("Player1 cheated, Player2 cooperated", game.Result());
        }

        @Test
        public void shouldCheckWhenOneCooperateAndTwoCheats(){
            Player player1 = new CooperativePlayer();
            Player player2 = new Cheater();

            Game game = new Game(player1, player2, 1);

            assertEquals("Player2 cheated, Player1 cooperated", game.Result());
        }

        @Test
        public void shouldCheckForDrawWHenBothPlayerCheat() {
            Player player1 = new Cheater();
            Player player2 = new Cheater();

            Game game = new Game(player1, player2, 1);

            assertEquals("Both Players Cheated", game.Result());
        }
    }
}
