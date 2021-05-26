package programmers.example.greedy;

public class JoyStick {

	public static void main(String[] args) {

		String name = "ZAAAZAAAAAA";
		int answer = solution(name);
		
		System.out.println(answer);
	}
	//							  A B C D E F G H I J K   L  M  N  O  P  Q R S T U V W X Y Z
	private static int[] ARRAY = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,12,11,10,9,8,7,6,5,4,3,2,1};
	
	public static int solution(String name) {
		int answer = 0;
		char[] ch = name.toCharArray();
		
		char[] cha = new char[ch.length];
		
		for(int i = 0 ; i < cha.length ; i++)
			cha[i] = 'A';
		
		answer = countStep(cha,ch, 0);
		
		return answer;
	}
	
	public static boolean compare(char[] A, char[] B) {
		if(A.length != B.length)
			return false;
		
		for(int i = 0 ; i < A.length ; i++) {
			if(A[i] != B[i])
				return false;
		}
		return true;
	}
	
	public static int countStep(char[] STR, char[] ch , int position) {
		int answer = 0;
		
		if( compare(STR,ch) )
			return 0;
		
		if(position > 0 && position >= ch.length )
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
			
			STR[ch.length+position] = ch[ch.length+position];
			
			return 1+B+countStep(STR, ch, position-1);
		}else {
			int A = (int) (ch[position]-'A');
			int B = ARRAY[A];
			
			STR[position] = ch[position];
			
			return 1+B+countStep(STR, ch, position+1);
		}
		
		
		return answer;
	}
	

}
