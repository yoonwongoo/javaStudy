package main.java.designPattern.observer;

import java.util.Iterator;
import java.util.Random;

public class RandomDIceGame extends DiceGame{

    private Random random = new Random();


    @Override
    public void play() {
        int diceNumber = random.nextInt(6)+1;

        Iterator<Player> iterable =  players.iterator();
        System.out.println("결과는:::"+diceNumber);
        while (iterable.hasNext()){
            iterable.next().diceResult(diceNumber);
        }
    }
}
