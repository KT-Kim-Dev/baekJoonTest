package programmers.example.levelThree;

public class IntegerTriangle {

    public static void main(String[] args) {

       int[][] triangle = {
               {7}, 
               {3,8}, 
               {8,1,0}, 
               {2,7,4,4}, 
               {4,5,2,6,5}
               };
       
       int result = solution(triangle);
       
       System.out.println("result : " + result);
    }
    
    static public int solution(int[][] triangle) {
        for(int i = triangle.length-1 ; i >= 0 ; i--) {   
            for(int j = triangle[i].length-1 ; j > 0 ; j--) {
                int a = triangle[i][j];
                int b = triangle[i][j-1];
                triangle[i-1][j-1] += a > b ? a : b;
            }
        }
        return triangle[0][0];
    }

}
