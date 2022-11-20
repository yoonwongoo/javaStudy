package main.java.algorithm.package7;



//재귀함수를 이용한 팩토리얼
public class Main62 {



    public int rf(int n){
        if(n==1) return 1;
        else return n*rf(n-1);
    }


    public static void main(String[] args) {
        Main62 main62 = new Main62();
        System.out.println(main62.rf(5));
    }
}
//
