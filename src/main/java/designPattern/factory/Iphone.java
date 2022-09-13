package main.java.designPattern.factory;

public class Iphone implements Phone{
    private String phoneName;
    private String PhoneMemory;


    public Iphone(String phoneName, String phoneMemory) {
        this.phoneName = phoneName;
        this.PhoneMemory = phoneMemory;
    }

    @Override
    public String getPhoneName() {
        return this.phoneName;

    }

    @Override
    public String getPhoneMemory() {
        return this.PhoneMemory;

    }
}
