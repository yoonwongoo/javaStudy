package main.java.algorithm.package6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//버블정렬 오름차순
//횟수가 줄어들어야한다.
//큰 수가 제일 뒤로 계속 간다
public class Main51 {


    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }

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


        Main51 main51 = new Main51();
        System.out.println(Arrays.toString(main51.solution(n, arr)));
    }
}
