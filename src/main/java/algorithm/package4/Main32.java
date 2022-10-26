package main.java.algorithm.package4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//아나그램 해쉬
public class Main32 {



    public String solution(String a, String b){
        String answer="YES";
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        for(char x :arrA){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(int i =0; i<arrB.length;i++){

           if(!map.containsKey(arrB[i]) || map.get(arrB[i])==0){

                return "NO";
           }
           map.put(arrB[i],map.get(arrB[i])-1);


            }


          return answer;
        }





    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
       Main32 m32 =  new Main32();
        System.out.println(m32.solution(a,b));
    }

}
