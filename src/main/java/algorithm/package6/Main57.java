package main.java.algorithm.package6;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Main57 {

    private String name;
    private String pass;

    public Main57(String name, String pass){
        this.name=name;
        this.pass=pass;
    }

    public static void main(String[] args) {

        ConcurrentMap<Object,String> asd = new ConcurrentHashMap<>();
        Main57 main57 = new Main57("asd", "asd");
        Main57 main55 = new Main57("asd", "asd");
        asd.put(main57,"시1발");

        asd.get(main55);








    }
}
