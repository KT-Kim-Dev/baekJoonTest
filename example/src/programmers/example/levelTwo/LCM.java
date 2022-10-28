package programmers.example.levelTwo;

public class LCM {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3};
        int result = solution(arr);
        System.out.println("result : " + result);
    }
    
    static public int solution(int[] arr) {
        int answer = 0;
        
        int A = arr[0];
        int B = 0;
        
        for(int i = 1 ; i < arr.length ; i++) {
            B = arr[i];
            A = getGCD(A, B);
        }
        answer = A;
        return answer;
    }
    
    static public int getGCD(int A, int B) {
        int C = 1;
        int D = 1;
        
        if(A<B) {
            int temp = A;
            A = B;
            B = temp;
        }
        for(int i = B ; i > 0 ; i--) {
            if(A%i == 0 && B%i == 0) {
                C *= i;
                D *= i;
                A = A/i;
                B = B/i;
            }
        }
        return (A*B*D);
    }

}
