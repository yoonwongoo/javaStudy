package main.java.algorithm.package3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//27
//최대매출
public class Main27 {



    public int solution(int n, int[] intArr){
        int sum=0;
        for(int i =0; i<intArr.length-n+1; i++){
            int temp=0;
            for(int j =i; j<n+i; j++){
                temp +=intArr[j];
            }
            if(temp>sum){
                sum=temp;
            }

        }

        return sum;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] intArr = new int[Integer.parseInt(st.nextToken())];
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<intArr.length; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        Main27 m27 = new Main27();
        System.out.println(m27.solution(n,intArr));




    }
}
