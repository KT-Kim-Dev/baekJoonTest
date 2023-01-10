package programmers.example.levelTwo;

public class LongJump {

    public static void main(String[] args) {
        int n = 5;
        
        long result = solution(n);

        System.out.println("result : " + result);
    }
    
    public static long solution(int n) {
        long[] arr = new long[n+1];
        
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;

        arr[0] = 1;
        arr[1] = 1;
        
        for(int i = 2 ; i <= n ; i++) {
            arr[i] = (arr[i-2] + arr[i-1])%1234567;
        }
        
        return arr[n];
    }
}
