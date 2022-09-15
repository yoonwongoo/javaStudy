package main.java.algorithm;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


//solution이 더 빠르다
//solution1 299ms , solution 116ms, solution2 338ms
//단어 뒤집기 4
public class WordFlip {


    public String[] solution(String[] strArr) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];

            if (str.length() > 1) {
                for (int j = str.length() - 1; j >= 0; j--) {
                    sb.append(str.charAt(j));
                }
                strArr[i] = String.valueOf(sb);
                sb.setLength(0);//초기화할때 객체를 만드거나 delete를 할 수 있지만 비용과 시간을 줄이기위하여
            }
        }
        return strArr;
    }


    public ArrayList<String> solution1(String[] strArr) {
        ArrayList<String> strList = new ArrayList<>();
        for (String x : strArr) {

            String temp = new StringBuilder(x).reverse().toString();
            strList.add(temp);
        }


        return strList;
    }


    public ArrayList<String> solution2(String[] strArr) {
            ArrayList<String> strList = new ArrayList<>();

            for(String x : strArr){
                char[] c = x.toCharArray();
                int l=0;
                int r=c.length-1;

                while(l<r){
                    char temp = c[l];
                    c[l] = c[r];
                    c[r] =temp;
                    l++;
                    r--;
                }
                String temp = String.valueOf(c);
                strList.add(temp);
            }


            return strList;
        }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int strSize = Integer.parseInt(br.readLine());
        String[] strArr = new String[strSize];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = br.readLine();
        }

        WordFlip wf = new WordFlip();
//        String[] arr = wf.solution(strArr);
//        for(String x : arr){
//            System.out.println(x);
//        }
//        wf.solution1(strArr).forEach((s) -> {
//
//          System.out.println(s.toString());
//        });


        wf.solution2(strArr).forEach(s->{
            System.out.println(s.toString());
        });


    }
}