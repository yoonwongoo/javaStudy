package main.java.designPattern.composite;

public abstract class Unit {

    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSize();

    public abstract void print();
}
