package programmers.example.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//예제 1)
//priorities : [2, 1, 2, 1, 3, 2]
//location : 0
//return : 3
//
//예제 2)
//priorities : [1, 2, 3]
//location : 0
//return : 3
//
//예제 3)
//priorities : [5,4,3,2,1]
//location : 3
//return : 4
//
//예제 4)
//priorities :[9, 9, 9, 9, 9]
//location : 0
//return : 1
//
//예제 5)
//priorities :[1, 1, 3, 2, 1, 4, 1, 1, 3, 1, 1, 1]
//location : 8
//return : 2


public class Printer {
	
	public static void main(String[] args) {
		int[] priorities = {2,2,2,1,3,4};
		int location = 3;
		int answer = solution(priorities, location);
		
		System.out.println(answer);
	}
	
	public static class Document{
		private int originLocation;
		private int priority;
		
		public Document(int originLocation, int priority) {
			this.originLocation = originLocation;
			this.priority = priority;
		}
		
		public int getOriginLocation() {
			return this.originLocation;
		}
		
		public int getPriority() {
			return this.priority;
		}
		
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Document> queue = new LinkedList<Document>();
        PriorityQueue<Integer> prioQueue = new PriorityQueue<>(Collections.reverseOrder());
		
		// Initializing
		for(int i = 0 ; i < priorities.length ; i++) {
			Document doc = new Document(i, priorities[i]);
			prioQueue.offer(priorities[i]);
			queue.offer(doc);
		}
		
		while(true) {
			Document d = queue.peek();
			if(d.getPriority() < prioQueue.peek()) {
				queue.offer(queue.poll());
			}else {
				answer++;
				Document doc = queue.poll();
				if(doc.getOriginLocation() == location)
					break;
				prioQueue.poll();
			}
		}
        
        return answer;
    }
	
	
}
