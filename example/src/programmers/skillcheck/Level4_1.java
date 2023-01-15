package programmers.skillcheck;

public class Level4_1 {

    public static void main(String[] args) {
        int[][] rc = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        String[] operations =  {"Rotate"};
        
        int[][] result = solution(rc, operations);
        
        print(result);
    }
    
    public static void print(int[][] result) {
        String s = "";
        for(int i = 0 ; i < result.length ; i++) {
            for (int j = 0 ; j < result[i].length ; j++) {
                s += result[i][j] + ",";
            }
            s += " | ";
        }
        System.out.println(s);
        System.out.println("========");
    }
    
    public static int[][] shiftRow(int[][] rc){
        int[][] answer = new int[rc.length][rc[0].length];
        
        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = rc[(i + rc.length-1) % (rc.length)];
        }
        
        return answer;
    }
    
    public static int[][] rotate(int[][] rc){
        int[][] answer = new int[rc.length][rc[0].length];
        
        for(int i = 0 ; i < rc.length ; i++) {
            for(int j = 0 ; j < rc[i].length ; j++) {
                if((j == rc[i].length-1) && i != rc.length-1) {
                    answer[i+1][j] = rc[i][j];
                }else if(i == rc.length-1 && j != 0) {
                    answer[i][j-1] = rc[i][j];
                }else if(j == 0 && i != 0) {
                    answer[i-1][j] = rc[i][j];
                }else if(i == 0 && j != rc[i].length-1) {
                    answer[i][j+1] = rc[i][j];
                }else {
                    answer[i][j] = rc[i][j];
                }
            }
        }
        
        return answer;
    }
    
    public static int[][] solution(int[][] rc, String[] operations) {
        int[][] answer = rc;
        
        for(int i = 0 ; i < operations.length ; i++) {
            if(operations[i] == "Rotate")
                answer = rotate(answer);
            else
                answer = shiftRow(answer);
            
        }
        
        return answer;
    }
}
