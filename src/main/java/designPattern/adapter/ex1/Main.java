package main.java.designPattern.adapter.ex1;

public class Main {


    public static void main(String[] args){
        /*기존의 코드는 변경하지 않으면서 어댑터를 추가를 하여 사용*/
        Adapter adapter = new AdaptorImpl();
        adapter.halfOf(100f);
        adapter.twiceOf(100f);
    }
}
