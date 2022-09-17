package main.java.algorithm.package2;


//17
//소수 구하기

public class Main17 {



    public int solution(int x){
        int answer =0;
        int[] check = new int[x+1];
            for(int i=2; i <= x; i++){
                if(check[i] ==0){
                    answer++;
                    for(int j=i; j<=x; j=j+i){
                        check[j]=1;
                    }
                }
            }



        return answer;
    }

    public static void main(String[] args) {

        Main17 m17 = new Main17();
        System.out.print(m17.solution(20));
    }
}






//일단 기본적으로 소수를 만나면 소수의 배수를 다 체크해나가자