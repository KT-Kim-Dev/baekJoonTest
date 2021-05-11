package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * 준규는 N×M 크기의 미로에 갇혀있다. 미로는 1×1크기의 방으로 나누어져 있고, 각 방에는 사탕이 놓여져 있다. 
 * 미로의 가장 왼쪽 윗 방은 (1, 1)이고, 가장 오른쪽 아랫 방은 (N, M)이다.
 * 준규는 현재 (1, 1)에 있고, (N, M)으로 이동하려고 한다. 
 * 준규가 (r, c)에 있으면, (r+1, c), (r, c+1), (r+1, c+1)로 이동할 수 있고, 각 방을 방문할 때마다 방에 놓여져있는 사탕을 모두 가져갈 수 있다. 
 * 또, 미로 밖으로 나갈 수는 없다.
 * 준규가 (N, M)으로 이동할 때, 가져올 수 있는 사탕 개수의 최댓값을 구하시오.
 * 
 * @author kyoungtaekim
 *
 */

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
