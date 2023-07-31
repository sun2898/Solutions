package programmers.beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최댓값_만들기 {

	public static void main(String[] args) {
		
		int[] numbers = {0, -31, 24, 10, 1, 9};
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				if(i != j) {
				list.add(numbers[i]*numbers[j]);
				}
			}
		}
		
		int answer = Collections.max(list);
		
		System.out.println(answer);
	}
}
