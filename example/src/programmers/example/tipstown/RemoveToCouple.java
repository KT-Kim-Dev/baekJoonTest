package programmers.example.tipstown;

import java.util.ArrayList;
import java.util.List;

public class RemoveToCouple {
	
	public static void main(String[] args) {
		String s = "bbvvbbvvqbbvvbbqvvbbvvbbqvvbbvvqbbvvbbvv";
		
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
        	int cnt = list.size();
        	int i = 1;
        	while(i < list.size()) {
//        	for(int i = 1 ; i < list.size() ; i++) {
        		
        		String b = list.get(i-1);
        		String c = list.get(i);
        		if(b.equals(c)) {
        			list.remove(i);
        			list.remove(i-1);
        		}else {
        			i++;
        		}
        		
        	}
        	
        	if(list.size() == 0)
        		return 1;
        	if(list.size() == 1) {
        		return 0;
        	}
        	if(list.size() == cnt)
        		return 0;
        }

        return answer;
    }
}
