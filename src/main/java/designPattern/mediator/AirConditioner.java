package main.java.designPattern.mediator;

public class AirConditioner extends Participant{


    private boolean airConditionerStatus = false;


    public AirConditioner(Mediator mediator) {
        super(mediator);
    }

    public void airConditionerOn(){
        if(!isAirConditionerStatus()){
            setAirConditionerStatus(true);
            mediator.participantChanged(this);
        }
        return;
    }

    public void airConditionerOff(){
        if(!isAirConditionerStatus()) {
            return;
        }else{
            setAirConditionerStatus(false);
            mediator.participantChanged(this);
        }
    }

    public void setAirConditionerStatus(boolean status){
        this.airConditionerStatus = status;
    }

    public boolean isAirConditionerStatus(){
        return this.airConditionerStatus;
    }
}
