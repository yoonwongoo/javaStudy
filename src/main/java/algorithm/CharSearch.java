package main.java.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//문자찾기
public class CharSearch {



    public int solution(String s , char c){

        int amount = 0;
        String str = s.toUpperCase();
        char cha = Character.toUpperCase(c);

        //인덱스 접근방법
//        for(int i = 0; i<str.length(); i++){
//            if(str.charAt(i)==cha) ++amount;
//        }

            for(char x : str.toCharArray())
                if(x == cha) ++amount;

        return amount;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String str = st.nextToken();
        char cha = st.nextToken().charAt(0);

        CharSearch cs = new CharSearch();
        System.out.println(cs.solution(str,cha));
    }

}