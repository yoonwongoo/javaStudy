package main.java.algorithm.package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//7
//회문문자열
//solution() -> 114ms  solution1()-> 110ms solution2()-> 113ms 별 차이가 없다.
public class PalindromeString {

    public String solution(String s){
        StringBuilder sb = new StringBuilder();
        String str = s.toUpperCase();

        for(int i =str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));

        }
        if(str.equals(sb.toString())) return "YES";
        else return "NO";
    }

    public String solution1(String s){

        String x = s.toUpperCase();
        char[] c = x.toCharArray();
        int lp = 0;
        int rp =x.length()-1;

        while(lp<=rp){
            char temp =c[lp];
            c[lp] = c[rp];
            c[rp] = temp;
            lp++;
            rp--;
        }
        String a = String.valueOf(c);
        if(x.equals(a)) return "YES";
        else return "NO";
    }

    public String solution2(String s){
        String x = s.toUpperCase();
        for(int i = 0; i<x.length()/2; i++){
            if(x.charAt(i)!=x.charAt(x.length()-1-i)) return "NO";
        }
        return  "YES";
    }




    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PalindromeString ps = new PalindromeString();
        System.out.println(ps.solution1("sssssssssssssssksssssssssssssss"));
    }
}
