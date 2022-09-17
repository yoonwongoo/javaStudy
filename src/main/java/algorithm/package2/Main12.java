package main.java.algorithm.package2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//12
//암호
public class Main12 {

    public String solution(String str, int strArrLength){
                StringBuilder sb = new StringBuilder();
               for(int i = 0; i<strArrLength; i++){
                   String temp = str.substring(0,7).replace('#','1').replace('*','0');
                   char x = (char)Integer.parseInt(temp,2);
                   sb.append(x);
                   str = str.substring(7);
               }


        return sb.toString();
    }

    public static void main(String[] args) {
        String str ="#****###**#####**#####**##**";
        Main12 m12 = new Main12();
        System.out.println(m12.solution(str,4));
    }
}
//10진수 -> 2진수 변환 : Integer.toBinaryString(int);
//10진수 -> 8진수 변환 : Integer.toOctalString(int);
//10진수 -> 16진수 변환 : Integer.toHexString(int);
//2진수 -> 10진수 변환 : Integer.parseInt(string, 2);
//8진수 -> 10진수 변환 : Integer.parseInt(string, 8);
//16진수 -> 10진수 변환 : Integer.parseInt(string, 10);