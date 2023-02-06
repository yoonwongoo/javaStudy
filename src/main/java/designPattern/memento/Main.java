package main.java.designPattern.memento;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        String[] actions = {"UP","DOWN","LEFT","RIGHT"};
        Walker walker = new Walker(0,0,10,10);


        Random random = new Random();
        double minDistance = Double.MAX_VALUE;
        Walker.Memento memento = null;

        while(true){
           String action = actions[random.nextInt(4)];
           double distance = walker.action(action);
            System.out.println("action::"+action);
            System.out.println("distance::"+distance);
           /*거리에 도달했으면*/
           if(distance == 0.0){
               break;
           }

           if(minDistance > distance){
               minDistance = distance;
               memento = walker.createMemento();
           }else{
               if(memento!=null){
                   walker.rememberMemento(memento);
               }
           }


        }

        System.out.println(walker);

    }
}
