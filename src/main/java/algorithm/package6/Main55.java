package main.java.algorithm.package6;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//장난꾸러기
public class Main55 {


    public List<Integer> solution(int n , int[] arr){

//        for(int i =0; i<n; i++){
////            int idx =i;
////            for(int j=i+1; j<n; j++){
////                if(arr[idx]>arr[j]){
////                    idx=j;
////                }
////            }
////            int temp =arr[i];
////            arr[i]= arr[idx];
////            arr[idx]=temp;
////        }
////
////        for(int i=0; i<n-1; i++){
////            for(int j=i; j<n-1-i; j++){
////                if(arr[j]<arr[j+1]){
////                    int temp = arr[j];
////                    arr[j]=arr[j+1];
////                    arr[j+1]=temp;
////                }
////            }
////        }
////
        List<Integer> solutionList = new ArrayList<>();
        int[] sortArr = arr.clone();
        for(int i=1; i<n; i++){
            int temp= arr[i],j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>temp){
                    arr[j+1] =arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] =temp;
        }
        for(int i=0; i<n; i++){

            if(arr[i] != sortArr[i]){
                solutionList.add(i+1);
            }
        }
        return solutionList;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        int i =0;
        st = new StringTokenizer(br.readLine()," ");

        while(st.hasMoreTokens()){
            arr[i]= Integer.parseInt(st.nextToken());
            i++;
        }


        Main55 main55 = new Main55();
        main55.solution(n,arr).forEach(c-> System.out.print(c.intValue()+" "));

    }
}
