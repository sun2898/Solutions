package programmers.beginner;

public class 피자_나눠_먹기_2 {
	public static void main(String[] args) {
		
		int n = 4;
		int answer = 0;
		
		int a = 1;
		while((6*a)%n!=0) {
			a += 1;
		}
		
		answer = a;
		
		System.out.println(answer);
	}	
}
