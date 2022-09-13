package main.java.designPattern.factory;

public class SamsungPhone implements Phone{

    private String phoneName;
    private String PhoneMemory;

    public SamsungPhone(String phoneName, String phoneMemory) {
        this.phoneName = phoneName;
        PhoneMemory = phoneMemory;
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
