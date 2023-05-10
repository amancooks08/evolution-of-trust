package test;

import main.CopyCat;
import main.Move;
import main.Player;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Nested
    class TestConstructor {
        @Test
        public void expectPlayerToBeCreated(){
            assertDoesNotThrow(() -> new Player("A"));
        }

        @Test
        public void expectExceptionForEmptyName(){
            assertThrows(IllegalArgumentException.class, () -> new Player(""));
        }
    }

    @Nested
    class TestIncrementScore {
        @Test
        public void expectScoreToIncreaseAccordingToThePoints(){
            Player aman = new Player("A");
            Integer prevScore = aman.score;
            aman.incrementScore(4);
            assertEquals(aman.score, 4);
            assertNotEquals(aman.score, prevScore);
        }
    }

}