package example;

import java.util.Collections;
import java.util.PriorityQueue;

public class Prio {
	public static void main(String[] args) {
		String[] array = { "I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333" };
		int[] answer = solution(array);
		System.out.println("["+answer[0]+","+answer[1]+"]");
	}

	public static int[] solution(String[] operations) {
		int[] answer = new int[2];

		PriorityQueue<Integer> prioQueue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> prioQueue2 = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (String operation : operations) {
			String[] command = operation.split(" ");

			if (command[0].equals("I")) {
				prioQueue.offer(Integer.parseInt(command[1]));
				prioQueue2.offer(Integer.parseInt(command[1]));
			} else {
				if(command[1].equals("1")) {
					prioQueue2.poll();
				}else {
					prioQueue.poll();
				}
			}

		}
		if(prioQueue.size() == 0 || prioQueue2.size() == 0 || (prioQueue.peek()==prioQueue2.peek())) {
			answer[0] = 0;
			answer[1] = 0;
		}else {
			answer[0] = prioQueue2.poll();
			answer[1] = prioQueue.poll();
		}
		
		return answer;
	}
}
