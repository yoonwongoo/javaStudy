package main.java.algorithm.package2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//가위바위보
//15
//solution ->Time: 120ms Memory: 26MB , solution1-> Time: 124ms Memory: 26MB
public class Main15 {

    //가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보
    public String[] solution(int[] arrA, int[]arrB){
        String[] answer = new String[arrA.length];
        for(int i =0; i<arrA.length; i++){
            //A가 이기는경우
            if((arrA[i] == 1 && arrB[i] == 3) || (arrA[i] == 2 && arrB[i] == 1) || (arrA[i] == 3 && arrB[i] == 2))
            {
                answer[i] ="A";
            } else if ((arrB[i] == 1 && arrA[i] == 3) || (arrB[i] == 2 && arrA[i] == 1) || (arrB[i] == 3 && arrA[i] == 2)) {
                answer[i] ="B";
            }else {
                answer[i] ="D";
            }

        }

        return answer;
    }


    public String[] solution1(int[] arrA, int[]arrB){
        String[] answer = new String[arrA.length];
        for(int i =0; i<arrA.length; i++){
            if(arrA[i] == arrB[i]){
                answer[i] ="D";
            } else if ((arrA[i] == 1 && arrB[i] == 3) || (arrA[i] == 2 && arrB[i] == 1) || (arrA[i] == 3 && arrB[i] == 2)) {
                answer[i] ="A";
            }else{
                answer[i]="B";
            }
        }
        return answer;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] arrA = new int[count];
        int[] arrB = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringTokenizer st1 = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<arrA.length; i++){
            arrA[i]=Integer.parseInt(st.nextToken());
        }

        for(int i =0; i<arrB.length; i++){
            arrB[i]=Integer.parseInt(st1.nextToken());
        }


        Main15 m = new Main15();
        for(String x : m.solution(arrA,arrB)){
            System.out.println(x);
       }
    }
}
