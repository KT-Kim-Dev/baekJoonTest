package programmers.example.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carpet {
	public static void main(String[] args) {
		int brown = 10;
		int yellow = 2;

		int[] answer = solution(brown, yellow);

		String print = "";
		for (int a : answer) {
			print += " " + a;
		}

		System.out.println(print);

	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = {0, 0};

		int sum = brown + yellow;
		List<Integer> list = new ArrayList<Integer>();


		for(int i = 1 ; i*i <= sum ; i++) {
			if(sum%i == 0) {
				list.add(i);
				list.add(sum/i);
			}
		}
		
		Object[] arr = list.toArray();
		
		Arrays.sort(arr);
		
		if(arr.length % 2 == 0) {
			answer[0] = (int) arr[arr.length/2];
			answer[1] = (int) arr[arr.length/2-1];
		}else {
			answer[0] = (int) arr[arr.length/2];
			answer[1] = (int) arr[0];
		}

		return answer;
	}
	
	
	
}
