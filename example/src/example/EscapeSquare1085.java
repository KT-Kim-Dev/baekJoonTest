package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EscapeSquare1085 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String firstLine = br.readLine();
			String[] XYWH = firstLine.split(" ");
			
			int X = Integer.parseInt(XYWH[0]);
			int Y = Integer.parseInt(XYWH[1]);
			int W = Integer.parseInt(XYWH[2]);
			int H = Integer.parseInt(XYWH[3]);
			
			int length = 10000;
			
			length = W-X;
			
			if(length > X)
				length = X;
			
			if(length > (H-Y))
				length = H-Y;
			
			if(length > Y)
				length = Y;
			
			System.out.println(length);
		}catch(IOException e) {
			
		}

	}

}
