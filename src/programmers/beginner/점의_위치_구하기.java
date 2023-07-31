package programmers.beginner;

public class 점의_위치_구하기 {
	public static void main(String[] args) {
		
		int[] dot = {2, 4};
		int answer = 0;
		
		if(dot[0] > 0) {
			if(dot[1] > 0) {
				answer = 1;
			} else {
				answer = 4;
			}
		} else {
			if(dot[1] > 0) {
				answer = 2;
			} else {
				answer = 3;
			}
		}
		
		System.out.println(answer);
		
		
	}
	
}
