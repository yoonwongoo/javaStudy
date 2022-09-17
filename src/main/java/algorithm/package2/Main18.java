package main.java.algorithm.package2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//18
//뒤집은소수
public class Main18 {

    public boolean isPrime(int rTemp){
        if(rTemp ==1) return false;
        for(int i =2; i<rTemp; i++){
            if(rTemp % i ==0) return false;//하나라도 나머지가 0이면 안된다.
        }
        return true;
    }





    public List<Integer> solution(int[] arr){
        List<Integer> answer = new ArrayList<>();
        for(int  i =0; i<arr.length; i++){
            int temp= arr[i];
            int rTemp= 0;

            while(temp>0){
                int t = temp%10;//1의자리 추출.
                rTemp = rTemp*10+t;
                temp = temp/10;
            }

            if(isPrime(rTemp)) answer.add(rTemp);

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] intArr = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i =0; i<intArr.length; i++){
            intArr[i]=Integer.parseInt(st.nextToken());
        }
        Main18 m18 = new Main18();
        m18.solution(intArr).forEach(a->{
            System.out.print(a+" ");
        });
    }
}
