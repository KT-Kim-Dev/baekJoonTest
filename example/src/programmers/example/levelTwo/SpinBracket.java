package programmers.example.levelTwo;

import java.util.Stack;

public class SpinBracket {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "[](){}";
        int result = solution(s);
        System.out.println("result : " + result);
    }
    
    public static String spinString(String s) {
        String f = s.substring(0, 1);
        String m = s.substring(1, s.length());
        return m+f;
    }
    
    public static boolean checkMatch(char a, char b) {
        if(a == '[' && b == ']')
            return true;
        else if(a == '{' && b == '}')
            return true;
        else if(a == '(' && b == ')')
            return true;
        
        return false;
            
    }
    
    public static boolean checkBracket(String s) {
        boolean result = false;
        
        Stack<Character> stack = new Stack<>();
        
        // Init Stack
        for(int i = 0 ; i < s.length() ; i++) {
            if(stack.size() == 0)
                stack.push(s.charAt(i));
            else {
                char c = stack.peek();
                char d = s.charAt(i);

                if(checkMatch(c, d))
                    stack.pop();
                else
                    stack.push(d);
            }
            
        }
        if(stack.size() == 0)
            return true;
        
        return result;
    }
    
    public static int solution(String s) {
        int answer = 0;
        
        for(int i = 0 ; i < s.length() ; i++) {
            if(checkBracket(s))
                answer++;
            s = spinString(s);
        }
        
        return answer;
    }
    

}
