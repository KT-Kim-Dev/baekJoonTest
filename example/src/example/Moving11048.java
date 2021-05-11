package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Moving11048 {
	
	public static int[][] MATRIX = null;
	public static int[][] NM = null;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String mat = br.readLine();
			String[] XY = mat.split(" ");
			
			int X = Integer.parseInt(XY[0]);
			int Y = Integer.parseInt(XY[1]);
			
			NM = new int[X][Y];
			MATRIX = new int[X][Y];
<<<<<<< Upstream, based on origin/master
			
=======
			// Initialized
>>>>>>> 699be91 BAEKJOON judge modify code
			for(int i = 0 ; i < X ; i++) {
				String line = br.readLine();
				String[] ARR = line.split(" ");
				for(int j = 0 ; j < Y ; j++) {
					NM[i][j] = Integer.parseInt(ARR[j]);
				}
			}
			
			MATRIX[0][0] = NM[0][0];
			
			// Memorizing
			maxCandies(X, Y);
			
			bw.write("" + MATRIX[X-1][Y-1]);
			bw.flush();
		}catch(IOException e) { }
	}

	public static void maxCandies(int N, int M) {
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0; j < M ; j++) {
				if((j>0) && MATRIX[i][j] < (NM[i][j] + MATRIX[i][j-1])) {
					MATRIX[i][j] = NM[i][j] + MATRIX[i][j-1];
				}
				if((i>0) && (j>0) && ( MATRIX[i][j] < (NM[i][j] + MATRIX[i-1][j-1]) )) {
					MATRIX[i][j] = NM[i][j] + MATRIX[i-1][j-1];
				}
				if((i>0) && (MATRIX[i][j] < (NM[i][j] + MATRIX[i-1][j]))) {
					MATRIX[i][j] = NM[i][j] + MATRIX[i-1][j];
				}
			}
		}
		
	}
	
}