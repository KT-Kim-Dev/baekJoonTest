package programmers.example.kakao;

import java.util.Stack;

public class StringCompression {

	public static void main(String[] args) {

		String s = "xababcdcdababcdcd";

		int answer = solution(s);

		System.out.println(answer);

	}

	public static int solution(String s) {
		int answer = s.length();

		for (int i = 1; i <= s.length() / 2; i++) {
			Stack<String> stack = new Stack<>();

			for (int j = 0; j <= s.length(); j = j + i) {
				String sub = null;
				
				if(j+i <= s.length()) {
					sub = s.substring(j, j + i);
					if (stack.size() == 0)
						stack.push(sub);
					else {
						String pop = stack.pop();
						if (sub.equals(pop)) {
							if (stack.size() != 0) {
								String pop2 = stack.pop();
								try {
									int A = Integer.parseInt(pop2);
									A++;
									stack.push(""+A);
									stack.push(sub);
								} catch (NumberFormatException e) {
									stack.push(pop2);
									stack.push("2");
									stack.push(sub);
								}
							}else {
								stack.push("2");
								stack.push(sub);
							}
						} else {
							stack.push(pop);
							stack.push(sub);
						}
					}
				}else {
					sub = s.substring(j, s.length());
					stack.push(sub);
				}
			}

			Object[] arr = stack.toArray();
			String value = "";
			for(Object o : arr) {
				value += o;
			}

//			System.out.println(value);
			if(value.equals(s))
				continue;
			int sum = value.length();
			answer = answer > sum ? sum : answer;
		}

		return answer;
	}

}
