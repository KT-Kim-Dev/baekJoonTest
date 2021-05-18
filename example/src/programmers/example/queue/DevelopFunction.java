package programmers.example.queue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DevelopFunction {

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		int[] answer = solution(progresses, speeds);
		
		for(int i : answer) {
			bw.write("" + i + " ");
		}
		bw.newLine();
		bw.flush();
		}catch(IOException e) {
			
		}
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = null;
		
		int day = 1;
		
		Queue<Integer> progressQueue = new LinkedList<>();
		Queue<Integer> speedQueue = new LinkedList<>();
		
		for(int i = 0 ; i < progresses.length ; i++) {
			progressQueue.add(progresses[i]);
			speedQueue.add(speeds[i]);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		
		while(progressQueue.size() != 0) {
			
			int A = progressQueue.peek();
			int B = speedQueue.peek();
			if(A+(day*B) >= 100) {
				// 가장 앞 Queue 작업 완료
				progressQueue.poll();
				speedQueue.poll();
				count++;
				continue;
			}else {
				if(count != 0)
				list.add(count);
				day++;
				count = 0;
			}
			
		}
		if(count != 0)
			list.add(count);
		answer = new int[list.size()];
		
		for(int i = 0 ; i < list.size() ; i++) {
			answer[i] = list.get(i);
		}
	
		return answer;
	}

}
