package main.java.designPattern.observer;

public class OddBettingPlayer extends Player {



    public OddBettingPlayer(String playerName) {
        super(playerName);
    }

    @Override
    public void diceResult(int diceNumber) {
        if(diceNumber % 2 ==1){
            System.out.println(this.getPlayerName()+"의 승리");
        }
    }
}
