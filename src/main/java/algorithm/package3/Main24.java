package main.java.algorithm.package3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main24 {


    public int solution(int[][] intArr, int n, int m){
        int[] arr = new int[4];


        for(int i =0; i<n; i++){

            for(int j =0; j<m; j++){
                arr[i]=intArr[i][j];

            }
        }

        return 1;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        int[][] intArr = new int[n][m];


        for(int i=0; i<m; i++){

            st = new StringTokenizer(br.readLine()," ");

            for(int j=0; j<n; j++){
                intArr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        Main24 m24 = new Main24();
    }

}
