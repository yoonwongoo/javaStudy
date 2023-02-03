package main.java.algorithm.package7;



//10진수 N이 입력되면 n을 이진수로 변환하여 출력하라
public class Main62 {


    public void rf(int n){
        if(n==0) return;
        else  {
            rf(n/2);
            System.out.print(n%2+" ");
        }


    }
    
    
    public static void main(String[] args) {
        Main62 main61 = new Main62();
        main61.rf(10);
    }
}
