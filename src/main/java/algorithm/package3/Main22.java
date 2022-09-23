package main.java.algorithm.package3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//22
//산봉우리
public class Main22 {

    int[] x ={-1,0,1,0};
    int[] y ={0,1,0-1};


    public int solution(int[][] intArr){
        int answer =Integer.MIN_VALUE;
        for(int i =0; i<intArr.length; i++){
            for (int j =0; j<intArr.length; j++){
                boolean check =true;
                for(int k=0; k<x.length; k++){
                    int nx = i+x[k];
                    int ny = j+y[k];
                    if(intArr[i][j]<intArr[nx][ny])
                        check = false;
                        break;
                }
                if(check) answer++;

            }
        }

        return answer;
    }

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n =Integer.parseInt(st.nextToken());
        int[][] intArr = new int[n][n];

        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j =0; j<n; j++){
                intArr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        Main22 m22 = new Main22();
        System.out.println(m22.solution(intArr));
        }
}
