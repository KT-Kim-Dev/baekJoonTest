package programmers.example.greedy;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class SportsWear {

	public static void main(String[] args) {
		int n = 10;
		int[] lost = { 5,4,3,2,1 };
		int[] reserve = { 3,1,2,5,4 };
		
		int answer = solution(n, lost, reserve);
		
		System.out.println(answer);
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		
		HashMap<Integer, Integer> students = new HashMap<Integer, Integer>();
		
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		for(int i = 0 ; i < n ; i++) {
			students.put(i, 1);
		}
		for(int i = 0 ; i < reserve.length ; i++) {
			students.put(reserve[i]-1, students.get(reserve[i]-1)+1);
		}
		for(int i = 0 ; i < lost.length ; i++) {
			students.put(lost[i]-1, students.get(lost[i]-1)-1);
		}
		
		Set<Integer> keys = students.keySet();
		
		for(int k : keys) {
			int a = students.get(k);
			if(a == 2) {
				if(k == 0) {
					if(students.get(k+1) < 1) {
						students.put(k+1, students.get(k+1)+1);
						students.put(k, students.get(k)-1);
					}
				}else if(k == n-1) {
					if(students.get(k-1) < 1) {
						students.put(k-1, students.get(k-1)+1);
						students.put(k, students.get(k)-1);
					}
				}else {
					if(students.get(k-1) < 1) {
						students.put(k-1, students.get(k-1)+1);
						students.put(k, students.get(k)-1);
					}else if(students.get(k+1) < 1) {
						students.put(k+1, students.get(k+1)+1);
						students.put(k, students.get(k)-1);
					}
				}
			}
		}
		
		Collection<Integer> collection = students.values();
		
		for(Integer b : collection) {
			if(b >= 1)
				answer++;
		}
		
		return answer;
	}
	

}
