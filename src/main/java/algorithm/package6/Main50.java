package main.java.algorithm.package6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//선택정렬 오름차순
//반복은 하지만 버블정렬처럼 바로 옆값을 확인을 반복하는게 아니라 idx와 비교
//작은값을 찾아라 그것을 idx넣고 비교
public class Main50 {


    public int[] solution(int n, int[] arr){


        for(int i=0;i<n-1;i++){
            int idx = i;

            for(int j=idx+1; j<n; j++){

                 if(arr[j]<arr[idx]){
                     idx=j;
                 }

            }
            swap(arr,i,idx);

        }
        return arr;
    }

    public int[] swap(int[]arr,int i, int idx){
        int temp =arr[i];
       arr[i] = arr[idx];
       arr[idx]=temp;
        return arr;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine()," ");

        for(int i =0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Main50 main50 = new Main50();
       int[] solutionArr= main50.solution(n,arr);
        System.out.println(Arrays.toString(solutionArr));
    }
}
