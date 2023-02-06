package main.java.designPattern.mediator;

public class Door extends Participant{
    /*문 상태확인*/
    private boolean doorStatus = false;


    public Door(Mediator mediator) {
        super(mediator);
    }


    public void setDoorStatus(boolean status){
        this.doorStatus = status;
    }


    public boolean isDoorStatus(){
        return doorStatus;
    }


    public void open(){
        if(!isDoorStatus()){
            doorStatus=true;
            mediator.participantChanged(this);
        }


    }

    public void close(){
        if(!isDoorStatus()){
            return;
        }
        doorStatus=false;
        mediator.participantChanged(this);
    }
}
