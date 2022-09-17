package main.java.algorithm.package2;

//19
//점수계산하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//solution->Time: 119ms Memory: 26MB
//19
//점수계산하기
public class Main19 {


    public int solution(int[] intArr){
        int answer =0;
        int temp =0;
        for(int i = 0; i<intArr.length; i++){

            if(intArr[i]==1){
                temp++;
                answer += temp;
            }else{
                temp =0;
            }

        }
        return answer;
    }


    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<intArr.length; i++){
            intArr[i]=Integer.parseInt(st.nextToken());
        }

        Main19 m19 = new Main19();
        System.out.println(m19.solution(intArr));

    }
}
