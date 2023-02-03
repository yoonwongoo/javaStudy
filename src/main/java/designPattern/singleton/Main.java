package main.java.designPattern.singleton;

public class Main {
    public static void main(String[] args) {
        Myself myself = Myself.getInstance();
        myself.countUp();
        System.out.println(myself.toString());

        Myself myself1 =Myself.getInstance();
        myself1.countUp();
        System.out.println(myself.toString());
    }


}
