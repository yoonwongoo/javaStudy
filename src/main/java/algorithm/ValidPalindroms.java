package main.java.algorithm;


//8
//유효한 펠린드롭
public class ValidPalindroms {


    public String solution(String s){
       String x = s.toUpperCase().replaceAll("[^A-Z]","");

       String sb = new StringBuilder().append(x).reverse().toString();

       if(!x.equals(sb)) return "NO";
       else return "YES";

    }



    public static void main(String[] args) {
        ValidPalindroms vp = new ValidPalindroms();
        System.out.println(vp.solution("found7, time: study; Yduts; emit, 7Dnuof"));
    }
}
