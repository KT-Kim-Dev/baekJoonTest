package example;

import java.util.Arrays;

public class CountK {
	
	public static int[] array = {1, 5, 2, 6, 3, 7, 4};
	public static int[][] commands = { {2,5,3}, {4, 4, 1}, {1, 7, 3} };

	public static void main(String[] args) {
		int[] result = solution(array, commands);
		
		String str = "";
		for(int v : result) {
			str += " "+v;
		}
		System.out.println(str);
	}
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++){
            int[] com = commands[i];
            int[] subList = Arrays.copyOfRange(array, com[0]-1, com[1]);
            Arrays.sort(subList);
            answer[i] = subList[com[2]-1];
        }
        
        
        return answer;
    }
}
