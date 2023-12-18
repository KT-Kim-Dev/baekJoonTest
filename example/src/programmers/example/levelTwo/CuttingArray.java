package programmers.example.levelTwo;

import java.util.ArrayList;

public class CuttingArray {

    public static void main(String[] args) {
        int n = 10000000;
        long left = 19999999, right = 10000020;
        
        int[] result = solution(n, left, right);
        
        
        String str = "";
        for(int i = 0 ; i < result.length ; i++) {
            str += result[i] + " ";
        }
        
        System.out.println("result : " + str);

    }
    public static int[] solution(int n, long left, long right) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = (int)(left/(long)n); i <= (int)(right/(long)n); i++) {
            for (int j = 0; j < n; j++) {
                
                if((i*n+j) < (int)left) continue;
                if((i*n+j) > (int)right) break;
//                if((i*n+j) > n*n-1) break;
                
                if (j >= i) {
                    list.add((j+1));
                } else {
                    list.add((i+1));
                }
            }
        }

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
