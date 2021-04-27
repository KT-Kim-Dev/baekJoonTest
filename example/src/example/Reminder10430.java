package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reminder10430 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] values = br.readLine().split(" ");
			int A = Integer.parseInt(values[0]);
			int B = Integer.parseInt(values[1]);
			int C = Integer.parseInt(values[2]);
			System.out.println((A+B)%C);
			System.out.println(((A%C) + (B%C))%C);
			System.out.println((A*B)%C);
			System.out.println(((A%C) * (B%C))%C);
		}catch(IOException e) {
		}
	}
}
