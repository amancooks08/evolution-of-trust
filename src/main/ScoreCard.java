package main;

import java.util.List;

public class ScoreCard {
    private Integer player1;
    private Integer player2;

    public ScoreCard(Integer score1, Integer score2){
        this.player1 = score1;
        this.player2 = score2;
    }
    public void updateScore(List<Integer> newScores){
        this.player1 = newScores.get(0);
        this.player2 = newScores.get(1);
    }


    public int declareResults(){
        if (this.player1 == this. player2) {
            if(this.player1 == 0) return -1;
            return 0;
        }
        else if (this.player1 > this.player2) return 1;
        else return 2;
    }
}
