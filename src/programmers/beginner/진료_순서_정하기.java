package programmers.beginner;

import java.util.Arrays;
import java.util.Collections;

public class 진료_순서_정하기 {
	
	public static void main(String[] args) {
		
		int[] emergency = {30, 10, 23, 6, 100}; // 6, 10, 23, 30, 100
		int[] answer = new int[emergency.length];
		int[] copyEmer = Arrays.copyOf(emergency, emergency.length);
		Integer[] copy = Arrays.stream(copyEmer).boxed().toArray(Integer[]::new);
		Arrays.sort(copy, Collections.reverseOrder());
		

		for(int i = 0; i < emergency.length; i++) {
			for(int j = 0; j < emergency.length; j++) {
				if(emergency[i]==copy[j]) {
					answer[i] = j+1;
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
	
	
	}
}
