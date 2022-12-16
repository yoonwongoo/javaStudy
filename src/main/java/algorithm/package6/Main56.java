package main.java.algorithm.package6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//좌표정렬
public class Main56 {

    //기본타입이면 그냥 sort되는데 Custom객체면 overriding해줘야함. 정렬 기준을 모르니까
    public static class Point implements Comparable<Point>{
        private int x;
        private int y;

        Point(int x, int y){
            this.x=x;
            this.y=y;
        }


        @Override
        public int compareTo(Point o) {
            if(x == o.x){
                return y-o.y;
            }else{
                return x-o.x;
            }
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }



    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        List<Point> pointList = new ArrayList<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            pointList.add(new Main56.Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));

        }
        Collections.sort(pointList);

        pointList.forEach(c-> System.out.println(c.x +" "+c.y));


    }
}
