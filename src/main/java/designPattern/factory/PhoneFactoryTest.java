package main.java.designPattern.factory;

public class PhoneFactoryTest {

    public static void main(String args[]){
        //factory method pattern
     /*   PhoneFactory pf = new PhoneFactory();

        Phone ip = pf.getPhone("apple");
        System.out.println(ip.getPhoneName());

        Phone ss = pf.getPhone("samsung");
        System.out.println(ss.getPhoneName());*/



        //abstract method pattern
        Phone iphone = PhoneFactory.getPhone(new IPhoneFactory());
        Phone samsungPhone = PhoneFactory.getPhone(new SamsungPhoneFactory());

    }


}
