package main.java.designPattern.mediator;

public class SmartHome implements Mediator{

    public Door door= new Door(this);

    public AirConditioner airConditioner = new AirConditioner(this);
    public Window window = new Window(this);
    @Override
    public void participantChanged(Participant participant) {
        if(participant == door && !door.isDoorStatus()){
            window.open();
            airConditioner.airConditionerOff();
        }
        if(participant == window && !window.isWindowStatus()){
            door.open();
            airConditioner.airConditionerOff();
        }
        if(participant == airConditioner && airConditioner.isAirConditionerStatus()){
            door.close();
            window.closed();
        }
    }



}
