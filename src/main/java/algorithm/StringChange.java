package main.java.algorithm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//소문자를 대문자 대문자를 소문자로 변화하여 출력
public class StringChange {



    public String solution(String s){

      StringBuilder sb = new StringBuilder();

        for(char x : s.toCharArray()){
            if(Character.isLowerCase(x)){
                sb.append(Character.toUpperCase(x));
            }else{
                sb.append(Character.toLowerCase(x));
            }
        }


        return sb.toString();
    }
    //char 65-90(A-Z) 97-122(a-z)

    public String solution1(String s){
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c >=65 && c<=90){
                sb.append((char)(c+32));
            }else{
                sb.append((char)(c-32));

            }
        }
        return sb.toString();
    }





    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringChange sc = new StringChange();
        //System.out.println(sc.solution(br.readLine()));
        System.out.println(sc.solution1(br.readLine()));
    }

}
