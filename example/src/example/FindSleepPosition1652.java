package code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSleepPosition1652 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int matrix = Integer.parseInt(br.readLine());
			
			// Initialize
			char[][] map = new char[matrix][matrix];
			for(int i = 0 ; i < matrix ; i++) {
				String line = br.readLine();
				char[] c = line.toCharArray();
				for(int j = 0 ; j < matrix ; j++) {
					map[i][j] = c[j];
				}
			}
			
			int X = 0, Y = 0;
			boolean refresh = true;
			for(int i = 0 ; i < matrix ; i++) {
				for(int j = 0 ; j < matrix ; j++) {
					if(map[i][j] == '.' && j < matrix-1 && refresh==true) {
						if(map[i][j+1] == '.') {
							X++;
							refresh = false;
						}
					}else if(map[i][j] == 'X' && j<matrix-1) {
						refresh = true;
					}
				}
				refresh = true;
			}
			
			refresh = true;
			for(int i = 0 ; i < matrix ; i++) {
				for(int j = 0 ; j < matrix ; j++) {
					if(map[j][i] == '.' && j < matrix-1 && refresh== true) {
						if(map[j+1][i] == '.') {
							Y++;
							refresh = false;
						}
					}else if(map[j][i] == 'X' && j<matrix-1) {
						refresh = true;
					}
				}
				refresh = true;
			}
			
			System.out.println(X + " " + Y);

		} catch (IOException e) {

		}

	}

}
