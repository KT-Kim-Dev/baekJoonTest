package programmers.example;

import java.util.HashMap;

public class Phoneketmon {

	public static void main(String[] args) {
		int [] nums = {3,1,2,3};
		System.out.println(solution(nums));
	}

	
	public static int solution(int[] nums) {
        int answer = 0;
        int cnt = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0 ; i < nums.length ; i++) {
        	map.put(nums[i], i);
        	
        }
        
        cnt = cnt/2;
        
        if(map.size() < cnt) {
        	answer = map.size();
        }else {
        	answer = cnt;
        }
        
        return answer;
    }
}
