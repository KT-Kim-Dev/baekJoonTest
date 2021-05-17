package programmers.example.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class BiggestNumber {

	public static void main(String[] args) {

		int[][] quiz = { 
//				{ 6, 10, 2 }, 
//				{ 3, 30, 34, 5, 9 }, 
//				{ 0, 0, 0, 0},
				{ 15, 151 },
//				{ 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000},
				};

		for (int i = 0; i < quiz.length; i++) {
			String answer = solution(quiz[i]);
			System.out.println(answer);
		}

	}

	List<Integer> list = new ArrayList<>();

	public static String solution(int[] numbers) {
		String answer = "";

		// Initialize
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(max < numbers[i])
				max = numbers[i];
			long value = getPowedCnt(numbers[i], 3);
			map.put(i, (int) value);
		}

		if(max == 0)
			return "0";
		
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer,Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer,Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			};
		});
		
		for(Entry<Integer, Integer> entry : list) {
			int value = entry.getKey();
			answer += String.valueOf(numbers[value]);
		}
		
		return answer;
	}

	public static long getPowedCnt(int A, int B) {
		String answer = null;

		if(A == 0)
			return 0;
		
		long C = (long) Math.pow((double) 10, (double) B);
		long D = A;
		while (String.valueOf(D).length() < String.valueOf(C).length()) {
			D = D * 10;
		}

		return (D);
	}

}
