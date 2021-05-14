package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * 
 * @author kyoungtaekim
 *
 */



public class NextPermutation10972 {
	public static ArrayList<Integer> ARR = new ArrayList<>();
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			int cnt = Integer.parseInt(br.readLine());
			
			String per = br.readLine();
			String[] nums = per.split(" ");
			
			//Initialize
			
			boolean isEnd = true;
			for(int i = 0 ; i < cnt ; i++) {
				int v = Integer.parseInt(nums[i]);
				ARR.add(v);
				if(ARR.get(i-1) < v)
					isEnd = false;
				
			}
			
			if(isEnd)
				print();
			else {
				
				
				print();
			}
			
		}catch(IOException e) { }
	}

	public static void print() throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0 ; i < ARR.size() ; i++) {
			if(i == ARR.size()-1)
				bw.write(ARR.get(i));
			else
				bw.write(ARR.get(i) + " ");
		}
		bw.flush();
	}
	
}
