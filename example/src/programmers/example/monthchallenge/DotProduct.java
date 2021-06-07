package programmers.example.monthchallenge;


/*
 * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. 
 * a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
 * 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
 * 
 * 
 * - 제한 사항
 * a, b의 길이는 1 이상 1,000 이하입니다.
 * a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
 * 
 */

public class DotProduct {
	
	// [1,2,3,4]	[-3,-1,0,2]	 3
	
	public static void main(String[] args) {
		int[] A = {1,2,3,4,};
		int[] B = {-3,-1,0,2};
		
		int answer = solution(A, B);
		
		System.out.println(answer);
	}

	public static int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0 ; i < a.length ; i++) {
        	answer += a[i]*b[i];
        }
        
        
        return answer;
    }
}
