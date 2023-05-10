package test;

import main.EvolutionOfTrust;
import main.Move;
import main.Player;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class EvolutionOfTrustTest {
    @Nested
    class TestConstructor {
        @Test
        public void testConstructorExceptionForNegativeRounds() {
            assertThrows(IllegalArgumentException.class, () -> new EvolutionOfTrust("A", "B", -2));
        }

        @Test
        public void testConstructorForValidRounds() {
            assertDoesNotThrow(() -> new EvolutionOfTrust("A", "B", 5));
        }
    }

    @Nested
    class TestPlayGame {
        @Test
        public void testPlayGameForOneRound(){
            Player person1 = new Player("A");
            Player person2 = new Player("B");
        }
    }
}
