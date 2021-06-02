package example.notcleared;

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

	public static int[] ARRAY = null;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int X = Integer.parseInt(br.readLine());
			ARRAY = new int[(int)X+1];
			initialArray(X);
			
			bw.write(""+ARRAY[(int)X]);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialArray(int X) {
		ARRAY[1] = 0;
		
		for(int i = 2 ; i <= X ; i++) {
			ARRAY[i] = ARRAY[i-1] + 1;
			if(i%2==0) {
				ARRAY[i] = ARRAY[i]<(ARRAY[i/2]+1)?ARRAY[i]:(ARRAY[i/2]+1);
			}
			if(i%3==0) {
				ARRAY[i] = ARRAY[i]<(ARRAY[i/3]+1)?ARRAY[i]:(ARRAY[i/3]+1);
			}
			
		}
	}
	
}
