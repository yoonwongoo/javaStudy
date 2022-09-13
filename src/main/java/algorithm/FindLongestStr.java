package main.java.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문장 속 가장 긴 단어 찾기
public class FindLongestStr {


    public String solution(String s){
        String answer = "";
        int min = Integer.MIN_VALUE;
        String[] str =s.split(" ");
        for(String st : str){
            if(st.length() > min){
                min = st.length();
                answer= st;
            }
        }


        return answer;
    }


    public String solution1(){

        return null;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        FindLongestStr fStr = new FindLongestStr();
        System.out.println(fStr.solution(br.readLine()));

    }
}

//이 문제도 보면 그냥 최대값 최솟값을 구하기이다