package programmers.beginner;

public class 순서쌍의_개수 {
	public static void main(String[] args) {
		int n = 100;
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				answer += 1;
			}
		}
		
		System.out.println(answer);
		
	}
}
