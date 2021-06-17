package programmers.example.devmatching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TheBestRankAndTheLowestOfLotto {

	public static void main(String[] args) {

		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		
		int[] answer = solution(lottos, win_nums);
		
		for(int a : answer) {
			System.out.print(a);
			System.out.print(",");
			
		}
		System.out.println("");;
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6, 6};
        int[] rank = {1,2,3,4,5,6,6};
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        List<Integer> winNumList = new ArrayList<Integer>();

        for(int i = 0 ; i < lottos.length ; i++) {
        	queue.offer(lottos[i]);
        	winNumList.add(win_nums[i]);
        }

        while(queue.size() > 0) {
        	Integer value = queue.poll();
        	
        	if(value == 0) {
        		answer[0]--;
        		continue;
        	}
        	
        	if(winNumList.contains(value)) {
        		answer[0]--;
        		answer[1]--;
        	}
        	
        }
        answer[0] = rank[answer[0]];
        answer[1] = rank[answer[1]];
        
        return answer;
    }

}
