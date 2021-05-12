package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ThueMorseSequence18222 {
	static long[] ARR = new long[64];
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			long X = Long.parseLong(br.readLine());
			
			for(int i = 0 ; i < ARR.length ; i++) {
				ARR[i] = (long)Math.pow(2, i);
			}
			
			
			bw.write(""+solution(X));
			bw.flush();
			
		}catch(IOException e) {
			
		}
	}
	
	public static int solution(long X) {
		if(X == 1) return 0;
		
		long N = 0;
		
		for(int i = 0 ; i < ARR.length ; i++) {
			if(X > ARR[i]) N = ARR[i];
			else break;
		}
		return 1-solution(X-N);
	}

}
