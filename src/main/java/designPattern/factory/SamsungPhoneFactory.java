package main.java.designPattern.factory;

public class SamsungPhoneFactory implements AbstractPhoneFactory {
    @Override
    public Phone createPhone() {
        return new SamsungPhone("SamsungPhone","256G");
    }
}
