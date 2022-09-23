package main.java.algorithm.package3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//23
//임시반장정하기
public class Main23 {


    public int solution(int[][] intArr){

        int answer=0;
        int max = Integer.MIN_VALUE;

        for(int i =0; i<intArr.length; i++){
            int cnt =0;
            for(int j = 0; j<intArr.length; j++){

                for(int k = 0; k<5; k++){

                    if(intArr[i][k] == intArr[j][k]){
                        cnt++;
                    }
                }

            }
            if(cnt>max){
                max = cnt;
                answer = i;
            }

        }
        return answer;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int intArr[][] = new int[n][n];

        StringTokenizer st ;

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");

            for(int j =0; j<n; j++){

                intArr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        Main23 m23 = new Main23();
        System.out.println(m23.solution(intArr));


    }
}
