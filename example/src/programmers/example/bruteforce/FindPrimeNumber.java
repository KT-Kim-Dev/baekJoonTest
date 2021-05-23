package programmers.example.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "5430891";
		
		int answer = solution(numbers);
		System.out.println(answer);
		
	}

	public static List<Integer> list = new ArrayList<Integer>();
	
	public static int solution(String numbers) {
		String[] array = numbers.split("");
		Arrays.sort(array);

		if(array[0] == array[array.length - 1]){
            if(isPrimeNumber(Integer.parseInt(array[0]))) {
                return 1;
            }
            else {
                return 0;
            }
        }
		
        for(int slct = 1; slct <= array.length; slct++) {
            perm(array, 0, slct);	// 0 부터 시작해서 점차 증가.
        }
		
		return list.size();
	}

	private static void perm(String[] numArr, int dept, int slct) {
        if(dept == slct) {	// 해당 길이의 마지막 숫
            StringBuilder sum = new StringBuilder();	
            for(int sIdx = 0; sIdx < slct; sIdx++) {
                sum.append(numArr[sIdx]);
            }
            int number = Integer.parseInt(sum.toString());
            if(isPrimeNumber(number)) {
                if(!list.contains(number))
                    list.add(number);
            }
        }

        for(int pIdx = dept; pIdx < numArr.length; pIdx ++) {
            numArr = swap(numArr, pIdx, dept);	// 숫자 교체 해서 제귀함수 
            perm(numArr, dept + 1, slct);
            numArr = swap(numArr, pIdx, dept);

        }

    }
	
	private static String[] swap(String[] numArr, int pIdx, int dept) {
        String tmp = numArr[pIdx];
         numArr[pIdx] =  numArr[dept];
         numArr[dept] = tmp;

         return numArr;

    }
	
	public static boolean isPrimeNumber(int value) {
		double A = Math.sqrt((double) (value));
		int B = value, p=2;
		if (B == 1 || B == 0)	return false;
		while (p <= A) {
			if (B % p == 0)	return false;
			p++;
		}
		return true;
	}
	
}
