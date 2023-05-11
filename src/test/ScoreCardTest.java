package test;

import main.ScoreCard;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCardTest {

    @Nested
    class TestDeclareWinner {
        @Test
        public void expectDrawWhenBothScoresEqual(){
            ScoreCard scoreCard = new ScoreCard(0,0);
            List<Integer> newScores = new ArrayList<>();
            newScores.add(2);
            newScores.add(2);

            scoreCard.updateScore(newScores);

            assertEquals(0, scoreCard.declareResults());
        }

        @Test
        public void expectPlayer1Winner(){
            ScoreCard scoreCard = new ScoreCard(0,0);
            List<Integer> newScores = new ArrayList<>();
            newScores.add(3);
            newScores.add(-1);

            scoreCard.updateScore(newScores);

            assertEquals(1, scoreCard.declareResults());
        }

        @Test
        public void expectPlayer2Winner(){
            ScoreCard scoreCard = new ScoreCard(0,0);
            List<Integer> newScores = new ArrayList<>();
            newScores.add(-1);
            newScores.add(3);

            scoreCard.updateScore(newScores);

            assertEquals(2, scoreCard.declareResults());
        }

        @Test
        public void expectDrawWhenBothCheat(){
            ScoreCard scoreCard = new ScoreCard(0,0);
            List<Integer> newScores = new ArrayList<>();
            newScores.add(0);
            newScores.add(0);

            scoreCard.updateScore(newScores);

            assertEquals(-1, scoreCard.declareResults());
        }
    }
}
