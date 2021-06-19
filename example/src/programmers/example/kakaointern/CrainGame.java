package programmers.example.kakaointern;

import java.util.Stack;

public class CrainGame {
	
	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int answer = solution(board, moves);
		
		System.out.println(answer);
		
	}
	
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> basket = new Stack<Integer>();
        
        for(int i = 0 ; i < moves.length ; i++) {
        	int a = moves[i];
        	
        	for(int j = 0 ; j < board.length ; j++) {
        		int get = board[j][a-1];
        		if(get != 0){
        			if(basket.size()==0) {
        				basket.push(get);
	        			board[j][a-1] = 0;
	        			j=board.length;
        			}else {
        				int pop = basket.pop();
            			if(pop == get) {
            				answer = answer + 2;
            			}else {
            				basket.push(pop);
            				basket.push(get);
            			}
            			board[j][a-1] = 0;
            			j=board.length;
        			}
        			
        		}
        		
        	}
        	
        }
        
        
        return answer;
    }
}
