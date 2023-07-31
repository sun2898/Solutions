package programmers.beginner;

import java.util.Arrays;

public class 최댓값_만들기_01 {

	public static void main(String[] args) {
		
		int[] numbers = {0, 31, 24, 10, 1, 9}; 
		
		Arrays.sort(numbers);
		
		int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
		
		System.out.println(answer);
		
	}
}
