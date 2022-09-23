package main.java.algorithm.package3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//25
//배열을 합친후 오름차순.

public class Main25 {


    public List solution(int[] arr1, int[] arr2){
        ArrayList<Integer> answerList = new ArrayList<>();
        int p1=0, p2=0;


        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1] < arr2[p2])
                answerList.add(arr1[p1++]);
            else answerList.add(arr2[p2++]);
        }
        while(p1<arr1.length) answerList.add(arr1[p1++]);//나머지를 어떤게 남은지 모르니까 그냥 다 털어넣지
        while(p2<arr2.length) answerList.add(arr2[p2++]);
        return answerList;
    }








    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] intArr1 = new int[n];



        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i<n; i++) {
            intArr1[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());

        int[] intArr2 = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i<m; i++) {
            intArr2[i] = Integer.parseInt(st.nextToken());
        }


        Main25 m25 = new Main25();
        m25.solution(intArr1,intArr2).forEach(c->{
            System.out.print(c+" ");
        });

        }


    }

