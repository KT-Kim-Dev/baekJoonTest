package programmers.example.dfsbfs;

import java.util.Arrays;

public class TargetNumber {

	public static void main(String[] args) {

		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		int answer = solution(numbers, target);
		
		System.out.println(answer);
		
	}
	
	public static int solution(int[] numbers, int target) {
        int answer = 0;

        Arrays.sort(numbers);

        
        
        return answer;
    }
	
	
	public static int getSame(int[] numbers, int position, int sum, int target) {
		int result = 0;
		
		if(position == numbers.length) {
			return 0;
		}else {
			
			int a = sum + numbers[position];
			if(target == a) {
				return 1;
			}else {
				
			}
			
		}
		
		
		return result;
	}

}
