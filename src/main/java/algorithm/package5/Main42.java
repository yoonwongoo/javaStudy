package main.java.algorithm.package5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/*괄호문자제거*/
/*()ASD()ASD(ASDASD) -> ASDASD 출력*/
public class Main42 {


    public List<Character> solution(String str){

        Stack<Character> stack = new Stack<>();

        for(char chr: str.toCharArray()){

            if(chr==')'&& !stack.empty()){
                while(stack.pop()!='(');

            }else{
                stack.push(chr);
            }
        }
        return stack.stream().collect(Collectors.toList());
    }


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Main42 main42 = new Main42();
        main42.solution(br.readLine()).forEach(character -> System.out.print(character.toString()));


    }
}
