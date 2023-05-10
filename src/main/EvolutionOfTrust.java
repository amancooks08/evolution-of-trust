package main;

public class EvolutionOfTrust {
        private Player player1;
        private Player player2;

        private int rounds;


        public EvolutionOfTrust(String name1, String name2, int rounds) throws IllegalArgumentException{
            if (name1 == "" || name2 ==""){
                throw new IllegalArgumentException("invalid names of players");
            }
            if (rounds <= 0){
                throw new IllegalArgumentException("invalid number of rounds");
            }
            this.player1 = new Player(name1);
            this.player2 = new Player(name2);
            this.rounds = rounds;
        }



}
