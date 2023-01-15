package programmers.example.levelOne;

import java.util.*;

public class HateSameNumber {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 0, 1, 1 };

        int[] result = solution(arr);
        String s = "[";

        for (int i = 0; i < result.length; i++) {
            s += result[i] + ",";
        }

        s += "]";

        System.out.println(" result : " + s);

    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty())
                stack.push(arr[i]);
            else {
                if (stack.peek() == arr[i])
                    continue;
                stack.push(arr[i]);
            }
        }

        Integer[] iarr = new Integer[stack.size()];

        stack.toArray(iarr);

        int[] answer = new int[iarr.length];
        for (int i = 0; i < iarr.length; i++) {
            answer[i] = iarr[i];
        }

        return answer;
    }

}
