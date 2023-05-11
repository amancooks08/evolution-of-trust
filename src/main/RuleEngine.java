package main;

import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {

    public List<Integer> checkInputs(Move user1, Move user2) {
        List<Integer> score = new ArrayList<>();
        if(user1 == Move.COOPERATE && user2 == Move.COOPERATE){
            score.add(2);
            score.add(2);
        }
        else if(user1 == Move.CHEAT && user2 == Move.CHEAT){
            score.add(0);
            score.add(0);
        }
        else if(user1 == Move.COOPERATE && user2 == Move.CHEAT)
        {
            score.add(-1);
            score.add(3);
        }
        else if(user1 == Move.CHEAT && user2 == Move.COOPERATE)
        {
            score.add(3);
            score.add(-1);
        }
        else
            return null;
        return score;
    }
}
