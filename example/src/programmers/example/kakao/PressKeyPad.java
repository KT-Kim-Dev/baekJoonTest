package programmers.example.kakao;

public class PressKeyPad {

	enum KEY {
		KEY_NUM_ONE(1, "L"),
		KEY_NUM_FOUR(4, "L"),
		KEY_NUM_SEVEN(7, "L"),
		KEY_NUM_THREE(3, "R"),
		KEY_NUM_SIX(6, "R"),
		KEY_NUM_NINE(9, "R");
		
		private int number;
		private String hand;
		
		private KEY(int number, String hand) {
			this.number = number;
			this.hand = hand;
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		String answer = solution(numbers, hand);
		
		System.out.println(answer);
	}
	
	
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        
        
        int lPosition = '*';
        int rPosition = '#';
        
        
        
        
        
        
        return answer;
    }

}
