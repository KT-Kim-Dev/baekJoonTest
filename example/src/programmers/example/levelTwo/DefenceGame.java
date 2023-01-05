package programmers.example.levelTwo;

import java.util.PriorityQueue;

public class DefenceGame {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 7;
        int k = 3;
        int[] enemy = {4, 3, 4, 5, 3, 3, 1};
        
        int result = solution(n, k, enemy);
        
        System.out.println("result : " + result);
    }
    
    static public int solution(int n, int k, int[] enemy) {
        
        if(k >= enemy.length)
            return enemy.length;
        
       PriorityQueue<Integer> queue = new PriorityQueue();
       
       for(int i = 0 ; i < enemy.length ; i++) {
           
           queue.add(enemy[i]);
           
           if(queue.size() > k) {
               n -= queue.poll();
           }
               
           if(n < 0) {
               return i;
           }
       }
        
        return enemy.length;
    }   
}
