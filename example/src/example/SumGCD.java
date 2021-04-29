package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * Question Name : GCD합 9613
 * Question Contents : 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.
 * 
 * Input : 첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다. 
 * 각 테스트 케이스는 한 줄로 이루어져 있다. 각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다. 
 * 입력으로 주어지는 수는 1,000,000을 넘지 않는다.
 * 
 * Output : 각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.
 * 
 * example
 * 3
 * 4 10 20 30 40
 * 3 7 5 12
 * 3 125 15 25
 * 
 * output
 * 70
 * 3
 * 35
 * 
 * @author kyoungtaekim
 *
 */


public class SumGCD {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			long cnt = Long.parseLong(br.readLine());
			for(long i = 0 ; i < cnt ; i++) {
				String A = br.readLine();
				String[] ARR = A.split(" ");
				long B = Long.parseLong(ARR[0]);
				long SUM = 0;
				
				for(int j = 1 ; j < B ; j++) {
					long C = Long.parseLong(ARR[j]);
					for(int k = j+1 ; k <= B ; k++) {
						long D = Long.parseLong(ARR[k]);
						SUM += getGCD(C, D);
					}
				}
				bw.write(String.valueOf(SUM));
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
		}
	}

	public static long getGCD(long A, long B) {
		if(A>B) {
			if(A%B != 0) {
				return getGCD(B, A%B);
			}else {
				return B;
			}
		}else {
			if(B%A != 0) {
				return getGCD(A, B%A);
			}else {
				return A;
			}
		}
	}
	
}
