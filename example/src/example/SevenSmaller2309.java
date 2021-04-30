package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class SevenSmaller2309 {
	
	private static int MAX_TALL = 100;

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		try {
			int SUM = 0;
			
			// Initialize
			for(int i = 0 ; i < 9 ; i++) {
				int key = Integer.parseInt(br.readLine());
				array.add(key);
				SUM += key;
			}
			
			for(int i = 0 ; i < 8 ; i++) {
				for(int j = i+1 ; j < 9 ; j++) {
					if((SUM - (array.get(i) + array.get(j))) == MAX_TALL){
						array.remove(array.get(j));
						array.remove(array.get(i));
						
						break;
					}
				}
				if(array.size() == 7)
					break;
			}
			
			Object[] answers = array.toArray();
			Arrays.sort(answers);

			for(Object o : answers) {
				bw.write(String.valueOf(o));
				bw.newLine();
			}
			bw.flush();
		}catch(IOException e) {
		}
	}
}
