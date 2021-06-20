package programmers.example.kakaointern;

public class PressedKeyPad {

	public static void main(String[] args) {

		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";

		String answer = solution(numbers, hand);
		System.out.println(answer);

	}

	public static int[][] num = { { 3, 1 }, { 0, 0 }, { 0, 1 }, { 0, 2 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 2, 0 },
			{ 2, 1 }, { 2, 2 } };
	public static int[][] pad = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { '*', 0, '#' } };

	public static String solution(int[] numbers, String hand) {
		String answer = "";

		String h = hand.equals("right") ? "R" : "L";

		int leftThumb = '*';
		int rightThumb = '#';

		for (int i = 0; i < numbers.length; i++) {

			int a = numbers[i];

			if (a == 1 || a == 4 || a == 7 || a == '*') {
				answer += "L";
				leftThumb = a;
			} else if (a == 3 || a == 6 || a == 9 || a == '#') {
				answer += "R";
				rightThumb = a;
			} else {
				int l = getCount(leftThumb, a);
				int r = getCount(rightThumb, a);

				if (l > r) {
					answer += "R";
					rightThumb = a;
				} else if (r > l) {
					answer += "L";
					leftThumb = a;
				} else {
					answer += h;
					if (h.equals("R"))
						rightThumb = a;
					else
						leftThumb = a;
				}
			}

		}

		return answer;
	}

	public static int getCount(int thumbPosition, int key) {
		int result = 0;
		int[] position = { 0, 0 };
		int[] keyP = num[key];

		if (thumbPosition == '*') {
			position[0] = 3;
			position[1] = 0;
		} else if (thumbPosition == '#') {
			position[0] = 3;
			position[1] = 2;
		} else {
			position = num[thumbPosition];
		}

		int a = position[0];
		int b = position[1];
		int c = keyP[0];
		int d = keyP[1];
		
		int e = a>c?a-c:c-a;
		int f = b>d?b-d:d-b;
		
		if(e != 0)
			e = e*e/e;
		if(f != 0)
			f = f*f/f;
		result = e+f;

		return result;
	}

}
