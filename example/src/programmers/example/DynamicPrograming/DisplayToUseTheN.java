package programmers.example.DynamicPrograming;

public class DisplayToUseTheN {

	public static void main(String[] args) {
		int N = 5;
		int number = 12;
		
		int answer = solution(N, number);
		
		System.out.println(answer);
		
	}
	
	public static int[] array = new int[5];
	
	public static int solution(int N, int number) {
        int answer = 8;
        
        array[0] = Integer.parseInt(""+N+N);
        
        int A = getMinCount(N, number, N, 1);
        int B = getMinCount(N, number, Integer.parseInt(""+N+N), 2);
        
        answer = A > B ? B : A;
        
        return answer;
    }
	
	public static int getMinCount(int N, int number, int value, int cnt) {
		int answer = 8;
		
		if(cnt > 8)
			return -1;
		
		if(value == number)
			return cnt;
		
//		int A = getMinCount(N, number, Integer.parseInt(""+value+value), cnt++);
		int B = getMinCount(N, number, value + N, cnt++);
		int C = getMinCount(N, number, value - N, cnt++);
		int D = getMinCount(N, number, value * N, cnt++);
		int E = getMinCount(N, number, value / N, cnt++);
		
//		answer = answer > A ? A : answer;
		answer = answer > B ? B : answer;
		answer = answer > C ? C : answer;
		answer = answer > D ? D : answer;
		answer = answer > E ? E : answer;
		
		return answer;
	}

}
