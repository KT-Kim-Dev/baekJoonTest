package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Question : 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오. Input : 첫째 줄에 정수
 * N(0 ≤ N ≤ 12)가 주어진다. Output : 첫째 줄에 N!을 출력한다
 * 
 * @author kyoungtaekim
 *
 */

public class Factorial10872 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int value = Integer.parseInt(br.readLine());
			
			System.out.println(factorial(value));
			
		} catch (IOException e) {

		}

	}
	
	public static long factorial(long A) {
		long answer = A;
		
		if(A==0)
			return 1;
		
		return answer * factorial(A-1);
	}

}
