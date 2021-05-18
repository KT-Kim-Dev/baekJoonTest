package programmers.example.sort;

import java.util.Arrays;

public class Hindex {

	public static void main(String[] args) {
		int[] B = { 0, 0, 0 };
		int A = solution(B);
		System.out.println(A);
	}

	public static int solution(int[] citations) {
		int answer = citations.length;
		Arrays.sort(citations);
		
		if (citations[citations.length - 1] == 0)
			return 0;

		do {
			int v = getCount(citations, answer);
			if(answer <= v)
				break;
			
			answer--;
		} while (answer != 0);
		return answer;
	}

	public static int getCount(int[] citations, int cnt) {
		int answer = 0;
		for (int i = 0; i < citations.length; i++) {
			if (citations[i] >= cnt)
				answer++;
		}
		return answer;
	}
}
