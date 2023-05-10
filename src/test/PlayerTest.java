package test;

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
            assertDoesNotThrow(() -> new Player("A", ));
        }
    }

}