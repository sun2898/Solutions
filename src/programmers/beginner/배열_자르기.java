package programmers.beginner;

import java.util.Arrays;

public class 배열_자르기 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5}; 
		int num1 = 1;
		int num2 = 3;
		int[] answer = new int[num2 - num1 + 1];
		
		answer = Arrays.copyOfRange(numbers, num1, num2+1);
		
		System.out.println(Arrays.toString(answer));
		
		
	}
}
