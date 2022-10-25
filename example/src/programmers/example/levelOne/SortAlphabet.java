package programmers.example.levelOne;

import java.util.Arrays;
import java.util.Collections;

public class SortAlphabet {

    public static void main(String[] args) {
        // String s = "Zbcdefg";
        // String result = solution(s);
        
        int[] answer = {1,2,3,4,5};
        int[] result = solution1(answer);
        
        System.out.print(result);
    }

	public static String solution(String s) {
        String answer = "";

        Integer[] chars = new Integer[s.length()];
        
        for(int i = 0 ; i < s.length() ; i++){
            chars[i] = (int)s.charAt(i);
            // System.out.println("chars["+i+"] : " + chars[i]);
        }

        Arrays.sort(chars, Collections.reverseOrder());

        for(int i = 0 ; i < s.length() ; i++){
            answer += answer + (char)chars[i].intValue();
        }

        return answer;
    }

    static int[] su1 = {1,2,3,4,5};
    static int[] su2 = {2,1,2,3,2,4,2,5};
    static int[] su3 = {3,3,1,1,2,2,4,4,5,5};

    public static int[] solution1(int[] answers) {
        int[] answer = {};
        Integer[] count = {0,0,0};

        for(int i = 0 ; i < answers.length ; i++){
            if(answers[i] == su1[i%su1.length]){
                count[0]++;
            }
            if(answers[i] == su2[i%su2.length]){
                count[1]++;
            }
            if(answers[i] == su3[i%su3.length]){
                count[2]++;
            }
        }

        Arrays.sort(count, Collections.reverseOrder());

        if(count[0]==count[1] && count[0] == count[2]){
            answer = new int[3];
            answer[0] = count[0];
            answer[1] = count[1];
            answer[2] = count[2];
        }else if(count[0] == count[1] && count[0] != count[2]){
            answer = new int[2];
            answer[0] = count[0];
            answer[1] = count[1];
        }else if(count[0] != count[1]){
            answer = new int[1];
            answer[0] = count[0];
        }
        
        return answer;
    }
}
