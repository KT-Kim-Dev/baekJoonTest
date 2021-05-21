package programmers.example.bruteforce;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class PrecticeTest {

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int[] quiz = { 1, 3, 2, 4, 2 };
			int[] answer = solution(quiz);

			for (int i : answer) {
				bw.write(" " + i);
			}
			bw.newLine();
			bw.flush();

		} catch (IOException e) {
		}

	}

	public static class human {
		private int num;
		private int point;

		public human(int num, int point) {
			this.num = num;
			this.point = point;
		}

		public int getNum() {
			return this.num;
		}

		public int getPoint() {
			return this.point;
		}
	}

	public static int[] solution(int[] answers) {
		int[] answer = { 0, 0, 0 };

		int[] A = { 1, 2, 3, 4, 5 };
		int[] B = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] C = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		for (int i = 0; i < answers.length; i++) {
			answer[0] = answers[i] == A[i % A.length] ? answer[0] + 1 : answer[0];
			answer[1] = answers[i] == B[i % B.length] ? answer[1] + 1 : answer[1];
			answer[2] = answers[i] == C[i % C.length] ? answer[2] + 1 : answer[2];
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < answer.length; i++) {
			map.put(i + 1, answer[i]);
		}

		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue());

		List<Integer> ranking = new ArrayList<Integer>();
		int max = 0;
		for (int i = list.size() - 1; i >= 0; i--) {
			Entry<Integer, Integer> entry = list.get(i);
			if (i == list.size() - 1) {
				ranking.add(entry.getKey());
				max = entry.getValue();
			}else {
				if(max == entry.getValue())
					ranking.add(entry.getKey());
			}
		}
		
		int[] z = new int[ranking.size()];
		for(int i = 0 ; i < z.length ; i++) {
			z[i] = ranking.get(i);
		}
		Arrays.sort(z);
		return z;
	}

}
