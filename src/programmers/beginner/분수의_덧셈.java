package programmers.beginner;

import java.util.Arrays;

public class 분수의_덧셈 {
	
	public static void main(String[] args) {
		
		int numer1 = 10; //분자
		int denom1 = 2; //분모
		int numer2 = 3; //분자
		int denom2 = 3;	//분모
		int[] answer = new int[2];
		int n = 2;
		// result [5, 4]
		
		int max = Math.max(denom1, denom2);
		int min = Math.min(denom1, denom2);
		
		if(max % min == 0) {
			numer1 = numer1 * (max/min);
			denom2 = denom2 * (max/min);
			
			answer[0] = numer1 + numer2;
			answer[1] = max;
			
		} else {
			answer[0] = (numer1 * denom2) + (numer2 * denom1);
			answer[1] = max * min;
			
		}
		
		while(n <= Math.min(answer[0], answer[1])) {
			if(answer[0]%n == 0 && answer[1]%n == 0) {
				answer[0] = answer[0]/n;
				answer[1] = answer[1]/n;
			} else {
				n++;
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
}
