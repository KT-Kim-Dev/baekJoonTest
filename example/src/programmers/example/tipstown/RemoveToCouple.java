package programmers.example.tipstown;

import java.util.ArrayList;
import java.util.List;

public class RemoveToCouple {
	
	public static void main(String[] args) {
		String s = "baabaa";
		
		int answer = solution(s);
		
		System.out.println(answer);
	}
	
	public static int solution(String s)
    {
        int answer = 0;

        boolean isChanged = true;
        List<String> list = new ArrayList<String>();
        
        for(int i = 0 ; i < s.length() ; i++) {
        	list.add(s.substring(i, i+1));
        }
        
        while(isChanged) {
        	String b = list.get(0);
        	
        	for(int i = 1 ; i < list.size() ; i++) {
        		
        		String c = list.get(i);
        	}

        	if(list.size() == 0)
        		break;
        	if(list.size() == 1) {
        		return 0;
        	}
        }

        return answer;
    }
}