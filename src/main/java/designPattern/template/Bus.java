package main.java.designPattern.template;

public class Bus extends MakeVehicle{
    public Bus(String vehicleName) {
            super(vehicleName);
    }

    @Override
    public void makeTire() {
        System.out.println("바퀴를 6개 만듭니다");
    }

    @Override
    public void makeWindow() {
        System.out.println("창문을 10개 만듭니다");
    }



    @Override
    public void makeFrame() {
        System.out.println("노란색 프레임을 만듭니다");
    }
}
