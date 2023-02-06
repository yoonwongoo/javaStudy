package main.java.designPattern.mediator;

public class Window extends Participant{

    private boolean windowStatus = false;

    public Window(Mediator mediator) {
        super(mediator);
    }

    public boolean isWindowStatus(){
        return windowStatus;
    }

    public void setWindowStatus(boolean status){
        windowStatus=status;
    }

    public void open(){
        if(!isWindowStatus()){
            setWindowStatus(true);
            mediator.participantChanged(this);
        }

    }

    public void closed(){
        if(!isWindowStatus()){
            return;
        }
        setWindowStatus(false);
        mediator.participantChanged(this);
    }

}
