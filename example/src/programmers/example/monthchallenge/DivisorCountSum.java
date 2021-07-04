package programmers.example.monthchallenge;

public class DivisorCountSum {

	public static void main(String[] args) {

		int left = 4;
		int right = 4;
		
		int answer = solution(left, right);
		
		System.out.println(answer);
		
	}
	public static int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left ; i <= right ; i++) {
        	int A = getCountDivisor(i);
        	
        	if(A%2 == 0)
        		answer += i;
        	else
        		answer -= i;
        }
        
        return answer;
    }
	
	public static int getCountDivisor(int N) {
		int result = 0;
		
		if(N == 1)
			return 1;
		else if(N == 2)
			return 2;
		else if(N == 4)
			return 3;
		
		for(int i = 1 ; i < N/2 ; i++) {
			
			if(N%i == 0) {
				if(N == i*i)
					result ++;
				else
					result = result + 2;
			}
			
		}
		
		
		return result;
	}
}
