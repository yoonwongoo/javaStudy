package main.java.designPattern.mediator;

public class Main {


    public static void main(String[] args) {



        SmartHome smartHome = new SmartHome();

        smartHome.participantChanged(smartHome.airConditioner);

    }
}
