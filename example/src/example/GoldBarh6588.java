package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldBarh6588 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				String V = br.readLine();
				if(V.equals("0"))
					return;
				
				int VV = Integer.parseInt(V);
				int A = 0 ; 
				int B = 0 ; 
				
				for(int i = 3 ; i < VV ; i++) {
					if(findPrimeNumber(i)) {
						int K = VV-i;
						if(findPrimeNumber(K)) {
							A = i;
							B = K;
							break;
						}
					}
				}
				System.out.println(V + " = " + A + " + " + B);
			}
		}catch(IOException e) {
		}
	}

	public static boolean findPrimeNumber(int value) {
		double A = Math.sqrt((double)(value));
		int B = (value);
		int p = 2;
		
		if(B==1)
			return false;
		
		while(p <= A) {
			if(B%p==0)
				return false;
			p++;
		}
		return true;
	}
	
}
