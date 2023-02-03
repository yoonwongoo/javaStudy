package main.java.designPattern.composite;

import java.util.Iterator;
import java.util.LinkedList;

public class Folder extends Unit{
    private LinkedList<Unit> unitLinkedList = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int size =0;
        Iterator<Unit> unitIterator = unitLinkedList.iterator();

        while(unitIterator.hasNext()){
            Unit unit = unitIterator.next();
            size+=unit.getSize();
        }
        return size;
    }

    public boolean add(Unit unit){

        unitLinkedList.add(unit);
        return true;
    }

    public void print(){
        list(this);

    }

    private void list(Unit unit){
        if(unit instanceof File){
            unit.print();
        }else{
            Folder folder = (Folder) unit;
            Iterator<Unit> iterator = unitLinkedList.iterator();
            while (iterator.hasNext()){
                list(iterator.next());

            }
        }


    }






}
