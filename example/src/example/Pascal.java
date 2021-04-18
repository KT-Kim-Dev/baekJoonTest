package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pascal {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String strT = br.readLine();
			int loop = Integer.parseInt(strT);
			
			for(int i = 0 ; i < loop ; i++) {
				String str = br.readLine(); 
				String[] splits = str.split(" ");
				
				int start = Integer.parseInt(splits[0]);
				int end = Integer.parseInt(splits[1]);
				
				int distance = 0;
				int count = 0;
				while(distance < end) {
					distance = 2*distance+1;
					if(distance >= end) {
						count++;
					}
					count++;
				}
				System.out.println(count);
				count = 0;
				distance = 0;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
