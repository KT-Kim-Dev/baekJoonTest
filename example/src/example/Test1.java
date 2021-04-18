package example;

import java.util.HashMap;

public class Test1 {

	public static String num = "417725841";
	public static int k = 4;
	
	public static void main(String[] args) {
		
		System.out.println(solution(num, k));
	}
	
	public static String solution(String num, int k) {
		String answer ="";
		int j = k;
		int l = 0;
		if(k == 0) {
			return "";
		}
		char[] arrchr = num.toCharArray();
		int value = 0, position = 0;
		for(int i = l ; i < num.length()-j ; i++) {
			int n = Integer.parseInt(String.valueOf(arrchr[i]));
			if( n > value ) {
				value = n;
				position = i;
			}
		}
		answer = String.valueOf(arrchr[position]);
		answer += getString(num.substring(position), k-position);
		return answer;
	}
	
	public static String getString(String str, int remain) {
		String result = "";
		char[] arr = str.toCharArray();
		int min = 9;
		int position = -1;
		if(remain == 0)
			return "";
		
		for(int i = 0 ; i < arr.length ; i++) {
			int value = Integer.parseInt(String.valueOf(arr[i]));
			if(min > value) {
				min = value;
				position = i;
			}
		}
		
		result = str.substring(0, position)+str.substring(position+1, str.length());
		
		return getString(result, remain-1);
	}
}
