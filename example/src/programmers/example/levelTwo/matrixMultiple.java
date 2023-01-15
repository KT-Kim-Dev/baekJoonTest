package programmers.example.levelTwo;

public class matrixMultiple {

    public static void main(String[] args) {

        int[][] arr1 = {{2,3,2}, {4,2,4}, {3,1,4}};
        int[][] arr2 = {{5,4,3}, {2,4,1}, {3,1,1}};
        
        int[][] result = solution(arr1, arr2);
        String s = "";
        for(int i = 0 ; i < result.length ; i++) {
            s += "[";
            for(int j = 0 ; j <result[i].length ; j++) {
                s += result[i][j];
                s += (j+1)==result[i].length ? "" : ",";
            }
            s += "]\n";
        }
        System.out.println(s);

    }
    
    static public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        int size = arr1[0].length;
        for(int i = 0 ; i < arr1.length*arr1[0].length ; i++) {
            int length = arr1[i/size].length;
            int sum = 0;
            for(int j = 0 ; j < length ; j++) {
                sum += arr1[i/size][j] * arr2[j][i%size];
            }
            answer[i/size][i%size] = sum;
        }
        
        return answer;
    }
}
