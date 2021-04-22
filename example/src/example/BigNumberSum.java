package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BigNumberSum {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> t = new ArrayList<Integer>();
		try {
			String str = br.readLine();
			String[] numbers = str.split(" ");
			
			int lengthA = numbers[0].length()-1;
			int lengthB = numbers[1].length()-1;
			int carry = 0;
			
			while(lengthA >= 0 || lengthB >= 0) {
				int A = lengthA < 0 ? 0 : Integer.parseInt(String.valueOf(numbers[0].charAt(lengthA)));
				int B = lengthB < 0 ? 0 : Integer.parseInt(String.valueOf(numbers[1].charAt(lengthB)));
				int C = A+B+carry;

				t.add(0, C%10);
				carry = C/10;
				
				lengthA--;
				lengthB--;
			}
			if(carry > 0)
				bw.write("1");
			for(Integer a : t) {
				bw.write(String.valueOf(a));
			}
			bw.flush();
		} catch (IOException e) {

		}
	}
}
