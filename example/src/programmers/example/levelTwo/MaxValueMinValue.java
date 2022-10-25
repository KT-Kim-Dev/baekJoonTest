package programmers.example.levelTwo;

import java.util.Arrays;

public class MaxValueMinValue {

    public static void main(String[] args) {
        String s = "1 2 3 4";
        
        String result = solution(s);
        
        System.out.println(result);

    }

    public static String solution(String s) {
        String answer = "";
        
        
        String[] splits = s.split(" ");
        Integer[] arr = new Integer[splits.length];
        
        for(int i = 0 ; i < splits.length ; i++) {
            arr[i] = Integer.parseInt(splits[i]);
        }
        
        Arrays.sort(arr);
        answer = arr[0] + " " + arr[arr.length-1];
        
        return answer;
    }
    
}
