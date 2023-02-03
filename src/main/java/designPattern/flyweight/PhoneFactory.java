package main.java.designPattern.flyweight;

import java.util.HashMap;

public class PhoneFactory {

    private static final HashMap<String, Phone> phoneRepository = new HashMap<>();


    /*폰을 만들다*/
    public Phone getPhone(String phoneName) {
        /*메모리에 없는 경우*/
        if (phoneRepository.get(phoneName) == null) {
            if (phoneName.equals("Iphone")) {
                Phone phone = new Iphone(phoneName);
                phoneRepository.put(phoneName, phone);
                return phone;

            } else if (phoneName.equals("SamsungPhone")) {
                Phone phone = new SamsungPhone(phoneName);
                phoneRepository.put(phoneName, phone);
                return phone;
            }
        }
        /*메모리에 있는 경우*/
        return phoneRepository.get(phoneName);

    }


}
