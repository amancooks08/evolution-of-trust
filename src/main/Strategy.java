package main;

public interface Strategy {
    public Move chooseMove();

    public void updateOpponentLastMove(Move opponentMove);
}
