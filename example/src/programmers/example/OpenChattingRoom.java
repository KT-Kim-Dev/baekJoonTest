package programmers.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChattingRoom {
	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		String[] answer = solution(record);
		
		
		try {
			bw.write("[ ");
			for(String str : answer) {
				bw.write( str);
				bw.write(", ");
				
			}
			bw.write(" ]");
			bw.flush();
		}catch(IOException e) {}
		
	}
	
	public static String ENTER = "Enter";
	public static String LEAVE = "Leave";
	public static String CHANGE = "Change";
	
	public static String[] solution(String[] record) {
        Map<String, String> map = new HashMap<String, String>();
        List<String> list = new ArrayList<String>();
        
        for(String str : record) {
        	String[] com = str.split(" ");
        	if(!com[0].equals(LEAVE))
        		map.put(com[1], com[2]);
        }
        
        for(String str : record) {
        	String[] com = str.split(" ");
        	
        	if(com[0].equals(ENTER)) {
        		String value = map.get(com[1]) + "님이 들어왔습니다.";
        		list.add(value);
        	}else if(com[0].equals(LEAVE)) {
        		String value = map.get(com[1]) + "님이 나갔습니다.";
        		list.add(value);
        	}
        }
        
        String[] answer = new String[list.size()];
        
        for(int i = 0 ; i < answer.length ; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
