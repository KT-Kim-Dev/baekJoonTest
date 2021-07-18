package programmers.example.DynamicPrograming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * N으로 표현하기
 * 
 * 레벨 3 이상의 문제가 될 것 같은 다이나믹 프로그래밍 문제.
 * 
 * 해결 방식 : 숫자 N을 몇번 사용함에 따라 사칙연산에 맞춰서 계산 값을 다 누적하여 매칭시켜봄 
 *
 * @author kyoungtaekim
 *
 */

public class DisplayToUseTheN {

	public static void main(String[] args) {
		int N = 5;
		int number = 12;

		int answer = solution(N, number);
		System.out.println(answer);

	}

	public static int solution(int N, int number) {
		int answer = -1;
		List<Set<Long>> arr = new ArrayList<>();
		arr.add(null);
		arr.add(new HashSet<>());
		arr.get(1).add(new Long(N));

		for (int i = 1; i <= 8; i++) {
			if (i >= 2) {
				arr.add(new HashSet<>());

				StringBuilder num = new StringBuilder();
				for (int j = 0; j < i; j++) {
					num.append(N);
				}
				arr.get(i).add(Long.parseLong(num.toString()));

				for (int j = 1; j < i; j++) {
					for (long k : arr.get(j)) {
						for (long l : arr.get(i - j)) {
							arr.get(i).add(k + l);
							arr.get(i).add(k - l);
							arr.get(i).add(k * l);
							if (l != 0) {
								arr.get(i).add(k / l);
							}
						}
					}
				}
			}

			if (arr.get(i).contains((long) number)) {
				return i;
			}
		}
		return answer;
	}

}
