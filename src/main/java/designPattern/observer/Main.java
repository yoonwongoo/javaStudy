package main.java.designPattern.observer;

public class Main {

    public static void main(String[] args) {
        DiceGame diceGame = new RandomDIceGame();
        diceGame.addPlayer(new EvenBettingPlayer("짝수야 나는1"));
        diceGame.addPlayer(new EvenBettingPlayer("짝수야 나는2"));
        diceGame.addPlayer(new EvenBettingPlayer("짝수야 나는3"));

        diceGame.addPlayer(new OddBettingPlayer("홀수야 나는1"));
        diceGame.addPlayer(new OddBettingPlayer("홀수야 나는2"));
        diceGame.addPlayer(new OddBettingPlayer("홀수야 나는3"));

        int i =0;
        while (i<5){
            diceGame.play();
            i++;
        }
    }
}
