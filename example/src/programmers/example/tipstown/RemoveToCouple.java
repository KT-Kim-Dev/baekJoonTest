package programmers.example.tipstown;

import java.util.Stack;

public class RemoveToCouple {
	
	public static void main(String[] args) {
		String s = "baabaa";
		
		int answer = solution(s);
		
		System.out.println(answer);
	}
	
	public static String[] couples = {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "kk", "ll", "mm", "nn", "oo", "pp",
			"qq", "rr", "ss", "tt", "uu", "vv", "ww", "xx", "yy", "zz"};
	
	public static int solution(String s) {
		if(s.length() % 2 == 1)
			return 0;
		
		Stack<String> stack = new Stack<String>();
		
		String[] strs = s.split("");
		
		int i = 0;
		
		while(true) {
			if(i >= s.length())
				break;
			
			if(stack.size() == 0){
				stack.push(strs[i]);
				i++;
			}
			
			String str = stack.pop();
			
			if(str.equals(strs[i])) {
				i++;
			}else {
				stack.push(str);
				stack.push(strs[i]);
				i++;
			}
		}
		
		if(stack.size() == 0)
			return 1;
		else
			return 0;
		
	}


	
}
