package main.java.designPattern.flyweight;

public class SamsungPhone implements Phone{

    private String phoneName;

    @Override
    public void use(String phoneName) {
        System.out.println(phoneName+"을 사용한다");
    }

    public SamsungPhone(String phoneName) {
        this.phoneName = phoneName;
    }
}
