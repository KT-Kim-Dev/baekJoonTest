package programmers.example.dfsbfs;

public class TargetNumber {

	public static void main(String[] args) {

		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;

		int answer = solution(numbers, target);

		System.out.println(answer);

	}

	public static int solution(int[] numbers, int target) {
		int answer = 0;

		answer = getSame(numbers, 0, 0, target);

		return answer;
	}

	public static int getSame(int[] numbers, int position, int sum, int target) {
		int result = 0;

		if (position == numbers.length) {
			if (sum == target)
				return 1;
			else
				return 0;
		}

		return getSame(numbers, position + 1, sum + numbers[position], target)
				+ getSame(numbers, position + 1, sum - numbers[position], target);

	}

}
