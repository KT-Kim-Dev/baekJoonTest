package programmers.example.kakao;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FailureRating {

	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		
		int[] answer = solution(N, stages);
		
		for(int a : answer) {
			System.out.print(" "+a);
		}
	}

	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		
		Arrays.sort(stages);
		
		Map<Integer, Double> map = new HashMap<Integer, Double>();
		
		for(int i = 0 ; i < N ; i++) {
			int A = i+1;
			int B = 0;
			int C = 0;
			
			for(int j = 0; j < stages.length ; j++) {
				if(stages[j] == A) {
					B++;
					C++;
				}else if(stages[j] > A) {
					C++;
				}
			}
			map.put(A, (double)B/C);
		}
		List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(map.entrySet());
		
		entryList.sort(new Comparator<Map.Entry<Integer, Double>>() {
		    @Override
		    public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
			return (int)(o2.getValue()*100 - o1.getValue()*100);
		    }
		});
		
		
		for(int i = 0 ; i < entryList.size() ; i++) {
			Map.Entry<Integer, Double> entry = entryList.get(i);
			answer[i] = entry.getKey();
		}
		
		
		return answer;
	}
}
