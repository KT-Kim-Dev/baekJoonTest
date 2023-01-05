package programmers.example.levelTwo;

public class matrixMultiple {

    public static void main(String[] args) {

        int[][] arr1 = {{1,4}, {3,2}, {4,1}};
        int[][] arr2 = {{3,3}, {3,3}};
        
        int[][] result = solution(arr1, arr2);
        String s = "[";
        for(int i = 0 ; i < result.length ; i++) {
            s += "[";
            for(int j = 0 ; j <result[i].length ; j++) {
                s += result[i][j] + ",";
            }
            s += "],";
        }

    }
    static public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        
        for(int i = 0 ; i < arr1.length ; i++) {
            
        }
        
        return answer;
    }
}
