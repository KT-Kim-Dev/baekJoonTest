package programmers.example.levelTwo;

public class RepeatBinary {

    public class Data {
        String s = "";
        int countZero = 0;
        
    }
    
	public static void main(String[] args) {

		String input = "110010101001";
		int[] answer = solution(input);
		
		for(int i = 0 ; i < answer.length ; i++) {
			System.out.print(answer[i] + " ");
		}
		
	}

	public static int[] solution(String s) {
		int[] answer = {0,0};
		int zero = 0, cnt = 0; 
		
		char[] arr = s.toCharArray();
		String sub = "";
		
		while(arr.length != 1) {
		    for(int i = 0 ; i < arr.length ; i++) {
		        if(arr[i] == '0') {
		            answer[1]++;
		        }else {
		            sub += "1";
		        }
		    }
		    arr = Integer.toBinaryString(sub.length()).toCharArray();
		    sub = "";
		    answer[0]++;
		}
//		if(s == '1') {
//			return 
//		}
//		removeZero(s);
		
		return answer;
	}
	
	public Data removeZero(Data data) {
	    Data result = new Data();
	    
	    for(int i = 0 ; i < data.s.length() ; i++) {
	        if(data.s.charAt(i) == '1') {
	            result.s += "1";
	        }else {
	            result.countZero++;
	        }
	    }
	    
	    
	    return result;
	}
	
}
