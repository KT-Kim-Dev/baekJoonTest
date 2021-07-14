package programmers.example.summerwinter;

public class FinedRactangle {

	public static void main(String[] args) {

		int w = 5;
		int h = 7;

		long answer = solution(w, h);
		System.out.println(answer);

	}

	public static long solution(int w, int h) {
		long answer = 1;
		int x = h >= w ? h : w;
		int y = h >= w ? w : h;

		int z = getGCD(x, y);
		if(z != 1) {
			x = x/z;
			y = y/z;
			
			answer = (w*h) - ((x*y)-solution(x,y))*z;
		}else {
			float f = (float)x/y;
			int i = (int)Math.ceil(f);
			answer = (x*y) - (i*y);
			if(x%2 == 1 && y%2 == 1)
				answer -= 1;
		}
		
		return answer;
	}
	
	

	public static int getGCD(int A, int B) {
		int C = 1;
		int D = 1;
		if (A < B) {
			int temp = A;
			A = B;
			B = temp;
		}
		for (int i = B; i > 0; i--) {
			if (A % i == 0 && B % i == 0) {
				C *= i;
				D *= i;
				A = A / i;
				B = B / i;
			}
		}
		return C;
	}

}
