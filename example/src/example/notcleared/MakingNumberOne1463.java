package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/**
 * 
 * BAEKJOON judge 1463 (Silver 3)
 * 
 * Making Number One
 * 
 * PROBLUM 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다. X가 3으로 나누어 떨어지면, 3으로 나눈다. X가 2로
 * 나누어 떨어지면, 2로 나눈다. 1을 뺀다. 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을
 * 사용하는 횟수의 최솟값을 출력하시오.
 * 
 * INPUT 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.
 * 
 * OUTPUT 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
 * 
 * 제한시간 0.15초
 * 
 * @author kyoungtaekim
 *
 */

public class MakingNumberOne1463 {

	public static HashMap<Long, Long> HASHMAP = new HashMap<Long, Long>();

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			long X = Long.parseLong(br.readLine());
//			for(long X = 1 ; X <= 1000000 ; X++) {
			long answer = makingNumOne(X);
//			bw.write(X + "   " + answer);
			bw.write(""+answer);
//			bw.newLine();
			bw.flush();
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static long makingNumOne(long X) {
		long answer = 0;

		if (X == 1)
			return 0;

		if (HASHMAP.containsKey(X)) {
			return HASHMAP.get(X);
		}

		if (X % 6 == 0) {
			long A = 1 + makingNumOne(X / 3);
			long B = 1 + makingNumOne(X / 2);
			long C = 1 + makingNumOne(X - 1);
			if (A > B && C > B) {
				if (HASHMAP.containsKey(X)) {
					return HASHMAP.get(X)<B?HASHMAP.get(X):B;
				} else {
				HASHMAP.put(X, B);
				return B;
				}
			} else if (B > A && C > A) {
				if (HASHMAP.containsKey(X)) {
					return HASHMAP.get(X)<A?HASHMAP.get(X):A;
				} else {
				HASHMAP.put(X, A);
				return A;
				}
			} else if (B > C && A > C) {
				if (HASHMAP.containsKey(X)) {
					return HASHMAP.get(X)<C?HASHMAP.get(X):C;
				} else {
				HASHMAP.put(X, C);
				return C;
				}
			}
		} else if (X % 3 == 0) {
			long A = 1 + makingNumOne(X / 3);
			long B = 1 + makingNumOne(X - 1);
			if (A > B) {
				if (HASHMAP.containsKey(X)) {
					return HASHMAP.get(X)<B?HASHMAP.get(X):B;
				} else {
					HASHMAP.put(X, B);
					return B;
				}
			}else {
				if (HASHMAP.containsKey(X)) {
					return HASHMAP.get(X)<A?HASHMAP.get(X):A;
				} else {
					HASHMAP.put(X, A);
					return A;
				}
			}
		} else if (X % 2 == 0) {
			long A = 1 + makingNumOne(X / 2);
			long B = 1 + makingNumOne(X - 1);
			if (A > B) {
				if (HASHMAP.containsKey(X)) {
					return HASHMAP.get(X)<B?HASHMAP.get(X):B;
				} else {
					HASHMAP.put(X, B);
					return B;
				}
			}else {
				if (HASHMAP.containsKey(X)) {
					return HASHMAP.get(X)<A?HASHMAP.get(X):A;
				} else {
					HASHMAP.put(X, A);
					return A;
				}
			}
		}
		
		return 1 + makingNumOne(X - 1);

	}
}
