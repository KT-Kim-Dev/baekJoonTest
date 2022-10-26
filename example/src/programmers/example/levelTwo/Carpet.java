package programmers.example.levelTwo;

public class Carpet {

    public static void main(String[] args) {
        int brown = 8;
        int yellow = 1;
        
        int[] result = solution(brown, yellow);
        
        System.out.println("[" + result[0] + "," + result[1]+"]");

    }
    public static int[] solution(int brown, int yellow) {
        int[] answer = {0,0};
        
        for(int i = 1 ; i <= yellow ; i++) {
            if(yellow % i != 0)
                continue;
            
            int width = yellow / i;
            
            if((width*2 + i*2 + 4) == brown) {
                answer[0] = width+2;
                answer[1] = i+2;
                break;
            }
        }
        
        
        
        return answer;
    }
}
