package main.java.designPattern.singleton;
/*이세상에는 나 혼자만이 존재할뿐.......*/
public class Myself {
    private int count;
    private static Myself myself = null;

    private Myself(){
    }
    public static Myself getInstance(){
        if(myself==null){
            myself = new Myself();
        }
        return myself;
    }


    public void countUp(){
        count++;
        System.out.println(count);
    }
}
