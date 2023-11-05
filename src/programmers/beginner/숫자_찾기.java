package programmers.beginner;

public class 숫자_찾기 {

	public static void main(String[] args) {
		
		int num = 29083;
		int k = 7;
		int answer = 0;
		String snum = num+"";
		
		
		answer = snum.indexOf(Integer.toString(k));
		
		if(answer == -1) {
			answer = -1;
		} else {
			answer += 1;
		}
			
		
		System.out.println(answer);
		
	}
}
