package main.java.algorithm.package2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//20
//등수 구하기
public class Main20 {

    public int[] solution(int[] intArr){
        int[] answer = new int[intArr.length];
        for(int i = 0; i<intArr.length; i++){
            int temp =1;

            for(int j=0; j<intArr.length; j++){

                if(intArr[i] < intArr[j]){
                    temp++;
                }
                answer[i]=temp;
            }

        }

        return answer;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0; i<intArr.length; i++){
            intArr[i] =Integer.parseInt(st.nextToken());
        }

        Main20 m = new Main20();
        for(int x :m.solution(intArr)){
            System.out.print(x+" ");
        }
    }
}
