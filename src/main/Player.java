package main;

public class Player {
    private String name;
    private int score;
    private Strategy strategy;

    public Player(String name, Strategy strategy) throws IllegalArgumentException{
        if (name == "" || name == " "){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
        this.score = 0;
        this.strategy = strategy;
    }
}
