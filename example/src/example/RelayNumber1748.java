package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RelayNumber1748 {

	public static long[] NINES = {9, 90, 900, 9000, 90000, 900000, 9000000, 90000000};
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
//			long N = Long.parseLong(str);
			
//			long answer = originRelayNum(N);
			
			bw.write(""+relayNumber(str));
			bw.newLine();
			bw.flush();
		}catch(IOException e ) {
			
		}
	}
	
	public static long relayNumber(String S) {
		long answer = 0;
		long N = Long.parseLong(S);
		int length = S.length();
		
		if(N < 10)
			return N;
		
		for(int i = 1 ; i < length ; i++) {
			N = N - NINES[i-1];
			answer = answer + NINES[i-1]*i;
		}
		
		answer = answer + N*length;
		
		return answer;
	}
	
	
	public static long originRelayNum(long N) {
		long answer = 0;
		String str = "";
		for(long l = 1 ; l <= N ; l++) {
			str = str+l;
		}
		answer = str.length();
		return answer;
	}

}
