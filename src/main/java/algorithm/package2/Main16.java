package main.java.algorithm.package2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//16
//피보나치수열
public class Main16 {

    //입력 10 출력 1 1 2 3 5 8 13 21 34 55
    public int[] solution(int x){
        int[] intArr = new int[x];
        intArr[0] =1;
        intArr[1] =1;

        for(int i =2; i<intArr.length; i++){
            intArr[i] =intArr[i-1]+intArr[i-2];
        }

        return intArr;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());


        Main16 m16 = new Main16();
        for(int c : m16.solution(x)){
            System.out.print(c+" ");
        }


    }
}
