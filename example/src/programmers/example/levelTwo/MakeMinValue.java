package programmers.example.levelTwo;

    import java.util.Arrays;
    import java.util.Collections;

public class MakeMinValue {
    public static void main(String[] args) {

        int[] A = { 1, 4, 2 };
        int[] B = { 5, 4, 4 };

        int result = solution(A, B);

        System.out.println("result : " + result);

    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(B);
        Integer[] arr = new Integer[A.length];
        
        for(int i = 0 ; i < A.length ; i++) {
            arr[i] = A[i];
        }
        
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0 ; i < arr.length ; i++) {
            answer += arr[i] * B[i];
        }
        
        return answer;
    }
}
