package test;

import com.sun.tools.javac.util.Pair;
import main.Move;
import org.junit.jupiter.api.Test;
import main.RuleEngine;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RuleEngineTest {

    @Test
    public void user1AndUser2ShouldCooperate(){
        List<Integer> result = new RuleEngine().checkInputs(Move.COOPERATE, Move.COOPERATE);
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        assertEquals(expected,result);
    }

    @Test
    public void user1AndUser2ShouldCheat(){
        List<Integer> result = new RuleEngine().checkInputs(Move.CHEAT, Move.CHEAT);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(0);
        assertEquals(expected,result);
    }
    @Test
    public void user1ShouldCooperateAndUser2ShouldCheat(){
        List<Integer> result = new RuleEngine().checkInputs(Move.COOPERATE, Move.CHEAT);
        List<Integer> expected = new ArrayList<>();
        expected.add(-1);
        expected.add(3);
        assertEquals(expected,result);
    }
    @Test
    public void user1ShouldCheatAndUser2ShouldCooperate(){
        List<Integer> result = new RuleEngine().checkInputs(Move.CHEAT, Move.COOPERATE);
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(-1);
        assertEquals(expected,result);
    }
}
