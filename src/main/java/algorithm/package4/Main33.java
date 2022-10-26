package main.java.algorithm.package4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//매출액의 종류
public class Main33 {

    //틀린방법은 아니지만 시간초..과...
    public List solution(int n, int k, int[] arr){
        List<Integer> answerList = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
                for(int i =0;i<n-k+1;i++){

                    for(int j=i; j<i+k; j++){

                        map.put(arr[j],map.getOrDefault(arr[j],0)+1);
                    }

                    answerList.add(map.size());
                    map.clear();
                }



        return answerList;




    }


    public List solution1(int n, int k, int[] arr){
            List<Integer> answerList = new ArrayList<>();

            Map<Integer,Integer> map = new HashMap<>();

            //미리 일단 초반값을 넣어주자
            for(int i =0; i<k-1; i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            }
            int lt =0;
            for(int rt=k-1; rt<n; rt++){
                map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
                answerList.add(map.size());
                map.put(arr[lt], map.get(arr[lt])-1);// 무조건 당연히 값이 존재한다 앞전에 넣어놨기때문에
                if(map.get(arr[lt])==0){
                    map.remove(arr[lt]); //0이라는거는 없는거기때문에 지워야한다.
                    lt++;
                }
            }


            return answerList;




        }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n;i++){

            arr[i]=Integer.parseInt(st.nextToken());

        }

        Main33 m33 = new Main33();
        m33.solution(n,k,arr).forEach(c-> System.out.print(c+" "));


    }
}
