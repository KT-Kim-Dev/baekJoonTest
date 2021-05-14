package programmers.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MakingPrimeNumber {

	public static int[] question = {1,2,7,6,4};

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			
//			Random r = new Random();
//			int cnt = r.nextInt(47);
//			cnt += 3;
//			question = new int[cnt];
//			for(int i = 0 ; i < cnt ; i++) {
//				int a = r.nextInt(999);
//			}
			
			
			int answer = solution(question);

			bw.write("" + answer);
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {

		}

	}

	public static int solution(int[] nums) {
		int answer = 0;

		Arrays.sort(nums);
		
		for(int i = 0 ; i < nums.length ; i++) {
			for(int j = i+1 ; j < nums.length ; j++) {
				for(int k = j+1 ; k < nums.length ; k++) {
					if(isPrimeNum(nums[i]+nums[j]+nums[k])) {
						answer++;
					}
				}
			}
		}
		

		return answer;
	}
	
	public static boolean isPrimeNum(int n) {
		
		double A = Math.sqrt((double) (n));
		int B = n;
		int p = 2;

		if (B == 1)
			return false;

		while (p <= A) {
			if (B % p == 0)
				return false;
			p++;
		}
		return true;
		
	}

}
