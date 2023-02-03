package main.java.algorithm.package6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//삽입정렬 오름차순
//들어온 배열의 한 칸 뒤에서 부터 기준점을 정해서 비교 swap보단 뒤로 미는거
public class Main53 {




    public int[] solution(int n, int[] arr){

        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j;
            for(j=i-1; j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=temp;
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              StringTokenizer st = new StringTokenizer(br.readLine()," ");

              int n = Integer.parseInt(st.nextToken());
              int[] arr = new int[n];
              st = new StringTokenizer(br.readLine()," ");
              for(int i=0; i<n; i++){

                  arr[i]=Integer.parseInt(st.nextToken());
              }


              Main53 main52 = new Main53();
              System.out.println(Arrays.toString(main52.solution(n, arr)));
    }




}
