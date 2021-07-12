package programmers.example.kakaointern;

public class NumberStringAndEnglish {

	public static void main(String[] args) {

		String s = "one4seveneight";
		
		int answer = solution(s);
		
		System.out.println(answer);
		
	}

	public static String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	
	
	public static int solution(String s) {
		String str = s;
		
		for(int i = 0 ; i < numbers.length ; i++) {
			str = str.replace(numbers[i], ""+i);
		}
		
		return Integer.parseInt(str);
	}
}
