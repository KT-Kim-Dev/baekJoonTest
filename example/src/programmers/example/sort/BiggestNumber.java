package programmers.example.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class BiggestNumber {

	public static void main(String[] args) {
		int[][] quiz = {
				{ 6, 10, 2 },
				{ 3, 30, 34, 5, 9 },
				{ 10, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},	// 987654321101000
				{ 151, 15 },	// 15151
				{ 412, 41 },	// 41412
				{ 303, 30 },	// 30330
				{1, 11, 111, 1111},	
				{10, 101},			//10110
				{110, 10},			//11010
//				{ 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000},
		};

		String[] answers = {
				"6210", 
				"9534330", 
				"987654321101000",
				"15151",
				"41412",
				"30330",
				"1111111111",
				"10110",
				"11010",
				
		};
		
		for (int i = 0; i < quiz.length; i++) {
			String answer = solution(quiz[i]);
			System.out.println(answer + " vs " + answers[i] + " : " + answer.equals(answers[i]));
		}

	}

//	List<Integer> list = new ArrayList<>();

	public static String solution(int[] numbers) {
		String answer = "";

		answer = solution1(numbers);

		return answer;
	}

	public static String solution1(int[] numbers) {
		String answer = "";

		Arrays.sort(numbers);

		// Initialize
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i])
				max = numbers[i];
			map.put(i, numbers[i]);
		}

		if (max == 0)
			return "0";

		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				int A = o1.getValue();
				int B = o2.getValue();
				String C = String.valueOf(A);
				String D = String.valueOf(B);
				return (D+C).compareTo(C+D);
			};
		});

		for (Entry<Integer, Integer> entry : list) {
			int value = entry.getKey();
			answer += String.valueOf(numbers[value]);
		}

		return answer;
	}

	public static long getPowedCnt(int A, int B) {
		if (A == 0)
			return 0;

		long C = (long) Math.pow((double) 10, (double) B);
		long D = A;
		while (String.valueOf(D).length() < String.valueOf(C).length()) {
			D = D * 10;
		}

		return (D);
	}

}
