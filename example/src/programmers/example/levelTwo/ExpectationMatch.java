package programmers.example.levelTwo;

public class ExpectationMatch {

   public static void main(String[] args) {
       int n = 8;
       int a = 4; 
       int b = 5;
       
       int result = solution(n, a, b);
       
       System.out.println("result : " + result);
       
   }

   public static int solution(int n, int a, int b)
   {
       int answer = 0;
       
       int c = a < b ? a : b;
       int d = a > b ? a : b;
       
      for(int i = 0 ; i < n ; i++) {
          if((d-1 == c) && c%2!=0) {
              answer++;
              break;
          }
          c = c/2 + c%2;
          d = d/2 + d%2;
          answer++;
      }
       
       return answer;
   }
}
