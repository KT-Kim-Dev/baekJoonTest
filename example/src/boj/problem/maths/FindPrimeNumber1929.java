package boj.problem.maths;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FindPrimeNumber1929 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			
			String[] MN = str.split(" ");
			
			int M = Integer.parseInt(MN[0]);
			int N = Integer.parseInt(MN[1]);
			
			for(int i = M ; i <= N ; i++) {
				if(isPrimeNumber(i)) {
					bw.write("" + i);
					bw.newLine();
				}
			}
			bw.flush();
		}catch(IOException e) {}
	}
	
	public static boolean isPrimeNumber(int value) {
		double A = Math.sqrt((double) (value));
		int B = value, p=2;
		if (B == 1 || B == 0)	return false;
		while (p <= A) {
			if (B % p == 0)	return false;
			p++;
		}
		return true;
	}
}
