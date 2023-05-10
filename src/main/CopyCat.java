package main;

public class CopyCat implements Strategy{
    private Move opponentLastMove;

    public CopyCat(){
        opponentLastMove = Move.COOPERATE;
    }

    @Override
    public Move chooseMove(){
        return opponentLastMove;
    }

    @Override
    public void updateOpponentLastMove(Move opponentMove){
        opponentLastMove = opponentMove;
    }
}
