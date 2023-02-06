package main.java.algorithm.package5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main43 {



    public int solution(int[][] arr, int[] movesArr){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int move :movesArr){
            int moves = move-1; /*인덱스 번호는 0부터니까*/
            for(int i=0; i<arr.length; i++){
                    if(arr[i][moves]!=0){
                        int tmp = arr[i][moves];
                        arr[i][moves] = 0;
                        if(!stack.empty() && stack.peek()==tmp){
                            stack.pop();
                            answer +=2;
                        }else{
                            stack.push(tmp);
                        }

                        break;
                    }


            }
        }

        return answer;

    }


    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();
        int[][] arr = new int[n][n];

        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=s.nextInt();

            }
        }


        int[] movesArr = new int[s.nextInt()];


        for(int k=0; k<movesArr.length; k++){
            movesArr[k]=s.nextInt();
        }

        Main43 main43 = new Main43();
        System.out.println(main43.solution(arr,movesArr));
    }
}
