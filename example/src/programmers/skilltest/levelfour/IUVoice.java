package programmers.skilltest.levelfour;

public class IUVoice {

    public static void main(String[] args) {
        int n = 41;
        
        int result = solution(n);
        
        System.out.println(result);
    }
    
    static public int count(int n, int cnt, int sum) {
        
        sum *= 3;
        
        if(sum > n - 2) {
            return 0;
        }else if(sum == n - 2) {
            return ++cnt;
        }
        
        
        
        
        
        return cnt;
    }
    
    static public int solution(int n) {
        int answer = 0;
        
        answer = count(n, 0, 1);
        
        
        return answer;
    }
}
