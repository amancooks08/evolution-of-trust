package main;

import java.util.HashMap;
import java.util.Map;

public class Game { // naming
        private Player player1, player2;
        private ScoreCard scoreCard;
        private RuleEngine ruleEngine;
        private int rounds;


        private static Map<Integer, String> ResultMap= new HashMap<>();

        public Game(Player player1, Player player2, int rounds) {
            this.player1 = player1;
            this.player2 = player2;
            this.rounds = rounds;
            this.ruleEngine = new RuleEngine();

            ResultMap.put(-1, "Both Players Cheated");
            ResultMap.put(0, "Both Players Cooperated");
            ResultMap.put(1, "Player1 cheated, Player2 cooperated");
            ResultMap.put(2, "Player2 cheated, Player1 cooperated");
        }

        public String Result(){
            this.scoreCard = new ScoreCard(0,0);
            for(int round = 0; round < rounds; round++){
                Move player1Move = player1.makeMove();
                this.scoreCard.updateScore(ruleEngine.checkInputs(player1Move, player2.makeMove()));
            }
            return ResultMap.get(scoreCard.declareResults());
        }
}
