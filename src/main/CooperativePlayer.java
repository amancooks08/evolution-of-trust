package main;

public class CooperativePlayer extends Player{
    @Override
    public Move makeMove() {
        return Move.COOPERATE;
    }
}
