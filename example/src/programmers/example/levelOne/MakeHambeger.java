package programmers.example.levelOne;

import java.util.Stack;

public class MakeHambeger {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    static public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        if(ingredient.length < 4)
            return 0;
        
        for(int i = 0 ; i < ingredient.length ; i++) {
            if(stack.isEmpty())
                stack.push(ingredient[i]);
            else {
                if(ingredient[i] == 1 && stack.size() > 2) {
                    int c = stack.pop();
                    int b = stack.pop();
                    int a = stack.pop();
                    
                    if(a == 1 && b == 2 && c == 3) {
                        answer++;
                        continue;
                    }else {
                        stack.push(a);
                        stack.push(b);
                        stack.push(c);               
                    }
                }
                stack.push(ingredient[i]);
            }
        }
        return answer;
    }
}
