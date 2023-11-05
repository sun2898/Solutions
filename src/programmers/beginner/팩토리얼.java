package programmers.beginner;

public class 팩토리얼 {
	public static void main(String[] args) {
		
		int n = 7;
		int fac = 1;
		int answer = 1;
		while(fac <= n) {
			
			fac *= answer;
			if(fac > n) {
				break;
			} else {				
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
