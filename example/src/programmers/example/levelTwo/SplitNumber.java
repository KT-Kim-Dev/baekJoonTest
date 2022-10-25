package programmers.example.levelTwo;

public class SplitNumber {

    public static void main(String[] args) {
        int n = 15;
        
        int result = solution(n);
        System.out.println(result);
        
    }
    
    public static boolean matchSum(int n, int sum, int cNum) {
        if(cNum == 0) return false;
        
        if(sum + cNum > n)
            return false;
        
        if(sum + cNum == n)
            return true;
        
        return matchSum(n, sum+cNum, cNum-1);
    }
    
    public static int solution(int n) {
        int answer = 1;
        int cnt = n%2==1?n/2+1:n/2;
        
        
        for(int i = cnt ; i > 0 ; i--) {
            if(matchSum(n, i, i-1) == true)
                answer++;
        }
        
        return answer;
    }

}
