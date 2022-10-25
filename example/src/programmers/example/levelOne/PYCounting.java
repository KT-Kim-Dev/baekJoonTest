package programmers.example.levelOne;

public class PYCounting {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "pPoooyY";
        boolean result = solution(s);
        System.out.print(result);
    }
    static boolean solution(String s) {
        int iP = 0, iY = 0;
        
        char[] chars = s.toCharArray();
        
        for(int i = 0 ; i < chars.length ; i++) {
            if(chars[i] == 'p' || chars[i] == 'P') {
                iP++;
            }else if(chars[i] == 'y' || chars[i] == 'Y') {
                iY++;
            }
        }
        return iP==iY?true:false;
    }
}
