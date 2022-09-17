package main.java.algorithm.package1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//뒤집기 문제는 lp이나 rp이나 StringBuilder를 이용하자
//5
//특정문자뒤집기
public class SpecificWordFlip {


    public String solution(String s) {
        char[] c = s.toCharArray();
        int lp = 0;
        int rp = c.length - 1;

        while (lp <= rp) {
            if (!Character.isAlphabetic(c[lp])) lp++;
            else if (!Character.isAlphabetic(c[rp])) rp--;
            else {
                char temp = c[lp];
                c[lp] = c[rp];
                c[rp] = temp;
                lp++;
                rp--;
            }


        }
        String x = String.valueOf(c);
                  return x;
    }




        public static void main (String[]args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //String s=  "a#b!GE*T@S";

            SpecificWordFlip swf = new SpecificWordFlip();
            System.out.println(swf.solution(br.readLine()));

        }
    }
