package main.java.algorithm.package1;

//9
//숫자만 추출

public class NumberSearch {

    public int solution(String s){
        int answer=0;

        for(char c : s.toCharArray()){
            if(c >= 48 && c <= 57 ){
              answer = answer * 10 +(c-48);
                System.out.println(answer);
            }
        }
        return answer;
    }

    public int solution1(String s){
        int a =0;

        for(char x :s.toCharArray()){
            if(Character.isDigit(x)){
                a = a * 10 + (x-48);
            }
        }
        return a;
    }

    public int solution2(String s){
           StringBuilder sb = new StringBuilder();

            for(char x :s.toCharArray()){
                if(Character.isDigit(x)){
                    sb.append(x);
                }
            }
            return Integer.parseInt(sb.toString());
        }

    public static void main(String[] args) {
        NumberSearch ns = new NumberSearch();
       // System.out.println(ns.solution("0023002343"));
       // System.out.println(ns.solution1("0023002343"));
        System.out.println(ns.solution2("0023002343"));

    }
}
