package programmers.example.levelOne;

public class SecretMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] result = solution(5, arr1, arr2);
        for(int i = 0 ; i < result.length ; i++)
            System.out.println(result[i]);

    }
    public static String toBinary(int n, int length)
    {
        StringBuilder binary = new StringBuilder();
        for (long i = (1L << length - 1); i > 0; i = i / 2) {
            binary.append((n & i) != 0 ? "1" : "0");
        }
        return binary.toString();
    }
    
    static public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = "";
        }
        
        for(int i = 0 ; i < n ; i++) {
            String bin1 = toBinary(arr1[i],n);
            String bin2 = toBinary(arr2[i],n);
            for(int j = 0 ; j < bin1.length(); j++) {
                if(bin1.charAt(j) == '0' && bin2.charAt(j) == '0') {
                    answer[i] += ' ';
                }else if(bin1.charAt(j) == '1' || bin2.charAt(j) == '1') {
                    answer[i] += '#';
                }
            }
        }
        
        
        return answer;
    }
}
