package main.java.algorithm.package6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//LRU 알고리즘은 Least Recently Used
public class Main54 {
    
    
    public int[] solution(int n, int m, int arr[]){
        //m=횟수 만큼 실행
        //매개변수로 받은 arr[]은 캐시가 실행될 메모리 넘버링이 있다.
        int[] cashArr = new int[n];
        for(int x : arr) {
            int cash =-1;
            for(int i=0; i<n; i++)
                //cashHit==캐시안에 같은 값이 있는 경우
                if(x==cashArr[i])
                    cash=i;// 같은 값이 있는 경우 그 자리값을 넣어놓는다

            //cashMiss==캐시안에 값은 값이 없는 경우
            if(cash==-1) {
                for (int i = n - 1; i >= 1; i--) {
                    cashArr[i] = cashArr[i-1];
                }
            }else{
                //hit가 발생한 지점까지 밀어주자 그 뒤에 있는 경우는 가만히 있어도됨.
                for (int i = cash; i >= 1; i--) {
                      cashArr[i] = cashArr[i-1];
                  }
            }
            cashArr[0]=x;
            System.out.println(Arrays.toString(cashArr));


        }
        return cashArr;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           StringTokenizer st = new StringTokenizer(br.readLine()," ");

           int n = Integer.parseInt(st.nextToken());//캐시의 크기
           int m =Integer.parseInt(st.nextToken());//실행될 캐시 값의 배열
           int[] arr = new int[m];//캐시값 배열
           st = new StringTokenizer(br.readLine()," ");
           for(int i=0; i<m; i++){

               arr[i]=Integer.parseInt(st.nextToken());
           }
           Main54 main53 = new Main54();
      //  System.out.println(Arrays.toString(main53.solution(n,m,arr)));
        main53.solution(n,m,arr);
        /*5 9
        1 2 3 2 6 2 3 5 7*/
}
}
