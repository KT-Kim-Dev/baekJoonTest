package programmers.example.levelTwo;



public class JadenCase {
	public static void main(String[] args) {
		String input = "3people unFollowed me";
		String answer = solution(input);
		System.out.println(answer);
	}
	public static String solution(String s) {
	    String answer = "";	    
	    int length = s.length();
	    
	    for(int i = 0 ; i < length ; i++) {
	    	char c = s.charAt(i);
	    	if(i == 0 || s.charAt(i-1) == ' ') {
	    		if((c >= 'a' && c <= 'z'))
		    		answer += (char)(c - 32);
	    		else
	    			answer += c;
	    	}else {
	    		if((c >= 'A' && c <= 'Z'))
		    		answer += (char)(c + 32);
		    	else
		    		answer += c;
	    	}
	    	
	    }
	    return answer;
	}
	
}
