package test;

import main.Cheater;
import main.Move;
import main.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheaterTest {
    @Test
    public void expectCheatMoveOnWhenMoveIsCalled(){
        Player cheat = new Cheater();
        assertEquals(Move.CHEAT, cheat.makeMove());
    }
}