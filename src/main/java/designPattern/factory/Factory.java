package main.java.designPattern.factory;

public abstract class Factory {

    public Item create(String itemName){
        boolean create = this.isCreate(itemName);
        if(create){
            Item item = this.createItem(itemName);
            afterProcess(itemName);
            return item;
        }
        return null;
    }



    public abstract Boolean isCreate(String itemName);
    public abstract Item createItem(String itemName);
    public abstract void afterProcess(String itemName);
}
