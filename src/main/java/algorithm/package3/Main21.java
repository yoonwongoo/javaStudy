package main.java.algorithm.package3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//21
//격자판 최대의 합
public class Main21 {




    public int solution(int[][] intArr){
        int answer =Integer.MIN_VALUE;
        int sum1,sum2;

        for(int i = 0; i<intArr.length; i++){
                sum1=sum2=0;
            for(int j = 0; j<intArr.length; j++){
                sum1 += intArr[i][j];
                sum2 += intArr[j][i];
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }
        sum1=sum2=0;

        //대각선의 합
        for(int i = 0; i<intArr.length; i++) {
            sum1 += intArr[i][i];
            sum2 += intArr[i][intArr.length-1-i];

            }
            answer = Math.max(answer,sum1);
            answer= Math.max(answer,sum2);

        return answer;

        }





    public static void main(String[] args)throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n =Integer.parseInt(st.nextToken());
        int[][] intArr = new int[n][n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j =0; j<n; j++){
                intArr[i][j]=Integer.parseInt(st.nextToken());
            }
        }


        Main21 m21 = new Main21();
        System.out.println(m21.solution(intArr));
    }
}
