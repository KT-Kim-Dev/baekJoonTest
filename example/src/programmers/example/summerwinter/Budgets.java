package programmers.example.summerwinter;

import java.util.Arrays;

public class Budgets {

	public static void main(String[] args) {

		int[] d = { 2, 2, 3, 3 };
		int budget = 10;

		int answer = solution(d, budget);

		System.out.println(answer);

	}

	public static int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);
		int cnt = 0;

		for (int i = 0; i < d.length; i++) {
			int a = d[i];

			if (budget >= cnt + a) {
				cnt += a;
				answer++;
			} else {
				
				break;

			}

		}

		return answer;
	}
}
