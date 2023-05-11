package main;

public class CooperativePlayer implements Player{
    @Override
    public Move makeMove() {
        return Move.COOPERATE;
    }
}
