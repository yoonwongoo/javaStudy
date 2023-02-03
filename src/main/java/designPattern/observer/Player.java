package main.java.designPattern.observer;

public abstract class Player {

    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public abstract void diceResult(int diceNumber);
}
