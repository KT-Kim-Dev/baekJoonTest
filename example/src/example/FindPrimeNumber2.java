package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrimeNumber2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int M = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			
			int minPrimeNumber = -1;
			long sumPrimeNumber = 0;
				
			for(int i = M ; i <= N ; i++) {
				if(findPrimeNumber(i)) {
					if(minPrimeNumber == -1)
						minPrimeNumber = i;
					sumPrimeNumber += i;
				}
			}
			if(minPrimeNumber == -1)
				System.out.println("-1");
			else {
			System.out.println(sumPrimeNumber);
			System.out.println(minPrimeNumber);
			}
		} catch (IOException e) {
		}
	}

	public static boolean findPrimeNumber(int value) {
		double A = Math.sqrt((double) (value));
		int B = value;
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
