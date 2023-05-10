package main;

public class Player {

    private String name;
    public int score;

    public Player(String name) throws IllegalArgumentException{
        if (name == "" || name == " "){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
        this.score = 0;
    }

    public void incrementScore(int points){
        this.score += points;
    }
}
