package main;

public class Cheater implements Player{
    @Override
    public Move makeMove() {
        return Move.CHEAT;
    }
}
