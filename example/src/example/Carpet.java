package example;

import java.util.LinkedList;
import java.util.Queue;

public class Carpet {

	public static void main(String[] args) {
//		solution(10, 2);
		int[] array = { 7, 4, 5, 6 };
		solution(2, 10, array);

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		int full = 0;

		for (int i : truck_weights) {
			while (true) {
				if (q.isEmpty()) {
					q.offer(i);
					full += i;
					answer++;
					break;
				} else if (q.size() == bridge_length) {
					full -= q.poll();
				} else {
					if (full + i > weight) {
						q.offer(0);
						answer++;
					} else {
						q.offer(i);
						full += i;
						answer++;
						break;
					}
				}
			}
		}
		System.out.println("answer:" + answer + bridge_length);
		return answer + bridge_length;
	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int sum = brown + yellow;

		for (int i = sum; i > 0; i--) {

			if (sum % i == 0) {
				int j = sum / i;

				if (((i - 2) * (j - 2)) == yellow) {
					answer[0] = i;
					answer[1] = j;
					break;
				}
			}
		}
		System.out.println("answer 1:" + answer[0] + " 2:" + answer[1]);
		return answer;
	}
}
