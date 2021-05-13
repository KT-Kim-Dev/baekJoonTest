package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JumpJump11060 {
	
	static int[] stepA = null;
	static int[] A = null;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			int N  = Integer.parseInt(br.readLine());
			String An = br.readLine();
			String[] As = An.split(" ");
			
			for(int i = 0 ; i < N ; i++) {
				A[i] = Integer.parseInt(As[i]);
			}
			
			
			
		}catch(IOException e) {}
		
	}

}
