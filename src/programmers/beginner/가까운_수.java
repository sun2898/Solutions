package programmers.beginner;

import java.util.Arrays;

public class 가까운_수 {

	public static void main(String[] args) {
		
		int[] array = {23,2,8};
		int n = 5;
		int answer = 0;
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		for(int i = 0; i < array.length; i++) {
			if(i == 0) {
				if(n <= array[i]) {
					answer = array[i];
					break;
				} else if(n >= array[array.length-1]) {
					answer = array[array.length-1];
					break;
				}
			} else if(i > 0 && i < array.length){
				if(n >= array[i-1] && n <= array[i]) {
					if(Math.abs(n-array[i-1]) > Math.abs(n-array[i])) {
						answer = array[i];
						break;
					} else if (Math.abs(n-array[i-1]) <= Math.abs(n-array[i])) {
						answer = array[i-1];
						break;
					}
				}
			}
		}
 		
		System.out.println(answer);
		
	}
}
