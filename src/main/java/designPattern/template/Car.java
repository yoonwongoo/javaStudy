package main.java.designPattern.template;

public class Car extends MakeVehicle{

    public Car(String vehicleName) {
            super(vehicleName);
    }
    @Override
    public void makeTire() {
        System.out.println("바퀴를 4개 만듭니다");
    }

    @Override
    public void makeWindow() {
        System.out.println("창문을 4개 만듭니다");
    }



    @Override
    public void makeFrame() {
        System.out.println("검은색의 프레임을 만듭니다");
    }
}
