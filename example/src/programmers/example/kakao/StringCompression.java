package programmers.example.kakao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCompression {

	public static void main(String[] args) {

		String s = "ababcdcdababcdcd";
		
		int answer = solution(s);
		
		System.out.println(answer);
		
	}
	
	public static int solution(String s) {
        int answer = s.length();
        
        for(int i = 2 ; i <= s.length()/2 ; i++) {
        	Map<String, Integer> map = new HashMap<>();
        	
        	for( int j = 0 ; j <= s.length() - i ; j = j+i) {
        		String sub = s.substring(j, j+i);
        		map.put(sub, sub.length());
        	}
        	
        	
        	Set<String> set = map.keySet();
        	Object[] arr = set.toArray();
        	
        	int sum = 0;
        	for(Object key : arr) {
        		sum += map.get(key);
        	}
        	if(answer > sum)
        		answer = sum;
        	
        	map.clear();
        }
        
        
        
        return answer;
    }

}
