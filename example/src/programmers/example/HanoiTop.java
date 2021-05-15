package programmers.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;

public class HanoiTop {

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			Random r = new Random();

			for (int i = 0; i < 20; i++) {
				int n = r.nextInt(14)+1;
				System.out.println("n : " + n);
				bw.write("[");
				int[][] answer = solution(n);
				
				for(int j = 0 ; j < answer.length ; j++) {
					bw.write("["+answer[j][0]+","+answer[j][1]+"]");
					if(j < answer.length-1)
						bw.write(", ");
					else
						bw.write(" ]");
				}
				bw.newLine();
				bw.flush();
				list.clear();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<int[]> list = new ArrayList<>();

	public static int[][] solution(int n) {
		int[][] answer = null;

		Hanoi(n, 1, 2, 3);

		answer = new int[list.size()][2];

		for (int i = 0; i < list.size(); i++) {
			int[] b = list.get(i);
			answer[i][0] = b[0];
			answer[i][1] = b[1];
		}

		return answer;
	}

	public static void Hanoi(int N, int start, int mid, int to) {
		int[] value = { start, to };
		if (N == 1) {
			list.add(value);
		} else {
			Hanoi(N - 1, start, to, mid);
			list.add(value);
			Hanoi(N - 1, mid, start, to);
		}
	}

}
