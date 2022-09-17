package main.java.algorithm.package1;



//10
//가장 짧은 거리찾기

public class ShortDistance {




    public int[] solution(String s, char c){
        int[] answer = new int[s.length()];
        int p = 1000; //기준점이 없는것의 거리 임시.
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == c){
                p=0;
                answer[i] = p;

            }else{
                p++;
                answer[i]=p;
            }
        }

        for(int j =s.length()-1; j >= 0; j--){
            if(s.charAt(j) ==c){
                p=0;
            }else{
                p++;
//                if(answer[j]>p){
//                    answer[j]=p;
//                }
                answer[j] =Math.min(answer[j],p);
            }
        }
        return answer;
    }


    public static void main(String[] args) {


        ShortDistance sd = new ShortDistance();

        for(int x :sd.solution("sosososer",'s')){
            System.out.print( x +" ");
        }


    }
}
