package programmers.example.kakaointern;

public class PressedKeyPad {

	public static void main(String[] args) {

		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		String answer = solution(numbers, hand);
		System.out.println( answer );
		
	}

	public static class KeyPad {
		public int[][] num = {{3,1}, {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2} };
		public int[][] pad = {{1,2,3},{4,5,6},{7,8,9},{'*',0,'#'}};
		public int positionX;
		public int positionY;
		public boolean hand = false;
		
		public KeyPad(boolean hand) {
			if(hand) {
				positionX = 3;
				positionY = 0;
			}else {
				positionX = 3;
				positionY = 2;
			}
			System.out.println(pad[positionX][positionY]);
		}
		
		public int getNumPad() {
			return pad[positionX][positionY];
		}
		
		public int getMovingCnt(int pos) {
			int result = 0;
			
			if(hand) {
				if(pos == 1 || pos == 4 || pos == 7)
					return 0;
				
				
				
			}else {
				if(pos == 3 || pos == 6 || pos == 9)
					return 0;
				
				
			}
			
			return result;
		}
		
		public void setPosition(int position) {
			int[] a = num[position];
			positionX = a[0];
			positionY = a[1];
		}
	}
	
	public static String solution(int[] numbers, String hand) {
		String answer = "";
		
		
		return answer;
	}

}
