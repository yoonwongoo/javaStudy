package main.java.designPattern.template;

public abstract class MakeVehicle {


    private String vehicleName;

    public MakeVehicle(String vehicleName) {
          this.vehicleName = vehicleName;
      }


    /*추상클래스의 일반 메서드를 사용*/
    public final void make(){
        makeTire();
        makeHandle();
        makeWindow();
        makeFrame();
        System.out.println(this.vehicleName+"::만들기 완료");
    }

    /*    바퀴를 만든다    */
    public abstract void makeTire();

    /*  핸들을 단다*/
    private void makeHandle(){
        System.out.println("핸들을 만든다.");
    }

    public abstract void makeWindow();

    public abstract void makeFrame();
}
