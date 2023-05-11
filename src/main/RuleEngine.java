package main;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {

    public List<Integer> checkInputs(Move user1, Move user2) {
        List<Integer> result = new ArrayList<>();
        if(user1 == Move.COOPERATE && user2 == Move.COOPERATE){
            result.add(2);
            result.add(2);
        }
        else if(user1 == Move.CHEAT && user2 == Move.CHEAT){
            result.add(0);
            result.add(0);
        }
        else if(user1 == Move.COOPERATE && user2 == Move.CHEAT)
        {
            result.add(-1);
            result.add(3);
        }
        else if(user1 == Move.CHEAT && user2 == Move.COOPERATE)
        {
            result.add(3);
            result.add(-1);
        }
        else
            return null;
        return result;
    }
}
