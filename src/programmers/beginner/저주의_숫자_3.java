package programmers.beginner;

public class 저주의_숫자_3 {
	public static void main(String[] args) {
		
		int n = 40;
		int answer = 0;	
	
		for(int i = 1; i <= n; i++) {
			answer += 1;						
			if(Integer.toString(answer).contains("3") || answer % 3 == 0) {
				i--;
			}
		}
		
		System.out.println(answer);
	}
}
