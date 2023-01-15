package programmers.example.levelThree;

public class CountDown {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int target = 46;
        
        int result[] = solution(target);
        
        System.out.println("result : " + result[0] + ", " + result[1]);
        
    }
    static public int[] solution(int target) {
        int[] answer = {0, 0};  // 최선의 경우 던질 다트 수와  그때의 싱글 or 불 맞춘 횟
        
        while(target > 0) {
            System.out.println("target : " + target);
            if(target >= 50) {
                target -= 50;
                answer[1]++;
            }else if(target <= 60 && target % 3 == 0) { // 트리플로 넣을 때
                target = 0;
            }else if(target <= 20) {
                target = 0;
                answer[1]++;
            }else if(target % 2 == 0 && target <= 40) { // 더블로 넣을 
                target = 0;
            }else {
                target -= 20;
                answer[1]++;
            }
            
            answer[0]++;
        }
        
        
        return answer;
    }
}
