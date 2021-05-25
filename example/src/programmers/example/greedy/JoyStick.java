package programmers.example.greedy;

public class JoyStick {

	public static void main(String[] args) {

		String name = "JAN";
		int answer = solution(name);
		
		System.out.println(answer);
	}
	
	private static int[] ARRAY = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,12,11,10,9,8,7,6,5,4,3,2,1};
	
	public static int solution(String name) {
		int answer = 0;
		char[] ch = name.toCharArray();
		
		answer = countStep(ch, 0);
		
		return answer;
	}
	
	public static int countStep(char[] ch , int position) {
		int answer = 0;
		
		if(position > 0 && position - ch.length == 0)
			return 0;

		if(position < 0 && position + ch.length == 0)
			return 0;
		
		if(position == 0) {
			int A = (int) (ch[position]-'A');
			int B = ARRAY[A];
			
			int C = B+countStep(ch, position+1);
			int D = B+countStep(ch, position-1);
			answer = C>D?D:C;
		}else if(position < 0) {
			int A = (int) (ch[ch.length+position]-'A');
			int B = ARRAY[A];
			
			return 1+B+countStep(ch, position-1);
		}else {
			int A = (int) (ch[position]-'A');
			int B = ARRAY[A];
			
			return 1+B+countStep(ch, position+1);
		}
		
		
		return answer;
	}
	

}
