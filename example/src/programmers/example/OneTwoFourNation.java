package programmers.example;

public class OneTwoFourNation {

	public static void main(String[] args) {

		int n = 3;
		for (int i = 1; i < 100; i++) {
			String answer = solution(i);

			System.out.println(i + " ----> " + answer);
		}

	}

	public static String solution(int n) {
		String answer = "";

		int A = 3;
		int B = 0;
		int C = 0;

		while (n >= (C += Math.pow(A, B))) {
			B++;
		}

		for (int i = B - 1; i > -1; i--) {
			int D = (int) Math.pow(A, i);

			int E = n / D;
			n = n % D;

			if (E == 3 || E == 0) {
				answer += "4";
			} else {
				answer += "" + E;
			}

		}

		return answer;
	}
}
