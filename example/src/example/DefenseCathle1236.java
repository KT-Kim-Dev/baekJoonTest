package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DefenseCathle1236 {
	public static char[][] MAP = null;
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String NM = br.readLine();
			String[] arrNM = NM.split(" ");
			
			int N = Integer.parseInt(arrNM[0]);
			int M = Integer.parseInt(arrNM[1]);
			
			if(N == 0 || M  == 0) {
				System.out.println("0");
				return;
			}
			
			MAP = new char[N][M];
			int CNT = 0;
			// Initialize
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j < M ; j++) {
					MAP[i][j] = '.';
				}
			}
			
			for(int i = 0 ; i < N ; i++) {
				char[] line = br.readLine().toCharArray();
				for(int j = 0 ; j < M ; j++) {
					if(line[j] == 'X') {
						setDefenseField(i, j);
					}
				}
			}
//			printField();
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0 ; j < M ; j++) {
					if(MAP[i][j] == '.') {
						CNT++;
						setDefenseField(i, j);
					}
				}
			}
//			printField();
			
//			if(N >= M) {
				for(int i = 0 ; i < N ; i++) {
					String s = String.valueOf(MAP[i]);
					if(!s.contains("X")) {
						CNT++;
					}
				}
//			}else {
				for(int i = 0 ; i < M ; i++) {
					String s = "";
					for(int j = 0 ; j < N ; j++) {
						s += MAP[j][i];
					}
					
					if(!s.contains("X")) {
						CNT++;
					}
				}
//			}
			
			System.out.println(CNT);
		} catch (IOException e) {

		}

	}
	
	public static void setDefenseField(int x, int y) {
		MAP[x][y] = 'X';
		for(int i = 0 ; i < MAP[0].length ; i++) {
			if(i != y && MAP[x][i] != 'D' && MAP[x][i] != 'X')
			MAP[x][i] = 'D';
		}
		for(int i = 0 ; i < MAP.length ; i++) {
			if(i != x && MAP[i][y] != 'D' && MAP[i][y] != 'X')
			MAP[i][y] = 'D';
		}
	}

	
	public static void printField() throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = 0;
		for(int i = 0 ; i < MAP.length ; i++) {
			for(int j = 0 ; j < MAP[0].length ; j++) {
				if(MAP[i][j] == 'X')
					x++;
				bw.write(MAP[i][j]);
				bw.write(" ");
			}
			bw.newLine();
		}
		bw.flush();
		bw.write(x+"\n");
		bw.flush();
	}
}
