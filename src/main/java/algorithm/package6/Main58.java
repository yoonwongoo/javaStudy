package main.java.algorithm.package6;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Main58 {

    private String name;
    private String pass;

    public Main58(String name, String pass){
        this.name=name;
        this.pass=pass;
    }

    public static void main(String[] args) {

        ConcurrentMap<Object,String> asd = new ConcurrentHashMap<>();
        Main58 main57 = new Main58("asd", "asd");
        Main58 main55 = new Main58("asd", "asd");
        asd.put(main57,"시1발");

        asd.get(main55);








    }
}
