package programmers.example.levelTwo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Tuples {

    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";

        int[] result = solution(s);
        System.out.println("result : " + result);

    }

    public static int[] solution(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        s = s.replaceAll("[^0-9,]", "");
        String[] str = s.split(",");

        for (int i = 0; i < str.length; i++) {
            int a = Integer.parseInt(str[i]);
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        
        int[] answer = new int[map.size()];
        
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        
        int i = 0;
        for(Map.Entry<Integer, Integer> entry : entryList){
            answer[i] = entry.getKey();
            i++;
        }
        
        return answer;
    }
}
