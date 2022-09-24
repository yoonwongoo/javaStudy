package main.java.algorithm.package3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//28
//연속 부분수열
public class Main28 {

    public int solution(int n, int[] intArr){

        int answer =0;
        for(int i=0; i<intArr.length; i++){
            int sum =0;
            for(int j=i; j<intArr.length; j++){
                sum+=intArr[j];
                if(sum>n){
                    break;
                }else if(sum==n){
                    answer++;
                    break;
                }

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

            Main28 main28 = new Main28();

        System.out.println(main28.solution(n,intArr));
    }
}
