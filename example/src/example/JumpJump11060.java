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
			
			A = new int[N];
			stepA = new int[N];
		
			for(int i = 0 ; i < N ; i++) {
				A[i] = Integer.parseInt(As[i]);
				stepA[i] = 1111;
			}
			
			stepA[N-1] = 0;
			for(int i = N-2 ; i >= 0 ; i--) {
				int step = A[i];
				for(int j = step ; j >= 0  ; j--) {
					if((j+i) > N-1) {
						stepA[i] = 1+stepA[N-1];
						j=-1;
						continue;
					}
					else {
						if(stepA[i] > 1+stepA[j+i])
							stepA[i] = 1+stepA[j+i];
					}
				}
			}
			int answer = stepA[0]<=10000?stepA[0]:-1;
			bw.write("" + answer);
			bw.flush();
		}catch(IOException e) {}
		
	}
	

}
