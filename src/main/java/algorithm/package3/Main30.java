package main.java.algorithm.package3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//30
//최대길이 연속부분수열(복합적 문제) two pointer
public class Main30 {



    public int solution(int n, int[] intArr){
        int lt=0,answer=0,cnt=0;

        for(int rt=0; rt<intArr.length; rt++){
            if(intArr[rt]==0){
                cnt++;
                while(cnt>n){
                    if(intArr[lt]==0){ //현재 lt가 0일떄 깍아야지 0도아닌데 하면안된다.
                        cnt--;
                    }
                    lt++;
                }
                answer=Math.max(answer, rt-lt+1);
            }
        }
        return answer;

    }


    public static void main(String[] args) throws IOException {

               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

               StringTokenizer st = new StringTokenizer(br.readLine()," ");

               int[] intArr = new int[Integer.parseInt(st.nextToken())]; //배열생성
               int n = Integer.parseInt(st.nextToken());

               st = new StringTokenizer(br.readLine()," ");
               for(int i=0; i<intArr.length; i++){
                   intArr[i] = Integer.parseInt(st.nextToken());
               }

        Main30 m30 = new Main30();
        System.out.print(m30.solution(n,intArr));


       }
}
