package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumOneTwoThree9095 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int cnt = Integer.parseInt(br.readLine());
			for(int i = 0 ; i < cnt ; i++) {
				int N = Integer.parseInt(br.readLine());
				int	S = SUM(N);
				
				bw.write(""+S);
				bw.newLine();
			}
			bw.flush();
		}catch(IOException e) {
		}
	}

	public static int SUM(int root) {
		if(root == 0)
			return 1;
		if(root < 0)
			return 0;
		if(root == 1)
			return SUM(root-1);
		if(root == 2)
			return SUM(root-1)+SUM(root-2);
			
		return SUM(root-1)+SUM(root-2)+SUM(root-3);
	}
}