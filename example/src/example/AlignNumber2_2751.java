package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class AlignNumber2_2751 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int cnt = Integer.parseInt(br.readLine());
			int[] arr = new int[cnt];
			for(int i = 0 ; i < cnt ; i++) {
				int N = Integer.parseInt(br.readLine());
				arr[i] = N;
			}
			
			Arrays.sort(arr);
			
			for(int num : arr) {
				bw.write(""+num);
				bw.newLine();
			}
			
			bw.flush();
		}catch(IOException e) {
		}
	}
}
