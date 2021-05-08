package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Factorization11653 {

	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			long N = Long.parseLong(br.readLine());

			// 1<= N <= 10000000
			if (N != 1) {
				if(isPrimeNumber(N)) {
					bw.write(""+N);
					bw.flush();
					return;
				}
				
				int i = 2;
				while(N != 1) {
					if(isPrimeNumber(i))
					{
						if(N%i == 0) {
							bw.write(""+i);
							bw.newLine();
							N = N/i;
							i = 2;
							
							continue;
						}else {
							i++;
						}
					}else {
						i++;
					}
				}
				bw.flush();
			}
		} catch (IOException e) {
		}

	}

	public static boolean isPrimeNumber(long N) {
		double A = Math.sqrt((double) (N));
		long B = N;
		long p = 2;

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
