package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACMHotel {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String strT = br.readLine();
			int loop = Integer.parseInt(strT);
			for (int i = 0; i < loop; i++) {
				String str = br.readLine();
				String[] splits = str.split(" ");
				int H = Integer.parseInt(splits[0]);
				int W = Integer.parseInt(splits[1]);
				int N = Integer.parseInt(splits[2]);
				int A = 0;
				int B = 0;
				
				if((N%H) == 0) {
					A = H;
					B = (N / H);
				}else {
					A = (N%H);
					B = (N/H) + 1;
				}
				
				System.out.println(A+String.format("%02d", B));
			}
		} catch (IOException e) {
		}
	}
}
