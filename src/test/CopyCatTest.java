package test;

import main.CopyCat;
import main.Move;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyCatTest {

    @Nested
    class TestConstructor {
        @Test
        public void expectFirstMoveToBeCooperate(){
            CopyCat strategy = new CopyCat();
            assertEquals(strategy.chooseMove(), Move.COOPERATE);
        }
    }

}