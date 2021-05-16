package programmers.example.hash;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @level 3
 * 
 * @name Best Album
 * 
 * @Contents 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 
 * 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 
 * 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
 * 
 * @author kyoungtaekim
 *
 */

public class BestAlbem {

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] genres = { "classic", "pop", "classic", "classic","jazz","pop", "Rock", "jazz" };
		int[] plays = { 500, 600, 150, 800, 1100, 2500, 100, 1000 };
		
		int[] answer = solution(genres, plays);
		
		try {
			bw.write("[");
			for(int i = 0 ; i < answer.length ; i++) {
				bw.write(""+answer[i]);
				if(i != answer.length-1) {
					bw.write(", ");
				}else {
					bw.write("]");
				}
			}
			bw.newLine();
			bw.flush();
			
		}catch(IOException e) {
			
		}
		
	}
	
	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = null;
		
		HashMap<String, Integer> sumMap = new HashMap<String, Integer>();
		HashMap<Integer, Integer> mapper = new HashMap<Integer, Integer>();
		
		for(int i = 0 ; i < genres.length ; i++) {
			sumMap.put(genres[i], sumMap.getOrDefault(genres[i], plays[i])+plays[i]);
			mapper.put(i, plays[i]);
		}
		
		List<Entry<String, Integer>> sumList = new ArrayList<Entry<String, Integer>>(sumMap.entrySet());
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer,Integer>>(mapper.entrySet());
		
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer,Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			};
		});
		
		Collections.sort(sumList, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String,Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			};
		});
		
		List<Integer> ans = new ArrayList<Integer>();
		
		for(Entry<String, Integer> sumEntry : sumList) {
			int count = 0;
			for(Entry<Integer, Integer> entry : list) {
				if(count > 1)
					break;
				if(sumEntry.getKey().equals(genres[entry.getKey()]) && count < 2) {
//					System.out.println("key : " + entry.getKey() + " value : " + entry.getValue());
					ans.add(entry.getKey());
					count++;
				}
			}
		}
		
		answer = new int[ans.size()];
		
		for(int i = 0 ; i < answer.length ; i++) {
			answer[i] = ans.get(i);
		}
		
		return answer;
	}

}
