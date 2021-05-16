package programmers.example.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * @문제명 : 위장
 * @문제설명 : 스파이들은 매일 다른 옷을 조합하여 입어 자신을 위장합니다.
 * 예를 들어 스파이가 가진 옷이 아래와 같고 오늘 스파이가 동그란 안경, 긴 코트, 파란색 티셔츠를 입었다면 
 * 다음날은 청바지를 추가로 입거나 동그란 안경 대신 검정 선글라스를 착용하거나 해야 합니다.
 * 
 * @author kyoungtaekim
 *
 */

public class Camouflage {

	//[["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]
	public static String[][] values = {
			{"yellowhat", "headgear"}, 
			{"bluesunglasses", "eyewear"}, 
			{"green_turban", "face"},
//			{"crowmask","fase"},
			};
	
	public static void main(String[] args) {

		int v = solution(values);
		
		System.out.println(v);
		
	}

	public static HashMap<String, Integer> mMap = new HashMap<>();
	
	public static int solution(String[][] clothes) {
		int answer = 0;
		
		//Initializing
		for(int i = 0 ; i < clothes.length ; i++) {
			mMap.put(clothes[i][1], mMap.getOrDefault(clothes[i][1], 0)+1);
		}
		
		Set<String> keys = mMap.keySet();
		
		int keySize = keys.size();
		int[] arr = new int[keySize];
		Object[] keyArray = keys.toArray();
		for(int i = 0 ; i < keySize ; i++) {
			arr[i] = mMap.get(keyArray[i]);
		}
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(i == 0)
				answer += arr[i];
			else {
				answer += arr[i] + arr[i]*answer;
			}
		}
		
		
		return answer;
	}
	
}
