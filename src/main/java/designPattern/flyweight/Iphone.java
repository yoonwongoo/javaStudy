package main.java.designPattern.flyweight;

public class Iphone implements Phone{

    private String phoneName;

    public Iphone(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public void use(String phoneName) {
        System.out.println(phoneName+"을 사용한다.");
    }


}











