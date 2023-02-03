package main.java.designPattern.observer;

public class EvenBettingPlayer extends Player{

    @Override
    public void diceResult(int diceNumber) {
        if(diceNumber % 2 ==0){
            System.out.println(this.getPlayerName()+"의 승리");
        }
    }

    @Override
    public String getPlayerName() {
        return super.getPlayerName();
    }

    public EvenBettingPlayer(String playerName) {
        super(playerName);
    }
}
