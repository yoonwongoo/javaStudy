package main.java.algorithm.package7;




//재귀함수  자연수 n이 입력되면 재귀함수를 이용하여 1부터 n까지 출력하자
public class Main60 {

    public void rf(int n){

        if(n==0) return;
        else{
            rf(n-1);
            System.out.print(n+" ");
        }

    }


    public static void main(String[] args) {
        Main60 main60 = new Main60();
        main60.rf(5);
    }
}
//스택 프레임을 생각하자