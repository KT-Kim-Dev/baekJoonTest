package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class OderbyNumber {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int cnt = Integer.parseInt(str);
			int[] arr = new int[cnt];
			for(int i = 0 ; i < cnt ; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(arr);
			for(int a : arr) {
				System.out.println(a);
			}
		} catch (IOException e) {
		}
	}
}
