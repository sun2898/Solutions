package programmers.beginner;

public class 공_던지기 {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6}; 
		int k = 5;
		int answer = numbers[2 * (k-1) % numbers.length];
		int a = 6 % 5;
		
		System.out.println(answer);
		System.out.println(a);
		
	}
}
