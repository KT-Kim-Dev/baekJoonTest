package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery2839 {
	/**
	 * 3x+5y = value
	 * 
	 * answer = x+y
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int sugar = Integer.parseInt(br.readLine());
			int answer = -1;
			int x = sugar / 5;
			for (int i = x; i >= 0; i--) {
				if (i != 0) {
					int y = sugar - (5*i);
					int k = y % 3;
					if (k == 0) {
						answer = i + (y / 3);
						break;
					}
				}else {
					int k = sugar %3;
					if(k == 0) {
						answer = sugar/3;
						break;
					}
				}
			}
			System.out.println(answer);
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
