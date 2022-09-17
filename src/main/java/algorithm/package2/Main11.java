package main.java.algorithm.package2;


//11
//문자열 압축하기
public class Main11 {



    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s += " ";
        int temp = 1;
        for (int i = 0; i < s.length() - 1; i++) {

            if (s.charAt(i) == s.charAt(i + 1)) {
                temp++;
            }else{
                sb.append(s.charAt(i));
                if(temp>1) sb.append(temp);
                temp=1;
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
    String s = "KKHSSRRRR";

        Main11 m11 = new Main11();
        System.out.println(m11.solution(s));
    }
}
