package programmers.example.queue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

/*
입출력 예
prices	return
[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
입출력 예 설명
1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
*/

public class ValueOfStocks {

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int[] prices = { 1, 2, 3, 2, 3 };

			int[] answer = solution(prices);
			System.out.println(answer);

			bw.write("[");
			for(int a : answer) {
				bw.write(" " + a + ",");
				
			}
			bw.flush();
		} catch (IOException e) {
		}
	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 0; i < prices.length; i++) {
			queue.offer(prices[i]);
		}

		int j = 0;
		while (queue.size() > 0) {
			int a = 0;
			int price = queue.poll();
			Object[] arr = queue.toArray();

			for (int i = 0; i < queue.size(); i++) {
				int b = (int) arr[i];
				if (price <= b) {
					a++;
				} else {
					a++;
					break;
				}

			}

			answer[j] = a;
			j++;
		}

		return answer;
	}
}
