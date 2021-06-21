package programmers.example.monthchallenge;

public class ThreeOpen {
	public static void main(String[] args) {

		int n = 99999999;
		
		int answer = solution(n);
		
		System.out.println(answer);
		
		
	}

	public static int solution(int n) {
        int answer = 0;
        String threeNotation = "";
        
        while(n >= 3) {
        	threeNotation = n%3 + threeNotation;
        	n /= 3;
        }
        threeNotation = n + threeNotation;
        
        char[] arr = threeNotation.toCharArray();
        
        for(int i = 0 ; i < arr.length ; i++) {
        	double d = Math.pow(3, i);
        	answer += (arr[i]-'0') * d;
        }
        
        return answer;
    }
}
