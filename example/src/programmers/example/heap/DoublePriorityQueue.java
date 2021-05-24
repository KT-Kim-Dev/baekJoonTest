package programmers.example.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class DoublePriorityQueue {

	public static void main(String[] args) {
//		String[] A = {"I 7", "I 5", "I -5", "D -1", "D 1", "D 1"};
//		String[] A = {"I 16", "D 1"};
		String[] A = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
		
		int[] answer = solution(A);
		
		System.out.println("[" + answer[0] + "," + answer[1] + "]");
	}
	
	public static PriorityQueue<Integer> minQueue = new PriorityQueue<>();
	public static PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
	
	public static int[] solution(String[] operations) {
		int[] answer = {0,0};
		
		for(String oper : operations) {
			
			String[] com = oper.split(" ");
			
			if(com[0].contains("I")) {
				int input = Integer.parseInt(com[1]);
					maxQueue.offer(input);
					minQueue.offer(input);
			}else if(com[0].contains("D")) {
				if(minQueue.size() < 1)
					continue;
				
				if(com[1].equals("-1")) {
					// 최솟값 삭제
					int min = minQueue.poll();
					maxQueue.remove(min);
				}else {
					
					// 최댓값 삭제
					int max = maxQueue.poll();
					minQueue.remove(max);
				}
			}
			
		}
		
		if(maxQueue.size() > 0 && minQueue.size() > 0) {
			answer[0] = maxQueue.poll();
			answer[1] = minQueue.poll();
		}
		
		return answer;
	}

}
