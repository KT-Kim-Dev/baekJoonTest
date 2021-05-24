package programmers.example.heap;

import java.util.PriorityQueue;

public class DiskController {

	public static void main(String[] args) {
		int[][] jobs = { { 0, 3 }, {0,2}, { 1, 9 }, { 2, 6 }, };
		int answer = solution(jobs);
		System.out.println(answer);
	}

	public static class Program implements Comparable<Program> {
		private int inputTime;
		private int startTime;
		private int runTime;

		public Program(int inputTime, int runTime) {
			this.inputTime = inputTime;
			this.startTime = inputTime;
			this.runTime = runTime;
		}
		public void setInputTime(int time) {
			this.inputTime = time;
		}
		public int getInputTime() {
			return this.inputTime;
		}
		public void setStartTime(int time) {
			this.startTime = time;
		}
		public int getStartTime() {
			return this.startTime;
		}
		public void setRunTime(int time) {
			this.runTime = time;
		}
		public int getRunTime() {
			return  this.runTime - this.inputTime;
		}
		public int getEndTime() {
			return this.startTime + this.runTime;
		}

		@Override
		public int compareTo(Program target) {
			if(this.startTime == target.startTime) {
				if(this.runTime > target.runTime)
					return 1;
				else if(this.runTime < target.runTime)
					return -1;
			}
			else if (this.startTime > target.startTime) {
				return 1;
			}
			else if (this.startTime < target.startTime) {
				return -1;
			}
			return 0;
		}
	}

	
	
	public static int solution(int[][] jobs) {
		int answer = 0;
		PriorityQueue<Program> pQueue = new PriorityQueue<Program>();

		// Initializing
		for (int i = 0; i < jobs.length; i++) {
			Program program = new Program(jobs[i][0], jobs[i][1]);
			pQueue.offer(program);
		}
		
		int tick = 0;
		Program current = null;
		
		while (pQueue.size() != 0) {
			tick++;
			
			if(current == null) {
				current = pQueue.poll();
			}
			
			for(int i = 0 ; i < pQueue.size() ; i++) {
				Program p = pQueue.poll();
				if(current.getEndTime() > p.getStartTime()) {
					p.setStartTime(tick);
					pQueue.offer(p);
				}else {
					pQueue.offer(p);
					break;
				}
			}
			
			if(current.getEndTime() <= tick || pQueue.size() == 0) {
//				System.out.println("inputTime : " + current.inputTime 
//						+ " startTime : " + current.startTime 
//						+ " endTime : " + current.getEndTime()
//						+ " runTime : " + (current.getEndTime() - current.inputTime)
//						);
				answer += (current.getEndTime() - current.inputTime);
				current = null;
			}
			
		}
		
		answer = answer / jobs.length;
		return answer;
	}
	
}
