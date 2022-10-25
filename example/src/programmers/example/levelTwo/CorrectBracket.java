package programmers.example.levelTwo;

public class CorrectBracket {

    public static void main(String[] args) {
        String s = "()))((()";
        
        boolean b = solution(s);
        System.out.println(b);
    }

    public static boolean solution(String s) {
//        boolean answer = true;
        
        if(s.length() == 0)
            return false;
        
        char[] arr = s.toCharArray();
        
        if(arr[0] == ')' || arr[arr.length-1] == '(' || arr.length%2 != 0)
            return false;
        
        int open = 0;
        
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == '(')
                open++;
            else
                open--;
            
            if(open < 0)
                return false;
        }
        
        if(open == 0)
            return true;
        else
            return false;
        
        
//        return answer;
    }
    
//    public static boolean solution(String s) {
//        boolean answer = true;
//        
//        if(s.length() == 0)
//            return false;
//        
//        char[] arr = s.toCharArray();
//        
//        if(arr[0] == ')' || arr[arr.length-1] == '(')
//            return false;
//        
//        ArrayList<String> array = new ArrayList<String>();
//        
//        try {
//            for(int i = 0 ; i < arr.length ; i++) {
//                
//                if(arr[i] == '(')
//                    array.add(""+arr[i]);
//                else
//                    array.remove(array.size()-1);
//                
//            }
//        }catch(IndexOutOfBoundsException e) {
//            return false;
//        }
//
//        return answer;
//    }
    
}
