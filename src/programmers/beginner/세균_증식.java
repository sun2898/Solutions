package programmers.beginner;

public class 세균_증식 {
	
	public static void main(String[] args) {
		int n = 7;
		int t = 15;
		
		int answer = n;
		
		for(int i = 1; i <= t; i++) {
			answer *= 2;
		}
		
		System.out.println(answer);
	}
}
