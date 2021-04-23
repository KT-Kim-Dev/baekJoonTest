package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlyMeToTheAlphaCentauri1011 {
	private static int mDistanse = 0;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int cnt = Integer.parseInt(br.readLine());
			int answer = 0;
			
			
			for(int i = 0 ; i < cnt ; i++) {
				String[] values = br.readLine().split(" ");
				
				int positionA = Integer.parseInt(values[0]);
				int positionB = Integer.parseInt(values[1]);
				
				mDistanse = positionB - positionA;
				
				if(mDistanse == 1) {
					answer = 1;
				}else if(mDistanse == 2) {
					answer = 2;
				}else if(mDistanse == 3) {
					answer = 3;
				}else if(mDistanse == 4) {
					answer = 3;
				}else {
					int rocketP = 0;
					int availableLength = 0;
					
					while(rocketP != mDistanse) {
						if(availableLength == 0) {
							availableLength++;
							rocketP += availableLength;
						}else {
							int l = nextLength(availableLength, rocketP);
							availableLength = availableLength + l;
							rocketP += availableLength;
						}
						answer++;
					}
				}
				System.out.println(answer);
				answer = 0;
			}
		}catch(IOException e) {
			
		}
		
	}

	private static int nextLength(int A, int position) {
		int result = 0;
		if(A == 0) {
			
		}else if( sum(A+1) <= mDistanse - position) {
			result = 1;
		}else if( sum(A) > mDistanse - position) {
			result = -1;
		}
		
		return result;		
	}
	
	
	private static int sum(int A) {
		int result = 0;
		
		while(A>0) {
			result+=A;
			A--;
		}
		
		return result;
	}
	
}
