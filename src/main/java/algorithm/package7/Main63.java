package main.java.algorithm.package7;

//재귀함수를 이용한 피보나치수열(메모이제이션)
public class Main63 {


    static int[] arr;
    public int rf(int n){
        if(arr[n]>0) return arr[n];
        if(n==1)return arr[n]=1;
        else if (n==2) return arr[n]=1;
        else return arr[n]=rf(n-2)+rf(n-1);

    }
    public static void main(String[] args) {
        Main63 main63 = new Main63();
        int n =100;
        arr = new int[n+1];
        main63.rf(n);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
