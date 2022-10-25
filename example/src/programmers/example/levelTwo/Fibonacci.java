package programmers.example.levelTwo;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 100000;
        
        int result = solution(n);
        
        System.out.println("result : " + result);
    }
    
    static public int getFibonacci(int cnt, int A, int B) {
        if(cnt <= 0) {
            return A+B;
        }
        return getFibonacci(cnt-1, B, A+B);
    }
    
    static public int solution(int n) {
        int answer = 0;
        answer = getFibonacci(n-2, 0, 1);
        return answer;
    }
}
