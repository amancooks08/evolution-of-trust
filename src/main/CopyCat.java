package main;

public class CopyCat extends Player{
    @Override
    Move makeMove(){
        if(this.score != null && this.score <= 0){
            return Move.CHEAT;
        }
        return Move.COOPERATE;
    }
}
