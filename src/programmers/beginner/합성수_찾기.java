package programmers.beginner;

public class 합성수_찾기 {
	public static void main(String[] args) {
		int n = 15;
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				count += (i	% j) == 0 ? 1 : 0;
			}
			answer += (count >= 3) ? 1 : 0;
		}
		
		System.out.println(answer);
		
	}
}
