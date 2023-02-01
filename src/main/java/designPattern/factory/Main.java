package main.java.designPattern.factory;

public class Main {

    public static void main(String[] args) {
        Factory factory= new ItemFactory();



        Item item = factory.create("Iphone");
        Item item1 = factory.create("Iphone");
        Item item2 = factory.create("Iphone");
        Item item3 = factory.create("Iphone");
        item2.use();
        item1.use();
        item.use();
    }
}
