package test;

import main.CooperativePlayer;
import main.Move;
import main.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CooperativePlayerTest {
    @Test
    public void expectCooperateWHenMoveIsCalled(){
        Player coOperative = new CooperativePlayer();
        assertEquals(Move.COOPERATE, coOperative.makeMove());
    }
}