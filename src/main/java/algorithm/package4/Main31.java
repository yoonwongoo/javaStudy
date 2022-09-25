package main.java.algorithm.package4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//31
//학급회장(해쉬)
public class Main31 {


    public char solution(String s){

        HashMap<Character,Integer> hashMap = new HashMap<>();
        char answer =' ';
        int max = Integer.MIN_VALUE;
        for(char x : s.toCharArray()){
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        }


        for(char x : hashMap.keySet()){
           if(hashMap.get(x)>max){
               max = hashMap.get(x);
               answer = x;
           }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        Main31 m31 = new Main31();
        System.out.println(m31.solution(s));

    }
}
