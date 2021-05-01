package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CalulationDate {

	public static final int MAX_EARTH_CYCLE = 15;
	public static final int MAX_SUN_CYCLE = 28;
	public static final int MAX_MOON_CYCLE = 19;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			String[] ESM = str.split(" ");
			
			int EV = Integer.parseInt(ESM[0]);
			int SV = Integer.parseInt(ESM[1]);
			int MV = Integer.parseInt(ESM[2]);
			
			int E = 0;
			int S = 0;
			int M = 0;
			
			int answer = 0;
			
			while(E < 9000) {
				
				if((E%MAX_EARTH_CYCLE+1 == EV) && (S%MAX_SUN_CYCLE+1 == SV) && (M%MAX_MOON_CYCLE+1 == MV))
					break;
				
				E++;
				S++;
				M++;
			}
			
			bw.write(String.valueOf(E+1));
			bw.newLine();
			bw.flush();
		}catch(IOException e ) {
			
		}
		
		
	}

}
