package main.java.designPattern.factory;

public class PhoneFactory {
    public static Phone getPhone(AbstractPhoneFactory abstractPhoneFactory){
        return abstractPhoneFactory.createPhone();
    }
}
