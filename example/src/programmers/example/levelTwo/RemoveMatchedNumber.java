package programmers.example.levelTwo;

import java.util.ArrayList;
import java.util.Stack;

public class RemoveMatchedNumber {

    public static void main(String[] args) {
        String s = "ababababababababababccccbabababababababababacfddfddfddfdd";
        
        int result = solution(s);
        
        System.out.println("result : " + result);
    }
    
//    static public int solution(String s) {
//        Stack<Integer> stack = new Stack<Integer>();
//        ArrayList<Integer> temp = new ArrayList<Integer>();
//        
//        char[] chars = s.toCharArray();
//        
//        for(int i = chars.length-1 ; i >= 0 ; i--)
//            stack.push((int) chars[i]);
//        
//        while(stack.size() > 0) {
//            if(temp.size() == 0)
//                temp.add(stack.pop());
//            else {
//                if(temp.get(temp.size()-1) == stack.peek()) {
//                    temp.remove(temp.size()-1);
//                    stack.pop();
//                }else {
//                    temp.add(stack.pop());
//                }
//            }
//        }
//        
//        if(temp.size() == 0)
//            return 1;
//        else
//            return 0;
//        
//    }
  
    static public int solution(String s) {
//        int answer = 0;
    Stack<Character> stack = new Stack<>();

    for(char c : s.toCharArray()){
        if(stack.size() == 0){
            stack.push(c);
        }
        else if(stack.peek() == c){
            stack.pop();
        }
        else{
            stack.push(c);
        }
    }


    return stack.size() > 0 ? 0 : 1;
    }

}
