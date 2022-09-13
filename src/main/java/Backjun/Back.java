package main.java.Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back {
    //백준 팩토리얼문제
    //10!을 구하라!
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer = f(n);
        System.out.println(answer);

    }

    public static int f(int n){

        if(n == 1) {
            return 1;
        }
        else {
            return n * f(n-1);
        }
    }
}
