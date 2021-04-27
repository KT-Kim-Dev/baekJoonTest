package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD2609 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] values = br.readLine().split(" ");
			int A = Integer.parseInt(values[0]);
			int B = Integer.parseInt(values[1]);
			int C = 1;
			int D = 1;
			if(A<B) {
				int temp = A;
				A = B;
				B = temp;
			}
			for(int i = B ; i > 0 ; i--) {
				if(A%i == 0 && B%i == 0) {
					C *= i;
					D *= i;
					A = A/i;
					B = B/i;
				}
			}
			System.out.println(C);
			System.out.println(D*A*B);
		}catch(IOException e) {
		}
	}
}
