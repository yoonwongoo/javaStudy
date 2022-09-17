package main.java.algorithm.package2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main13 {

    public ArrayList<Integer> solution(int[] intArr){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        //ex) 7 3 9 5 6 12
        intList.add(intArr[0]);
        for(int i =0; i<intArr.length-1; i++){
                if(intArr[i] < intArr[i+1]) intList.add(intArr[i+1]);

        }        return intList;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArr = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i = 0; i < intArr.length; i++){
            intArr[i]=Integer.parseInt(st.nextToken());
        }
        Main13 m13 = new Main13();
        m13.solution(intArr).forEach(i->{
            System.out.print(i.toString()+" ");
        });
    }
}
