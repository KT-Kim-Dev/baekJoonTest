package boj.function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HanNumbers1065 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String str = br.readLine();
			int N = Integer.parseInt(str);
			
			if(N < 100)
				bw.write("" + N);
			else {
				
				int count = 99;
				for(int i = N ; i > 99 ; i--) {
					
					String[] numbers = String.valueOf(i).split("");
					for(int j = numbers.length - 1 ; j > 1 ; j--) {
						int C = Integer.parseInt(numbers[j]);
						int B = Integer.parseInt(numbers[j-1]);
						int A = Integer.parseInt(numbers[j-2]);
						
						if(isHansu(A, B, C)) {
							count++;
						}
					}
					
				}
				bw.write("" + count);
				
			}
			bw.flush();
			
		}catch(IOException e) {
			
		}
			
	}

	public static boolean isHansu(int A, int B , int C) {
		if(A == 0 && B == 0 && C == 0)
			return false;
		
		if((C-B) == (B-A))
			return true;
		else 
			return false;
		
	}
}
