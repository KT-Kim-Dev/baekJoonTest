package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrimeNumber {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String cnt = br.readLine();
			String[] values = br.readLine().split(" ");
			int answer = 0;
			for(String value : values) {
				if(findPrimeNumber(value)) {
					answer++;
				}
			}
			System.out.println(answer);
		} catch (IOException e) {
		}
	}
	
	public static boolean findPrimeNumber(String value) {
		double A = Math.sqrt((double)Double.parseDouble(value));
		int B = Integer.parseInt(value);
		int p = 2;
		
		if(B==1)
			return false;
		
		while(p <= A) {
			if(B%p==0)
				return false;
			p++;
		}
		return true;
	}
}
