package programmers.beginner;

public class 피자_나눠_먹기_3 {

	public static void main(String[] args) {
		
		int slice = 4; 
		int n = 12;
		
		int answer = 1;
		
		while(slice * answer < n) {
			
			answer += 1;
		}
		
		System.out.println(answer);
	}
}
