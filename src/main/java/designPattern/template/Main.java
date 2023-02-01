package main.java.designPattern.template;

public class Main {

    public static void main(String[] args){

        MakeVehicle car = new Car("자동차");
        MakeVehicle bus = new Bus("버스");


        car.make();
        bus.make();

    }
}
