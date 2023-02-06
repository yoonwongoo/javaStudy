package main.java.algorithm.package5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*stack queue*/
/*())(()) 괄호의 방식이 올바른가 */
/*올바른 괄호*/
public class Main41 {

    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();


        for(char chars : str.toCharArray()){
            if(chars == '('){
                stack.push(chars);
            }else{
                if(stack.empty()) {
                    return "NO";
                }else{
                        stack.pop();
                    }

                }
            }

        if(stack.empty()){
            return answer;
        }else {
           return "NO";
        }

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Main41 main41 = new Main41();
        System.out.println(main41.solution(br.readLine()));
    }
}
