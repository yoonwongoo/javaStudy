package main.java.algorithm.package3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

//26
//공통원소 구하기(Two pointers algorithm)
public class Main26 {



    public List<Integer> solution(int[] arr1, int[] arr2) throws IOException {
        List<Integer> answerList = new ArrayList<>();
        int p1 = 0, p2 = 0; //point
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < arr1.length && p2 < arr2.length) {

            if (arr1[p1] == arr2[p2]) { //같으면 같이 상승
                answerList.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) { //한쪽이 작으면 작은거는 이제 중복이 될 수가 없으니까 작은쪽을 올리자
                p1++;
            } else p2++;


        }
        return answerList;

    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr1 = new int[Integer.parseInt(br.readLine())];


        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i< arr1.length; i++){

            arr1[i]=Integer.parseInt(st.nextToken());
        }

        int[] arr2 = new int[Integer.parseInt(br.readLine())];


        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i< arr2.length; i++){

            arr2[i]=Integer.parseInt(st.nextToken());
        }

        Main26 main26 = new Main26();
        main26.solution(arr1,arr2).forEach(c->{
            System.out.print(c+" ");
        });
    }


}
