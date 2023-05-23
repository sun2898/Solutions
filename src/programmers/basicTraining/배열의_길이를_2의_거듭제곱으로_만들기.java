package programmers.basicTraining;

import java.util.Arrays;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {

	public static void main(String[] args) {
		
		int[] arr = {58, 172, 746, 89};
		int n = 0;
		int i = 0;
		while(true) {
			if(Math.pow(2,i) >= arr.length) {
				n = (int)(Math.pow(2, i));
				break;
			} else {
				i++;
			}
		}
		
		int[] answer;
		
		if(n - arr.length == 0) {
			answer = arr;
			
		} else {
			answer = Arrays.copyOf(arr, n);
		}
		
		
	}
}
