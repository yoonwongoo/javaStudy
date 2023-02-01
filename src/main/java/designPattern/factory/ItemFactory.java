package main.java.designPattern.factory;

import java.util.HashMap;

public class ItemFactory extends Factory{

    private class ItemData{
        private int maxCount;
        private int currentCount;

        public ItemData(int maxCount) {
            this.maxCount = maxCount;
        }
    }
    private HashMap<String,ItemData> repository;


    public ItemFactory(){
        this.repository = new HashMap<String, ItemData>();
        repository.put("Iphone", new ItemData(3));
        repository.put("SamsungPhone",new ItemData(2));
    }
    @Override
    public Boolean isCreate(String itemName) {
        ItemData itemData = repository.get(itemName);
        if(itemData==null){
            return false;
        }
        if(itemData.currentCount >= itemData.maxCount) {
            return false;
        }
        return true;
    }

    @Override
    public Item createItem(String itemName) {

        if(itemName.equals("Iphone")){
            System.out.println(itemName+"만든다");
           return new Iphone();
        } else if (itemName.equals("SamsungPhone")) {
            System.out.println(itemName+"만든다");
           return new SamsungPhone();
        }

        return null;
    }

    @Override
    public void afterProcess(String itemName) {
        ItemData itemData = repository.get(itemName);
        itemData.currentCount++;

    }
}
