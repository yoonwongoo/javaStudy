package main.java.designPattern.flyweight;

public class Main {


    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();

        Phone phone = factory.getPhone("Iphone");
        Phone phone1 =factory.getPhone("Iphone");
        Phone phone2 =factory.getPhone("Iphone");
        Phone phone3 =factory.getPhone("Iphone");
        Phone phone4 = factory.getPhone("Iphone");
        Phone phone5=factory.getPhone("Iphone");
        Phone phone6=factory.getPhone("SamsungPhone");
        Phone phone7=factory.getPhone("SamsungPhone");
        System.out.println(phone5);
        System.out.println(phone1);
        System.out.println(phone6);
        System.out.println(phone7);
    }
}
