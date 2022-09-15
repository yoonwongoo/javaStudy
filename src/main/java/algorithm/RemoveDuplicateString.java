package main.java.algorithm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//6
//중복문자열 제거
public class RemoveDuplicateString {

    public String solution(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){

            if(i == s.indexOf(s.charAt(i)))
            sb.append(s.charAt(i));
        }
            return sb.toString();
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        RemoveDuplicateString rds = new RemoveDuplicateString();
        System.out.println(rds.solution(br.readLine()));

    }

}
//indexOf를 사용하여서 for문의 i값과 indexOf의 값이 일치할 경우에는 최초의 값이라고 판단하여서 append.
//다를 경우에는 이미 값이 존재. indexOf는 최초의 값을 return함.