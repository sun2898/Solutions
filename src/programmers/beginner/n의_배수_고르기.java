package programmers.beginner;

import java.util.Arrays;

public class n의_배수_고르기 {
	
	public static void main(String[] args) {
		
		int n = 12;
		int[] numlist = {2, 100, 120, 600, 12, 12};
		
		int[] answer = Arrays.stream(numlist).filter(a -> a%n == 0).toArray();
		
		System.out.println(Arrays.toString(answer));
		
		
		
		
		
		
	}
}
