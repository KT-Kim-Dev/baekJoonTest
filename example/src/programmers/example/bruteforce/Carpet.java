package programmers.example.bruteforce;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
		
		// a * b = brown + yellow
		// (a-2) * (b-2) = yellow
		// a * b - brown = yellow
		// (a*b) - ((a-2) * (b-2)) = brown
		
		int sum = brown + yellow;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 1 ; i*i <= sum ; i++) {
			if(sum%i == 0) {
				map.put(i, sum/i);
			}
		}
		
		
		Set<Integer> keys = map.keySet();
		
		Iterator<Integer> iter =  keys.iterator();
		
		while(iter.hasNext()) {
			int A = iter.next();
			int B = map.get(A);
			if(((A-2) * (B-2)) == yellow) {
				answer[0] = A >= B ? A : B;
				answer[1] = A < B ? A : B;
			}
		}

		return answer;
	}
	
	
	
}
