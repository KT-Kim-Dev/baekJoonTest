package programmers.example.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BiggestNumber {

	public static void main(String[] args) {

		int[][] quiz = { { 6, 10, 2 }, { 3, 30, 34, 5, 9 }, };

		for (int i = 0; i < quiz.length; i++) {
			String answer = solution(quiz[i]);
			System.out.println(answer);
		}

	}

	List<Integer> list = new ArrayList<>();

	public static String solution(int[] numbers) {
		String answer = "";

//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
//		while (true) {
//			long max = 0;
//			for (int i = 0; i < numbers.length; i++) {
//
//				long value = getPowedCnt(numbers[i], 3);
//				if (max < value)
//					max = value;
//
//			}
//		}

		return answer;
	}

	public static long getPowedCnt(int A, int B) {
		String answer = null;

		long C = (long) Math.pow((double) 10, (double) B);
		long D = A;
		while (String.valueOf(D).length() < String.valueOf(C).length()) {
			D = D * 10;
		}

		return (D);
	}

}
