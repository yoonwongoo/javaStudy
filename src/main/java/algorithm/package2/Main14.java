package main.java.algorithm.package2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//14
//선생이 볼 수 있는 학생의 수
public class Main14 {
    //첫번째의 학생은 선생이 무조건 볼 수 있다. for문의 횟수를 줄이자
    public int solution(int[] intArr){
        int answer =1;
        int temp =intArr[0];
        for(int i= 1; i<intArr.length; i++){

            if(temp<intArr[i]){
                temp = intArr[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<intArr.length; i++){
            intArr[i] =Integer.parseInt(st.nextToken());
        }


        Main14 m14 = new Main14();
        System.out.println(m14.solution(intArr));
    }
}
