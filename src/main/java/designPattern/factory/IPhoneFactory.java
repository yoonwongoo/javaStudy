package main.java.designPattern.factory;

public class IPhoneFactory implements AbstractPhoneFactory{




    @Override
    public Phone createPhone() {
        return  new Iphone("Iphone","128G");
    }
}
