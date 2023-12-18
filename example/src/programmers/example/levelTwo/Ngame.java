package programmers.example.levelTwo;

public class Ngame {

    public static void main(String[] args) {    
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 2;
        String result = solution(n,t,m,p);
        
        System.out.println("result : " + result);
                
    }
    
    public static String getBinHex(int n, int number) {
        String result = "";

        if(n == 2)
            result = Integer.toBinaryString(number); //2진수
        else if(n == 8)
            result = Integer.toOctalString(number);   //8진수
        else if(n == 16) {
            result = Integer.toHexString(number);    
        }
        
        return result;
    }
    
    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        int cnt = 0;
        int number = 0;
        
        do{
            if((cnt%m) == 0 || (cnt%m)+p==p )// % p == 0)
                answer = answer + getBinHex(n, number);
            
            cnt++;
            number++;
        }while(answer.length() < t) ;
        
        return answer;
    }

}
