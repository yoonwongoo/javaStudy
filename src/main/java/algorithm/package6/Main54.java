package main.java.algorithm.package6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//중복확인
/*n명이 중복?D:U

입력예시
8
20 25 52 30 39 33 43 33

출력예시
D
*/

public class Main54 {




    public static String solution(int n,int[] arr){
        Arrays.sort(arr);


       /*
       선택정렬
       for(int i =0; i<n; i++) {
            int idx= i;
            for (int j = idx + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;

        }
        */
        /*
        버블정렬
        for(int i =0; i<n-1; i++){

            for(int j=0; j<n-i-1; j++){//뒤에 제일 큰 num이 있으니까 굳이 뒤를 계속할 필요없음
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
           }
         */
        /*
        삽입정렬
        for(int i =1; i<n; i++){
            int temp=arr[i] ,j;
            for(j=i-1; j>=0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] =temp;
        }
        */

        for(int i=0; i<n-1; i++){
                if(arr[i]==arr[i+1]){

                    return "D";
                }
        }

      return "U";
    }


    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n =Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine()," ");
        int i =0;
        while(st.hasMoreTokens()){
            arr[i]=Integer.parseInt(st.nextToken());
            i++;
        }

        System.out.println(Main54.solution(n,arr));




    }
}
