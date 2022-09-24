package main.java.algorithm.package3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//29
//연속된 자연수의 합
public class Main29 {


    public int solution(int n){
        int answer=0;
        int m =n/2+1; //자연수의 범위

        for(int i =1; i<=m; i++){
            int sum =0;
            for(int j=i; j<=m; j++){
                sum+=j;

                if(sum==n){
                    answer++;
                }

            }

        }

    return answer;


    }

    public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


                Main29 main29 = new Main29();

        System.out.println(main29.solution(Integer.parseInt(br.readLine())));

        }
}
